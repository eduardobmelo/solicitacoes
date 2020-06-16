/**
 * Modulo de controle dos relatorios.
 * 
 */

'use strict';

var relatControllers = angular.module('relatControllers', []);

relatControllers.controller('RelSolicPorColaboradorCtrl', [ '$scope', '$location', '$window', 'ColaboradorListIdNomeService', 'SituacaoSolicListService', 'PrioridadeListService', 'RelSolicPorColaboradorService', 
                                                            function($scope, $location, $window, ColaboradorListIdNomeService, SituacaoSolicListService, PrioridadeListService, RelSolicPorColaboradorService) {
	
	$scope.listaColaboradores = undefined;
	$scope.listaSituacoes = undefined;
	$scope.listaPrioridades = undefined;
	
	$scope.sucesso = false;
	$scope.temErro = false;
	$scope.mensagem = null;
	
	// Busca lista de prioridades
	PrioridadeListService.get(
		{},
		function success(response) {
			$scope.listaPrioridades = response;
		}, 
		function error(errorResponse) {
			console.log("Error:" + JSON.stringify(errorResponse));
			return;
		}
    );
	
	// Busca lista de colaboradores
	ColaboradorListIdNomeService.get(
		{},
		function success(response) {
			$scope.listaColaboradores = response;
		}, 
		function error(errorResponse) {
			console.log("Error:" + JSON.stringify(errorResponse));
			return;
		}
    );
	
	// Busca lista de situações
	SituacaoSolicListService.get(
		{},
		function success(response) {
			$scope.listaSituacoes = response;
		}, 
		function error(errorResponse) {
			console.log("Error:" + JSON.stringify(errorResponse));
			return;
		}
    );
	
	$scope.emitir = function() {
		var param = '?';
		var url = '/solicitacoes/services/relatorios/solicitacoes/por/colaborador';
		
		if ($scope.colaborador != "" && $scope.colaborador != undefined) {
			param += 'idColaborador=';
			param += $scope.colaborador;
		}
		
		if ($scope.prioridade != "" && $scope.prioridade != undefined) {
			if (param == '?') {
				param += 'idPrioridade=';
				param += $scope.prioridade;
			} else {
				param += '&idPrioridade=';
				param += $scope.prioridade;
			}
		}
		
		if ($scope.situacao != "" && $scope.situacao != undefined) {
			if (param == '?') {
				param += 'idSituacao=';
				param += $scope.situacao;
			} else {
				param += '&idSituacao=';
				param += $scope.situacao;
			}
		}
		
		if (param != '?')
			url += param;
		
		var filename = "SolicitacoesPorColaborador.pdf";
        var linkElement = document.createElement('a');
        
        try {
			linkElement.setAttribute('href', url);
            linkElement.setAttribute("download", filename);
            
            var clickEvent = new MouseEvent("click", {
                "view": window,
                "bubbles": true,
                "cancelable": false

            });

            linkElement.dispatchEvent(clickEvent);
        } catch (ex) {
        	console.log(ex);
        }
	}
	
} ]).controller('RelSolicPorClienteCtrl', [ '$scope', '$location', '$window', 'ClienteListIdNomeService', 'SituacaoSolicListService', 'PrioridadeListService', 'RelSolicPorColaboradorService', 
                                            function($scope, $location, $window, ClienteListIdNomeService, SituacaoSolicListService, PrioridadeListService, RelSolicPorColaboradorService) {
	
	$scope.listaClientes = undefined;
	$scope.listaSituacoes = undefined;
	$scope.listaPrioridades = undefined;
	
	$scope.sucesso = false;
	$scope.temErro = false;
	$scope.mensagem = null;
	
	// Busca lista de prioridades
	PrioridadeListService.get(
		{},
		function success(response) {
			$scope.listaPrioridades = response;
		}, 
		function error(errorResponse) {
			console.log("Error:" + JSON.stringify(errorResponse));
			return;
		}
    );
	
	// Busca lista de clientes
	ClienteListIdNomeService.get(
		{},
		function success(response) {
			$scope.listaClientes = response;
		}, 
		function error(errorResponse) {
			console.log("Error:" + JSON.stringify(errorResponse));
			return;
		}
    );
	
	// Busca lista de situações
	SituacaoSolicListService.get(
		{},
		function success(response) {
			$scope.listaSituacoes = response;
		}, 
		function error(errorResponse) {
			console.log("Error:" + JSON.stringify(errorResponse));
			return;
		}
    );
	
	$scope.emitir = function() {
		var param = '?';
		var url = '/solicitacoes/services/relatorios/solicitacoes/por/cliente';
		
		if ($scope.cliente != "" && $scope.cliente != undefined) {
			param += 'idCliente=';
			param += $scope.cliente;
		}
		
		if ($scope.prioridade != "" && $scope.prioridade != undefined) {
			if (param == '?') {
				param += 'idPrioridade=';
				param += $scope.prioridade;
			} else {
				param += '&idPrioridade=';
				param += $scope.prioridade;
			}
		}
		
		if ($scope.situacao != "" && $scope.situacao != undefined) {
			if (param == '?') {
				param += 'idSituacao=';
				param += $scope.situacao;
			} else {
				param += '&idSituacao=';
				param += $scope.situacao;
			}
		}
		
		if (param != '?')
			url += param;
		
		var filename = "SolicitacoesPorCliente.pdf";
        var linkElement = document.createElement('a');
        
        try {
			linkElement.setAttribute('href', url);
            linkElement.setAttribute("download", filename);
            
            var clickEvent = new MouseEvent("click", {
                "view": window,
                "bubbles": true,
                "cancelable": false

            });

            linkElement.dispatchEvent(clickEvent);
        } catch (ex) {
        	console.log(ex);
        }
		
	}
	
} ]);