/**
 * Modulo de controle do CRUD de usuario.
 * 
 */

'use strict';

var usuarioControllers = angular.module('usuarioControllers', []);

usuarioControllers.controller('UsuariosCtrl', [ '$scope', '$location', 'UsuarioListService', 'UsuarioCrudService', function($scope, $location, UsuarioListService, UsuarioCrudService) {
	
	$scope.idSelecionado = null;
	$scope.sucesso = false;
	$scope.listaUsuarios = {};
	$scope.temErro = false;
	$scope.mensagem = null;
	
	// Aciona a busca da lista de usuarios.
	buscarUsuarios();
	
	// Novo usuario.
	$scope.novo = function (id) {
        $location.path('/usuario/nova/false');
    };
    
	// Edita o usuario selecionada na lista.
    $scope.editar = function (id) {
        $location.path('/usuario/' + id+ '/false');
    };
    
    // Visualiza o usuario selecionado na lista.
    // Utiliza o mesmo form de edição. Apenas desabilita os componentes.
    $scope.visualizar = function (id) {
    	$location.path('/usuario/' + id + '/true');
    };
    
    // Exclui usuario selecionado.
    $scope.excluir = function() {
		
    	UsuarioCrudService.remove(
    			{id: $scope.idSelecionado},
    			function success(response) {
    				buscarUsuarios();
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
	
    
    // Aponta o usuario selecionado.
    $scope.selecionar = function (id) {
        $scope.idSelecionado = id;
    };
    
    // Busca os usuarios existentes.
    function buscarUsuarios() {
    	UsuarioListService.get(
			{},
			function success(response) {
				$scope.listaUsuarios = response;
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

.controller('UsuarioEdicaoCtrl', [ '$scope', '$routeParams', '$location', 'UsuarioCrudService', 'ColaboradorListIdNomeService', 'UsuarioPermissaoService', 'UsuarioPermissaoNovosPapeis', 'UsuarioNovaSenhaService',
    function($scope, $routeParams, $location, UsuarioCrudService, ColaboradorListIdNomeService, UsuarioPermissaoService, UsuarioPermissaoNovosPapeis, UsuarioNovaSenhaService) {
	
	var id = $routeParams.id;

	if ($routeParams.desabilitar == "true") {
		$scope.desabilitar = true;
	} else {
		$scope.desabilitar = false;
	}
	
	$scope.usuario = {};
	$scope.sucesso = false;
	$scope.temErro = false;
	$scope.mensagem = null;
	$scope.listaSituacao = [ { nome: "Ativo"}, { nome: "Inativo"} ];
	$scope.desabilitarSenha = false;
	
	$scope.listaColaboradores = ColaboradorListIdNomeService.get(
			function success(response) {
				return response;
			}, 
			function error(errorResponse) {
				console.log("Error:" + JSON.stringify(errorResponse));
				return;
			});
	
	// ID informado, inicia a busca do usuario.
	// Senao, considera novo cadastro.
	if (id != "nova") {
		$scope.desabilitarSenha = true;
		$scope.desabilitarAlterarSenha = false;
		$scope.desabilitarSalvarSenha = true;
		
		// Busca o usuario, papeis e permissoes.
		buscarUsuario(id);
	} else {
		$scope.desabilitarSenha = false;
		$scope.desabilitarAlterarSenha = true;
		$scope.desabilitarSalvarSenha = true;
		$scope.usuario.situacao = "Ativo"
		$scope.usuario.dataCadastro = new Date();
	}
	
	// Volta para a lista
	$scope.retornar = function() {
		$location.path('/usuarios');
	};
	
	// Salva a usuario.
	$scope.salvar = function(retornar) {
		$scope.mensagem = "";
		$scope.sucesso = false;
		
		// Formulario nao valido, cancela operacao
		$scope.temErro = !$scope.usuarioForm.$valid;
		if ($scope.temErro == true) {
			// Monta mensagem de erro
			verificarCampos();
			
			return;
		}
		
		if ($scope.usuario.senha != $scope.usuario.senha2) {
			$scope.mensagem = "Confirmação de senha não confere.";
			$scope.temErro = true;
			return;
		}
		
		if ($scope.usuario.id == null) {
			UsuarioCrudService.save(
					$scope.usuario,
					function success(response) {
						$scope.usuario = response;
						
						if ($scope.usuario.dataCadastro) {
							$scope.usuario.dataCadastro = new Date($scope.usuario.dataCadastro);
						}
						
						$scope.sucesso = true;
						$scope.temErro = false;
					}, 
					function error(errorResponse) {
						console.log("Error:" + JSON.stringify(errorResponse));
						return;
					});
		} else {
			UsuarioCrudService.update(
					$scope.usuario,
					function success(response) {
						$scope.usuario = response;
						
						if ($scope.usuario.dataCadastro) {
							$scope.usuario.dataCadastro = new Date($scope.usuario.dataCadastro);
						}
						
						$scope.sucesso = true;
						$scope.temErro = false;
					}, 
					function error(errorResponse) {
						console.log("Error:" + JSON.stringify(errorResponse));
						$scope.mensagem = errorResponse.data;
	    				$scope.temErro = true;
						return;
					});
		};
		
		// Retorna para lista caso verdadeiro
		if (retornar == true) {
			$location.path('/usuarios');
		}
		
	};
	
	$scope.habilitarSenha = function() {
		$scope.desabilitar = true;
		$scope.desabilitarSenha = false;
		$scope.desabilitarAlterarSenha = true;
		$scope.desabilitarSalvarSenha = false;
		$scope.usuario.senha = "";
		$scope.usuario.senha2 = "";
	};
	
	// Salva nova senha informada
	$scope.salvarSenha = function() {
		if ($scope.usuario.senha == "" || $scope.usuario.senha2 == "") {
			$scope.mensagem = "Preencha os campos: Senha e Confirmar Senha.";
			$scope.temErro = true;
			return;
		}
		
		if ($scope.usuario.senha != $scope.usuario.senha2) {
			$scope.mensagem = "Confirmação de senha não confere.";
			$scope.temErro = true;
			return;
		}
		
		var postData = {
				"id": $scope.usuario.id,
				"senha": $scope.usuario.senha
		};
		
		UsuarioNovaSenhaService.save(
				postData,
			function success(response) {
				$scope.usuario = response;
				$scope.sucesso = true;
				$scope.mensagem = "Senha alterada com sucesso.";
				$scope.desabilitarSenha = true;
				$scope.desabilitarAlterarSenha = false;
				$scope.desabilitarSalvarSenha = true;
				$scope.desabilitar = false;
			}, 
			function error(errorResponse) {
				console.log("Error:" + JSON.stringify(errorResponse));
				return;
			});
	};
	
	// Busca os dados da usuario
	function buscarUsuario(id) {
		UsuarioCrudService.get(
				{id: id},
				function success(response) {
					$scope.usuario = response;
					
					if ($scope.usuario.dataCadastro) {
						$scope.usuario.dataCadastro = new Date($scope.usuario.dataCadastro);
					}
					
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
		UsuarioPermissaoService.update(
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
	
	// Verifica preenchimento dos campos obrigatorios.
	function verificarCampos() {
		$scope.mensagem = "";
		
		if ($scope.usuarioForm.login.$error.required) {
			$scope.mensagem += "Nome do usuário é requerido. ";
		}
		
		if ($scope.usuarioForm.senha.$error.required) {
			$scope.mensagem += "Senha é requerida. ";
		}
		
		if ($scope.usuarioForm.senha2.$error.required) {
			$scope.mensagem += "Confirma senha é requerida. ";
		}
		
		if ($scope.usuarioForm.dataCadastro.$error.required) {
			$scope.mensagem += "Data de cadastro é requerido. "; 
		}
		
		if ($scope.usuarioForm.situacao.$error.required) {
			$scope.mensagem += "Situação é requerido. "; 
		}
		
		if ($scope.usuarioForm.colaborador.$error.required) {
			$scope.mensagem += "Colaborador é requerido. "; 
		}
	};
	
} ])

.controller('UsuarioSenhaCtrl', [ '$scope', '$routeParams', '$location', 'NovaSenhaService', 'getUsername', 'getRemember',
    function($scope, $routeParams, $location, NovaSenhaService, getUsername, getRemember) {
	
	var id = $routeParams.id;
	
	$scope.senhaAtual = undefined;
	$scope.senha = undefined;
	$scope.senha2 = undefined;
	
	$scope.sucesso = false;
	$scope.temErro = false;
	$scope.mensagem = null;
	
	// Salva a nova senha.
	$scope.salvar = function() {
		// Formulario nao valido, cancela operacao
		$scope.temErro = !$scope.usuarioForm.$valid;
		if ($scope.temErro == true) {
			// Monta mensagem de erro
			verificarCampos();
			
			return;
		}
		
		if ($scope.senhaAtual == $scope.senha) {
			$scope.mensagem = "Senha atual igual a nova senha.";
			$scope.temErro = true;
			return;
		}
		
		if ($scope.senha != $scope.senha2) {
			$scope.mensagem = "Confirmação de senha não confere.";
			$scope.temErro = true;
			return;
		}
		
		var nomeUsuario = getUsername();
		var relembrar = getRemember();
		
		var postData = {
				"username": nomeUsuario,
				"password": $scope.senhaAtual,
				"passwordNew": $scope.senha
		};
		
		NovaSenhaService.save(
				postData,
			function success(response) {
				if (response.authenticated) {
					$scope.sucesso = true;
					$scope.temErro = false;
					setCreds(nomeUsuario, response.senha, relembrar, response.uid, response.cid);
				} else {
					$scope.temErro = true;
					$scope.mensagem = "Falha na alteração. Verifique a senha atual informada.";
				}
			}, 
			function error(errorResponse) {
				console.log("Error:" + JSON.stringify(errorResponse));
				return;
			});
		
	};
	
	// Verifica preenchimento dos campos obrigatorios.
	function verificarCampos() {
		$scope.mensagem = "";
		
		if ($scope.usuarioForm.senhaAtual.$error.required) {
			$scope.mensagem += "Senha atual é requerida. ";
		}
		
		if ($scope.usuarioForm.senha.$error.required) {
			$scope.mensagem += "Senha é requerida. ";
		}
		
		if ($scope.usuarioForm.senha2.$error.required) {
			$scope.mensagem += "Confirma senha é requerida. ";
		}
	};
	
} ]);