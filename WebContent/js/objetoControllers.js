/**
 * Módulo de controle do CRUD dos objetos de seguranca.
 * 
 */

'use strict';

var objetoControllers = angular.module('objetoControllers', []);

objetoControllers.controller('ObjetosCtrl', [ '$scope', '$location', 'ObjetoListService', function($scope, $location, ObjetoListService) {
	
	$scope.idSelecionado = null;
	$scope.sucesso = false;
	$scope.listaObjetos = function buscarSolicitacoes() {
    	ObjetoListService.get(
			{},
			function success(response) {
				$scope.listaSolicitacoes = response;
			}, 
			function error(errorResponse) {
				console.log("Error:" + JSON.stringify(errorResponse));
				return;
			}
    	);
    };
} ]);