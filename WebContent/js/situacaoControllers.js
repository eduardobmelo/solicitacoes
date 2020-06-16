/**
 * Modulo de controle do CRUD de situacoes da soliciatacao.
 * 
 */

'use strict';

var situacaoControllers = angular.module('situacaoControllers', []);

situacaoControllers.controller('SituacoesCtrl', [ '$scope', '$location', 'SituacaoSolicListService', 'SituacaoSolicCrudService', function($scope, $location, SituacaoSolicListService, SituacaoSolicCrudService) {
	
	$scope.idSelecionado = null;
	$scope.sucesso = false;
	$scope.listaSituacoes = {};
	$scope.temErro = false;
	$scope.mensagem = null;
	
	// Aciona a busca da lista de situacoes.
	buscarSituacoes();
	
	// Nova situacao.
	$scope.novo = function (id) {
        $location.path('/situacao/nova/false');
    };
    
	// Edita a situacao selecionada na lista.
    $scope.editar = function (id) {
        $location.path('/situacao/' + id+ '/false');
    };
    
    // Visualiza a situacao selecionada na lista.
    // Utiliza o mesmo form de edição. Apenas desabilita os componentes.
    $scope.visualizar = function (id) {
    	$location.path('/situacao/' + id + '/true');
    };
    
    // Exclui situacao selecionada
    $scope.excluir = function() {
		
    	SituacaoSolicCrudService.remove(
    			{id: $scope.idSelecionado},
    			function success(response) {
    				buscarSituacoes();
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
    function buscarSituacoes() {
    	SituacaoSolicListService.get(
			{},
			function success(response) {
				$scope.listaSituacoes = response;
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

.controller('SituacaoEdicaoCtrl', [ '$scope', '$routeParams', '$location', 'SituacaoSolicCrudService',
    function($scope, $routeParams, $location, SituacaoSolicCrudService) {
	
	var id = $routeParams.id;

	if ($routeParams.desabilitar == "true") {
		$scope.desabilitar = true;
	} else {
		$scope.desabilitar = false;
	}
	
	$scope.situacao = {};
	$scope.sucesso = false;
	$scope.temErro = false;
	$scope.mensagem = null;
	
	// ID informado, inicia a busca da situacao.
	// Senao, considera novo cadastro.
	if (id != "nova") {
		buscarSituacao(id);
	}
	
	// Volta para a lista
	$scope.retornar = function() {
		$location.path('/situacoes');
	};
	
	// Salva a situacao.
	$scope.salvar = function(retornar) {
		
		// Formulario nao valido, cancela operacao
		$scope.temErro = !$scope.situacaoForm.$valid;
		if ($scope.temErro == true) {
			// Monta mensagem de erro
			verificarCampos();
			
			return;
		}
		
		if ($scope.situacao.id == null) {
			SituacaoSolicCrudService.save(
					$scope.situacao,
					function success(response) {
						$scope.situacao = response;
						$scope.sucesso = true;
						$scope.temErro = false;
					}, 
					function error(errorResponse) {
						console.log("Error:" + JSON.stringify(errorResponse));
						$scope.mensagem = errorResponse.status + ' - ' + errorResponse.statusText;
	    				$scope.temErro = true;
						return;
					});
		} else {
			SituacaoSolicCrudService.update(
					$scope.situacao,
					function success(response) {
						$scope.situacao = response;
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
			$location.path('/situacoes');
		}
		
	};
	
	// Busca os dados da situacao
	function buscarSituacao(id) {
		SituacaoSolicCrudService.get(
				{id: id},
				function success(response) {
					$scope.situacao = response;
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
		
		if ($scope.situacaoForm.descricao.$error.required) {
			$scope.mensagem += "Descrição é requerida. ";
		}
	};
	
} ]);