/**
 * Modulo de controle do CRUD de papel de seguranca.
 * 
 */

'use strict';

var papelControllers = angular.module('papelControllers', []);

papelControllers.controller('PapeisCtrl', [ '$scope', '$location', 'PapelListService', 'PapelCrudService', function($scope, $location, PapelListService, PapelCrudService) {
	
	$scope.idSelecionado = null;
	$scope.sucesso = false;
	$scope.listaPapeis = {};
	$scope.temErro = false;
	$scope.mensagem = null;
	
	// Aciona a busca da lista de papeis.
	buscarPapeis();
	
	// Nova papel.
	$scope.novo = function (id) {
        $location.path('/papel/nova/false');
    };
    
	// Edita a papel selecionada na lista.
    $scope.editar = function (id) {
        $location.path('/papel/' + id+ '/false');
    };
    
    // Visualiza a papel selecionada na lista.
    // Utiliza o mesmo form de edição. Apenas desabilita os componentes.
    $scope.visualizar = function (id) {
    	$location.path('/papel/' + id + '/true');
    };
    
    // Exclui papel selecionada
    $scope.excluir = function() {
		
    	PapelCrudService.remove(
    			{id: $scope.idSelecionado},
    			function success(response) {
    				buscarPapeis();
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
    function buscarPapeis() {
    	PapelListService.get(
			{},
			function success(response) {
				$scope.listaPapeis = response;
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

.controller('PapelEdicaoCtrl', [ '$scope', '$routeParams', '$location', 'PapelCrudService', 'PapelPermissaoCrudService',
    function($scope, $routeParams, $location, PapelCrudService, PapelPermissaoCrudService) {
	
	var id = $routeParams.id;

	if ($routeParams.desabilitar == "true") {
		$scope.desabilitar = true;
	} else {
		$scope.desabilitar = false;
	}
	
	$scope.papel = {};
	$scope.sucesso = false;
	$scope.temErro = false;
	$scope.mensagem = null;
	
	// ID informado, inicia a busca da papel.
	// Senao, considera novo cadastro.
	if (id != "nova") {
		buscarPapel(id);
	}
	
	// Volta para a lista
	$scope.retornar = function() {
		$location.path('/papeis');
	};
	
	// Salva a papel.
	$scope.salvar = function(retornar) {
		
		// Formulario nao valido, cancela operacao
		$scope.temErro = !$scope.papelForm.$valid;
		if ($scope.temErro == true) {
			// Monta mensagem de erro
			verificarCampos();
			
			return;
		}
		
		if ($scope.papel.id == null) {
			PapelCrudService.save(
					$scope.papel,
					function success(response) {
						$scope.papel = response;
						$scope.sucesso = true;
						$scope.temErro = false;
					}, 
					function error(errorResponse) {
						console.log("Error:" + JSON.stringify(errorResponse));
						return;
					});
		} else {
			PapelCrudService.update(
					$scope.papel,
					function success(response) {
						$scope.papel = response;
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
			$location.path('/papeis');
		}
		
	};
	
	// Busca os dados da papel
	function buscarPapel(id) {
		PapelCrudService.get(
				{id: id},
				function success(response) {
					$scope.papel = response;
					$scope.temErro = false;
				}, 
				function error(errorResponse) {
					console.log("Error:" + JSON.stringify(errorResponse));
					$scope.mensagem = errorResponse.status + ' - ' + errorResponse.statusText;
    				$scope.temErro = true;
					return;
				});
		
	};
	
	// Atualiza permissao
	$scope.permitir = function(permissao) {
		PapelPermissaoCrudService.update(
				permissao,
				function success() {
					$scope.temErro = false;
				}, 
				function error(errorResponse) {
					console.log("Error:" + JSON.stringify(errorResponse));
					$scope.mensagem = errorResponse.status + ' - ' + errorResponse.statusText;
    				$scope.temErro = true;
					return;
				});
	}
	
	function verificarCampos() {
		$scope.mensagem = "";
		
		if ($scope.papelForm.descricao.$error.required) {
			$scope.mensagem += "Descrição é requerida. ";
		}
	};
	
} ]);