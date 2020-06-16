/**
 * Modulo de controle do CRUD de prioridades da soliciatacao.
 * 
 */

'use strict';

var prioridadeControllers = angular.module('prioridadeControllers', []);

prioridadeControllers.controller('PrioridadesCtrl', [ '$scope', '$location', 'PrioridadeListService', 'PrioridadeCrudService', function($scope, $location, PrioridadeListService, PrioridadeCrudService) {
	
	$scope.idSelecionado = null;
	$scope.sucesso = false;
	$scope.listaPrioridades = {};
	$scope.temErro = false;
	$scope.mensagem = null;
	
	// Aciona a busca da lista de prioridades.
	buscarPrioridades();
	
	// Nova prioridade.
	$scope.novo = function (id) {
        $location.path('/prioridade/nova/false');
    };
    
	// Edita a prioridade selecionada na lista.
    $scope.editar = function (id) {
        $location.path('/prioridade/' + id+ '/false');
    };
    
    // Visualiza a prioridade selecionada na lista.
    // Utiliza o mesmo form de edição. Apenas desabilita os componentes.
    $scope.visualizar = function (id) {
    	$location.path('/prioridade/' + id + '/true');
    };
    
    // Exclui prioridade selecionada
    $scope.excluir = function() {
		
    	PrioridadeCrudService.remove(
    			{id: $scope.idSelecionado},
    			function success(response) {
    				buscarPrioridades();
    				$scope.sucesso = true;
    				$scope.temErro = false;
    				$scope.idSelecionado = null;
    				return;
    			}, 
    			function error(errorResponse) {
    				console.log("Error:" + JSON.stringify(errorResponse));
    				$scope.mensagem = errorResponse.status + ' - ' + errorResponse.statusText;
    				$scope.temErro = true;
    				return;
    			});
    }
	
    
    // Aponta a solicitação selecionada.
    $scope.selecionar = function (id) {
        $scope.idSelecionado = id;
    };
    
    // Busca as solicitações existentes.
    function buscarPrioridades() {
    	PrioridadeListService.get(
			{},
			function success(response) {
				$scope.listaPrioridades = response;
				$scope.temErro = false;
			}, 
			function error(errorResponse) {
				console.log("Error:" + JSON.stringify(errorResponse));
				$scope.mensagem = errorResponse.status + ' - ' + errorResponse.statusText;
				$scope.temErro = true;
				return;
			}
    	);
    };
	
} ])

.controller('PrioridadeEdicaoCtrl', [ '$scope', '$routeParams', '$location', 'PrioridadeCrudService',
    function($scope, $routeParams, $location, PrioridadeCrudService) {
	
	var id = $routeParams.id;

	if ($routeParams.desabilitar == "true") {
		$scope.desabilitar = true;
	} else {
		$scope.desabilitar = false;
	}
	
	$scope.prioridade = {};
	$scope.sucesso = false;
	$scope.temErro = false;
	$scope.mensagem = null;
	$scope.listaNiveis = [{id: '4', descricao: 'Baixa'}, {id: '3', descricao: 'Media'}, {id: '2', descricao: 'Alta'}, {id: '1', descricao: 'Urgente'} ];
	
	// ID informado, inicia a busca da prioridade.
	// Senao, considera novo cadastro.
	if (id != "nova") {
		buscarPrioridade(id);
	}
	
	// Volta para a lista
	$scope.retornar = function() {
		$location.path('/prioridades');
	};
	
	// Salva a prioridade.
	$scope.salvar = function(retornar) {
		
		// Formulario nao valido, cancela operacao
		$scope.temErro = !$scope.prioridadeForm.$valid;
		if ($scope.temErro == true) {
			// Monta mensagem de erro
			verificarCampos();
			
			return;
		}
		
		if ($scope.prioridade.id == null) {
			PrioridadeCrudService.save(
					$scope.prioridade,
					function success(response) {
						$scope.prioridade = response;
						$scope.sucesso = true;
						$scope.temErro = false;
					}, 
					function error(errorResponse) {
						console.log("Error:" + JSON.stringify(errorResponse));
						return;
					});
		} else {
			PrioridadeCrudService.update(
					$scope.prioridade,
					function success(response) {
						$scope.prioridade = response;
						$scope.sucesso = true;
						$scope.temErro = false;
					}, 
					function error(errorResponse) {
						console.log("Error:" + JSON.stringify(errorResponse));
						$scope.mensagem = errorResponse.status + ' - ' + errorResponse.statusText;
	    				$scope.temErro = true;
						return;
					});
		};
		
		// Retorna para lista caso verdadeiro
		if (retornar == true) {
			$location.path('/prioridades');
		}
		
	};
	
	// Busca os dados da prioridade
	function buscarPrioridade(id) {
		PrioridadeCrudService.get(
				{id: id},
				function success(response) {
					$scope.prioridade = response;
					$scope.temErro = false;
				}, 
				function error(errorResponse) {
					console.log("Error:" + JSON.stringify(errorResponse));
					$scope.mensagem = errorResponse.status + ' - ' + errorResponse.statusText;
    				$scope.temErro = true;
					return;
				});
		
	};
	
	function verificarCampos() {
		$scope.mensagem = "";
		
		if ($scope.prioridadeForm.descricao.$error.required) {
			$scope.mensagem += "Descrição é requerida. ";
		}
		
		if ($scope.prioridadeForm.nivel.$error.required) {
			$scope.mensagem += "Nível da prioridade é requerida. ";
		}
	};
	
} ]);