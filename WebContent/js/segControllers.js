/**
 * Módulo de controle de autenticacao.
 * 
 */

'use strict';

var segControllers = angular.module('segControllers', []);

segControllers.controller('LoginCtrl', [ '$scope', '$location', 'Login', 'setCreds', 'getUsername', 'getRemember', 'getToken', 'CredencialService', 'PermissaoUsuarioService', 
                                         function LoginCtrl($scope, $location, Login, setCreds, getUsername, getRemember, getToken, CredencialService, PermissaoUsuarioService) {
	
	$scope.senha = "";
	$scope.relembrar = getRemember();
	$scope.loading = false;
	
	if ($scope.relembrar) {
		$scope.nomeUsuario = getUsername();
	}
	
	$scope.mostrarSenha = function() {
		var x = document.getElementById("pwd");
		
		if (x.type === "password") {
			x.type = "text";
		} else {
			x.type = "password";
		}
	};
	
	$scope.submit = function() {
		$scope.temErro = false;
		$scope.mensagem = "";
		$scope.loading = true;
		
		var postData = {
				"username": $scope.nomeUsuario,
				"password": $scope.senha
		};
		
		Login.login(postData, 
				function success(response) {
					if (response.authenticated) {
						setCreds($scope.nomeUsuario, response.token, $scope.relembrar, response.uid, response.cid);
						window.location.href = "partials/principal.html";
						
					} else {
						$scope.temErro = true;
						$scope.loading = false;
						$scope.mensagem = "Falha na identificação.";
					}
				},
				function error(errorResponse) {
					$scope.temErro = true;
					$scope.loading = false;
					$scope.mensagem = JSON.stringify(errorResponse);
					console.log("Error: " + JSON.stringify(errorResponse));
				}
		);
	};
}]);

//Diretiva para apresentar div contendo GIF "carregando..."
segControllers.directive('loading', function () {
    return {
      restrict: 'AE',
      link: function (scope, element, attr) {
            scope.$watch('loading', function (val) {
                if (val) 
                    $(element).modal('show');
                else
                    $(element).modal('hide');
            });
      }
    }
});