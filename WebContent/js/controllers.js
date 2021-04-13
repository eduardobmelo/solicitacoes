'use strict';

var solservControllers = angular.module('solservControllers', []);

solservControllers.controller('PrincipalCtrl', ['$scope', '$location', '$interval', 'deleteCreds', 'getUid', 'getCid', 'getUsername', 'getToken', '$route', 'SolicitacaoPainelListService', 'CredencialService', 'PermissoesService',
    function($scope, $location, $interval, deleteCreds, getUid, getCid, getUsername, getToken, $route, SolicitacaoPainelListService, CredencialService, PermissoesService) {
	
	$scope.listaTarefas = undefined;
	$scope.quantTarefas = 0;
	$scope.loading = true;
	$scope.un = undefined;
	$scope.cid = 0;
	
	var uid = getUid();
	if (uid == undefined || uid == "") {
		window.location.href = "partials/login.html";
	}
	
	var un = getUsername();
	var token = getToken();
	var cid = getCid();
	
	var postData = {
			"username": un,
			"token": token
	};
	
	$scope.un = un;
	$scope.cid = cid;
	
	CredencialService.verifica(postData, function(token) {
		if (token.authenticated == undefined || token.authenticated == false) {
			$scope.loading = false;
			window.location.href = "partials/login.html";
		}
		
		$scope.permissoes = PermissoesService.get({uid:uid}, function(perm) {
			$scope.loading = false;
			return perm;
		});
		
		var cid = getCid();
		
		if (uid !== undefined && uid !== "") {
			listarTarefas(cid);
			
			var intervalo = $interval(function() {
				listarTarefas(cid);
			}.bind(this), 180000);
			
			$scope.$on('$destroy', function () {
		        $interval.cancel(intervalo)
		    });
			
		}
	});
	
	$scope.logout = function() {
		deleteCreds();
		window.location.href = "partials/login.html";	
	}
	
	$scope.classeTarefa = function(execucao) {
		if (execucao == "0" || execucao == "10" || execucao == "20" || execucao == "30") {
			return "progress-bar progress-bar-danger";
		} else if (execucao == "40" || execucao == "50" || execucao == "60") {
			return "progress-bar progress-bar-warning";
		} if (execucao == "70" || execucao == "80" || execucao == "90") {
			return "progress-bar progress-bar-info";
		} if (execucao == "100") {
			return "progress-bar progress-bar-success";
		} 
	}
	
	// Edita a solicitação selecionada na lista.
    $scope.editar = function (id) {
        $location.path('/solicitacao/' + id+ '/false');
    };
	
	function listarTarefas(uid) {
		if (uid == undefined) {
			return;
		}
		
		SolicitacaoPainelListService.get(
				{id: uid},
				function success(response) {
					$scope.listaTarefas = response;
					$scope.quantTarefas = $scope.listaTarefas.length;
					return;
				}, 
				function error(errorResponse) {
					console.log("Error: " + errorResponse.data.title);
					return;
				});
	}
} ])

.controller('ClientesCtrl', [ '$scope', '$location', 'ClienteListService', 'ClienteCrudService', function($scope, $location, ClienteListService, ClienteCrudService) {
	
	$scope.nomeSelecionado = null;
	$scope.idSelecionado = null;
	$scope.sucesso = false;
	$scope.clientesList = [];
	$scope.loading = true;
	
	buscarClientes();
	
	// Novo cliente
	$scope.novo = function (id) {
        $location.path('/novoCliente');
    };
    
	// Edita o cliente selecionado na lista.
    $scope.editarCliente = function (id) {
        $location.path('/editarCliente/' + id + '/false');
    };
    
    // Visualiza o cliente selecionado na lista.
    // Utiliza o mesmo form de edicao. Apenas desabilita os componentes.
    $scope.visualizarCliente = function (id) {
        $location.path('/editarCliente/' + id + '/true');
    };
    
    // Exclui o cliente selecionado na lista:
    $scope.excluirCliente = function () {
    	ClienteCrudService.remove(
			{id: $scope.idSelecionado},
			function success(response) {
				buscarClientes();
				$scope.sucesso = true;
				return;
			}, 
			function error(errorResponse) {
				console.log("Error:" + JSON.stringify(errorResponse));
				return;
			});
    };
    
    // Apontar cliente selecionado
    $scope.clienteSelecionado = function (nome, id) {
        $scope.nomeSelecionado = nome;
        $scope.idSelecionado = id;
    };
    
    function buscarClientes() {
    	ClienteListService.get(
			{},
			function success(response) {
				$scope.loading = false;
				$scope.clientesList = response;
			}, 
			function error(errorResponse) {
				$scope.loading = false;
				console.log("Error:" + JSON.stringify(errorResponse));
				return;
			}
    	);
    };
	
} ])

.controller('ClienteNovoCtrl', [ '$scope', '$routeParams', '$location','ClienteCrudService', 'EstadoListService', 'MunicipioListService', 'CepService',
    function($scope, $routeParams, $location, ClienteCrudService, EstadoListService, MunicipioListService, CepService) {
	
	if ($routeParams.desabilitar == "true") {
		$scope.desabilitar = true;
	} else {
		$scope.desabilitar = false;
	}
	
	$scope.cliente = null;
	$scope.tipoPessoaLista = [ { nome: "Física"}, { nome: "Jurídica"} ];
	$scope.temErro = false;
	$scope.sucesso = false;
	$scope.listaEstados = null;
	$scope.listaMunicipios = null;
	$scope.uf = null;
	
	// Busca lista de estados
	EstadoListService.get(
		{},
		function success(response) {
			$scope.listaEstados = response;
		}, 
		function error(errorResponse) {
			console.log("Error:" + JSON.stringify(errorResponse));
			return;
		}
    );
	
	// Busca lista de municipios para a UF selecionada
	$scope.buscarMunicipios = function(uf) {
		MunicipioListService.get(
			{uf: uf},
			function success(response) {
				$scope.listaMunicipios = response;
			}, 
			function error(errorResponse) {
				console.log("Error:" + JSON.stringify(errorResponse));
				return;
		});
	}
	
	// Volta para a lista
	$scope.retornar = function() {
		$location.path('/clientes');
	}
	
	// Salva o cliente novo
	$scope.salvar = function(retornar) {
		
		// Formulario nao valido, cancela operacao
		$scope.temErro = !$scope.clienteForm.$valid;
		if ($scope.temErro == true) {
			return;
		}
		
		if ($scope.cliente.id == null) {
			ClienteCrudService.save(
					$scope.cliente,
					function success(response) {
						$scope.cliente = response;
						
						// A data vem no formato de milesegundos
						if ($scope.cliente.dataNascimento) {
							$scope.cliente.dataNascimento = new Date($scope.cliente.dataNascimento);
						}
						$scope.sucesso = true;
						$scope.temErro = false;
					}, 
					function error(errorResponse) {
						console.log("Error:" + JSON.stringify(errorResponse));
						$scope.mensagem = errorResponse.status + ' - ' + errorResponse.data;
	    				$scope.temErro = true;
	    				$scope.sucesso = false;
						return;
					});
		} else {
			ClienteCrudService.update(
					$scope.cliente,
					function success(response) {
						$scope.cliente = response;
						
						// A data vem no formato de milesegundos
						if ($scope.cliente.dataNascimento) {
							$scope.cliente.dataNascimento = new Date($scope.cliente.dataNascimento);
						}
						$scope.sucesso = true;
					}, 
					function error(errorResponse) {
						console.log("Error:" + JSON.stringify(errorResponse));
						return;
					});
		};
		
		// Retorna para lista caso verdadeiro
		if (retornar == true) {
			$location.path('/clientes');
		}
	};
	
	// Busca cep
	$scope.buscarCep = function(cep) {
		if (cep == undefined || cep.length < 8)
			return;
		
		CepService.get(
			{cep: cep},
			function success(response) {
				$scope.temErro = false;
				$scope.sucesso = false;
				$scope.cliente.endereco = response.end;
				$scope.cliente.bairro = response.bairro;
				
				// Encontra o estado retornado na lista
				var uf = estado.encontrarNaLista($scope.listaEstados, response.uf);
				var cidadeAux = response.cidade;
				
				if (uf != undefined) {
					$scope.uf = uf;
					MunicipioListService.get(
							{uf: uf.id},
							function success(response) {
								$scope.listaMunicipios = response;
								
								// Municipio
								var cidade = municipio.encontrarNaLista($scope.listaMunicipios, cidadeAux);
								
								if (cidade != undefined) {
									$scope.cliente.municipio = cidade;
								}
								
							}, 
							function error(errorResponse) {
								console.log("Error:" + JSON.stringify(errorResponse));
								return;
						});
				}
			}, 
			function error(errorResponse) {
				return;
			});
	};
} ])

.controller('ClienteEdicaoCtrl', [ '$scope', '$routeParams', '$location', 'ClienteCrudService', 'EstadoListService', 'MunicipioListService', 'CepService',
    function($scope, $routeParams, $location, ClienteCrudService, EstadoListService, MunicipioListService, CepService) {
	
	$scope.idCliente = $routeParams.id;
	
	if ($routeParams.desabilitar == "true") {
		$scope.desabilitar = true;
	} else {
		$scope.desabilitar = false;
	}
	
	$scope.tipoPessoaLista = [ { nome: "Física"}, { nome: "Jurídica"} ];
	$scope.listaEstados = null;
	$scope.listaMunicipios = null;
	$scope.temErro = false;
	$scope.sucesso = false;
	$scope.uf = null;
	
	// Busca dados do cliente selecionado
	ClienteCrudService.get(
		{id: $scope.idCliente},
		function success(response) {
			$scope.cliente = response;
			
			// Busca lista de municipios para o estado do municipio
			// corrente no cadastro do usuario
			$scope.uf = $scope.cliente.municipio.uf;
			if ($scope.uf != null) {
				$scope.buscarMunicipios($scope.uf.id);
			}
			
			// A data vem no formato de milesegundos
			if ($scope.cliente.dataNascimento != null) {
				$scope.cliente.dataNascimento = new Date($scope.cliente.dataNascimento);
			}
			
		}, 
		function error(errorResponse) {
			console.log("Error:" + JSON.stringify(errorResponse));
			return;
	});
	
	// Volta para a lista
	$scope.retornar = function() {
		$location.path('/clientes');
	}
	
	// Busca lista de estados
	EstadoListService.get(
		{},
		function success(response) {
			$scope.listaEstados = response;
		}, 
		function error(errorResponse) {
			console.log("Error:" + JSON.stringify(errorResponse));
			return;
		}
    );
	
	// Busca lista de municipios para a UF selecionada
	$scope.buscarMunicipios = function(uf) {
		MunicipioListService.get(
			{uf: uf},
			function success(response) {
				$scope.listaMunicipios = response;
			}, 
			function error(errorResponse) {
				console.log("Error:" + JSON.stringify(errorResponse));
				return;
		});
	}
	
	// Altera o cliente selecionado na edicao
	$scope.salvar = function(retornar) {
		
		// Formulario nao valido, cancela operacao
		$scope.temErro = !$scope.clienteForm.$valid;
		if ($scope.temErro == true) {
			$scope.sucesso = false;
			return;
		}
		
		ClienteCrudService.update(
			$scope.cliente,
			function success(response) {
				$scope.cliente = response;
				
				// A data vem no formato de milesegundos
				if ($scope.cliente.dataNascimento != null) {
					$scope.cliente.dataNascimento = new Date($scope.cliente.dataNascimento);
				}
				$scope.sucesso = true;
			}, 
			function error(errorResponse) {
				console.log("Error:" + JSON.stringify(errorResponse));
				return;
		});
		
		// Retorna para lista caso verdadeiro
		if (retornar == true) {
			$location.path('/clientes');
		}
	};
	
	// Busca cep
	$scope.buscarCep = function(cep) {
		if (cep == undefined || cep.length < 8)
			return;
		
		CepService.get(
			{cep: cep},
			function success(response) {
				$scope.temErro = false;
				$scope.sucesso = false;
				$scope.cliente.endereco = response.end;
				$scope.cliente.bairro = response.bairro;
				
				// Encontra o estado retornado na lista
				var uf = estado.encontrarNaLista($scope.listaEstados, response.uf);
				var cidadeAux = response.cidade;
				
				if (uf != undefined) {
					$scope.uf = uf;
					MunicipioListService.get(
							{uf: uf.id},
							function success(response) {
								$scope.listaMunicipios = response;
								
								// Municipio
								var cidade = municipio.encontrarNaLista($scope.listaMunicipios, cidadeAux);
								
								if (cidade != undefined) {
									$scope.cliente.municipio = cidade;
								}
								
							}, 
							function error(errorResponse) {
								console.log("Error:" + JSON.stringify(errorResponse));
								return;
						});
				}
			}, 
			function error(errorResponse) {
				return;
			});
	};
	
} ])

.controller('ContatosClienteCtrl', [ '$scope', '$location', 'ContatoClienteListService', 'ContatoCrudService', 'EstadoListService', 'MunicipioListService', 'CepService',
                                     function($scope, $location, ContatoClienteListService, ContatoCrudService, EstadoListService, MunicipioListService, CepService) {
	$scope.sucessoContato = false;
	$scope.listaEstadoCivil = [ { nome: "Casado"}, { nome: "Divorciado"}, { nome: "Separado"}, { nome: "Solteiro"}, { nome: "Viúvo"} ];
	$scope.apresentaContatoForm = false;
	$scope.contato = null;
	$scope.nome = undefined;
	$scope.listaEstados = null;
	$scope.listaMunicipios = null;
	
	// Busca lista de estados
	EstadoListService.get(
		{},
		function success(response) {
			$scope.listaEstados = response;
		}, 
		function error(errorResponse) {
			console.log("Error:" + JSON.stringify(errorResponse));
			return;
		}
    );
	
	// Busca lista de municipios para a UF selecionada
	$scope.buscarMunicipiosContato = function(uf) {
		MunicipioListService.get(
			{uf: uf},
			function success(response) {
				$scope.listaMunicipios = response;
			}, 
			function error(errorResponse) {
				console.log("Error:" + JSON.stringify(errorResponse));
				return;
		});
	}
	
	// Visualizar contato do cliente
	$scope.visualizarContato = function(idContato) {
		$scope.emEdicao = false;
		$scope.apresentaContatoForm = true;
		
		// Busca dados do contato selecionado
		ContatoCrudService.get(
			{id: idContato},
			function success(response) {
				$scope.contato = response;
				$scope.ufContato = $scope.contato.municipio.uf;
				if ($scope.ufContato != null) {
					$scope.buscarMunicipiosContato($scope.ufContato.id);
				}
				
				// A data vem no formato de milesegundos
				if ($scope.contato.dataNascimento != null) {
					$scope.contato.dataNascimento = new Date($scope.contato.dataNascimento);
				}
			}, 
			function error(errorResponse) {
				console.log("Error:" + JSON.stringify(errorResponse));
				return;
		});
	}
	
	// Novo contato para o cliente
	$scope.novoContato = function() {
    	$scope.apresentaContatoForm = true;
    	$scope.emEdicao = true;
    	$scope.contato = {};
    	$scope.sucessoContato = false;
    	$scope.nome = $scope.$parent.cliente.nomeRazaoSocial;
    }
	
	// Busca os dados do contato e inicia a edicao
	$scope.editarContato = function(idContato) {
		
		$scope.emEdicao = true;
		$scope.apresentaContatoForm = true;
		$scope.sucessoContato = false;
		$scope.nome = $scope.$parent.cliente.nomeRazaoSocial;
		
		// Busca dados do contato selecionado
		ContatoCrudService.get(
			{id: idContato},
			function success(response) {
				$scope.contato = response;
				
				if ($scope.contato.municipio != null) {
					$scope.ufContato = $scope.contato.municipio.uf;
					if ($scope.ufContato != null) {
						$scope.buscarMunicipiosContato($scope.ufContato.id);
					}
				}
				
				// A data vem no formato de milesegundos
				if ($scope.contato.dataNascimento != null) {
					$scope.contato.dataNascimento = new Date($scope.contato.dataNascimento);
				}
			}, 
			function error(errorResponse) {
				console.log("Error:" + JSON.stringify(errorResponse));
				return;
		});
	}
	
	// Busca os contatos do cliente
	$scope.buscarContatos = function() {
		var id = $scope.$parent.idCliente;
		
		if (id == null) {
			return;
		}
		
		ContatoClienteListService.get(
			{idCliente: id},
			function success(response) {
				$scope.contatosList =  response;
			}, 
			function error(errorResponse) {
				console.log("Error:" + JSON.stringify(errorResponse));
				return;
			}
    	);
    };
    
    // Apontar o contato selecionado
    $scope.contatoSelecionado = function (nome, id) {
        $scope.nomeSelecionado = nome;
        $scope.idSelecionado = id;
    };
    
    // Exclui contato selecionado
    $scope.excluirContato = function() {
		
    	ContatoCrudService.remove(
    			{id: $scope.idSelecionado},
    			function success(response) {
    				$scope.buscarContatos();
    				$scope.sucessoContato = true;
    				return;
    			}, 
    			function error(errorResponse) {
    				console.log("Error:" + JSON.stringify(errorResponse));
    				return;
    			});
    }
    
    // Desativa o modo de edicao.
    $scope.edicaoOff = function() {
    	$scope.apresentaContatoForm = false;
    }
    
    // Busca cep
	$scope.buscarCepContato = function(cep) {
		if (cep == undefined || cep.length < 8)
			return;
		
		CepService.get(
			{cep: cep},
			function success(response) {
				$scope.contato.endereco = response.end;
				$scope.contato.bairro = response.bairro;
				
				// Encontra o estado retornado na lista
				var uf = estado.encontrarNaLista($scope.listaEstados, response.uf);
				var cidadeAux = response.cidade;
				
				if (uf != undefined) {
					$scope.ufContato = uf;
					MunicipioListService.get(
							{uf: uf.id},
							function success(response) {
								$scope.listaMunicipios = response;
								
								// Municipio
								var cidade = municipio.encontrarNaLista($scope.listaMunicipios, cidadeAux);
								
								if (cidade != undefined) {
									$scope.contato.municipio = cidade;
								}
								
							}, 
							function error(errorResponse) {
								console.log("Error:" + JSON.stringify(errorResponse));
								return;
						});
				}
			}, 
			function error(errorResponse) {
				return;
			});
	};
	
	// Cancela a operacao de edicao do contato
	$scope.cancelar = function() {
    	$scope.edicaoOff();
    	$scope.sucessoContato = false;
    	delete $scope.contato;
    }
	
	// Salva o contato em edicao
	$scope.salvarContato = function() {
		
		$scope.contato.idCliente = $scope.$parent.cliente.id;
		
		// Para contato novo, solicita a inclusao
		if ($scope.contato.id == null) {
			ContatoCrudService.save(
					$scope.contato,
					function success(response) {
						$scope.contato = response;
						
						// A data vem no formato de milesegundos
						if ($scope.contato.dataNascimento != null) {
							$scope.contato.dataNascimento = new Date($scope.contato.dataNascimento);
						}
						
						$scope.sucessoContato = true;
						$scope.temErro = false;
						
						// Busca os contatos novamente para o cliente
						$scope.buscarContatos();
					}, 
					function error(errorResponse) {
						$scope.temErro = true;
						$scope.mensagem = "Ocorreu um erro ao salvar o contato.";
						console.log("Error:" + JSON.stringify(errorResponse));
						return;
					});
		} else {
			// Para contato existente, solicita atualizacao
			ContatoCrudService.update(
					$scope.contato,
					function success(response) {
						$scope.contato = response;
						
						// A data vem no formato de milesegundos
						$scope.contato.dataNascimento = new Date($scope.contato.dataNascimento);
						
						// Busca os contatos novamente para o cliente
						$scope.buscarContatos();
						
						$scope.sucessoContato = true;
					}, 
					function error(errorResponse) {
						console.log("Error:" + JSON.stringify(errorResponse));
						return;
					});
		};
	};
    
    // Aciona a busca dos contatos para o cliente corrente
    $scope.buscarContatos();
    
} ])

.controller('DashboardCtrl', [ '$scope', 'DashboardIndicadoresService', 'DashboarGraficoSolicService', function($scope, DashboardIndicadoresService, DashboarGraficoSolicService) {
	$scope.sucesso = false;
	$scope.listaIndicadores = [];
	
	// Aciona busca dos indicadores
	listarIndicadores();
	
	// Aciona busca dos dados do grafico
	gerarGrafico();
	
	// Lista todos os indicadores
	function listarIndicadores() {
		
		DashboardIndicadoresService.get(
				{},
				function success(response) {
					$scope.listaIndicadores = response;
				}, 
				function error(errorResponse) {
					console.log("Error:" + JSON.stringify(errorResponse));
					return;
				});
	};
	
	// Gera dados para o grafico de solicitacoes por colaborador
	function gerarGrafico() {
		var dados = [];
		var grafico = [];
		var d;
		
		DashboarGraficoSolicService.get(
				{},
				function success(response) {
					dados = response;
					
					for (var i = 0; i < dados.length; i++) {
					    d = {};
					    d.y = dados[i].nome.split(" ",1);
					    d.a = dados[i].qtd;
					    grafico.push(d);
					}
					
					Morris.Bar({
				        element: 'morris-bar-chart',
				        data: grafico,
				        xkey: 'y',
				        ykeys: ['a'],
				        labels: ['Solicitações'],
				        hideHover: 'auto',
				        resize: true
				    });
				}, 
				function error(errorResponse) {
					console.log("Error:" + JSON.stringify(errorResponse));
					return;
				});
	};

} ])

.controller('ColaboradoresCtrl', [ '$scope', '$location', 'ColaboradorListService', 'ColaboradorCrudService', function($scope, $location, ColaboradorListService, ColaboradorCrudService) {
	
	$scope.nomeSelecionado = null;
	$scope.idSelecionado = null;
	$scope.sucesso = false;
	$scope.temErro = false;
	$scope.mensagem = false
	$scope.colaboradoresList = null;
	$scope.loading = true;
	
	buscarColaboradores();
	
	// Novo colaborador
	$scope.novoColaborador = function (id) {
        $location.path('/novoColaborador');
    };
    
	// Edita o colaborador selecionado na lista.
    $scope.editarColaborador = function (id) {
        $location.path('/editarColaborador/' + id + '/false');
    };
    
    // Visualiza o colaborador selecionado na lista.
    // Utiliza o mesmo form de edicao. Apenas desabilita os componentes.
    $scope.visualizarColaborador = function (id) {
    	$location.path('/editarColaborador/' + id + '/true');
    };
    
    // Exclui o Colaborador selecionado na lista:
    $scope.excluirColaborador = function () {
    	ColaboradorCrudService.remove(
			{id: $scope.idSelecionado},
			function success(response) {
				buscarColaboradores();
				$scope.sucesso = true;
				return;
			}, 
			function error(errorResponse) {
				console.log("Error:" + JSON.stringify(errorResponse));
				$scope.mensagem = errorResponse.data.title + ': ' + errorResponse.data.detail;
				$scope.sucesso = false;
				$scope.temErro = true;
				return;
			});
    };
    
    // Apontar Colaborador selecionado
    $scope.colaboradorSelecionado = function (nome, id) {
        $scope.nomeSelecionado = nome;
        $scope.idSelecionado = id;
    };
    
    $scope.somenteAtivos = function () {
    	
    	  // Declare variables
    	  var filter, table, tr, td, i, txtValue;
    	  filter = "Ativo"
    	  table = document.getElementById("table-colaboradores");
    	  tr = table.getElementsByTagName("tr");

    	  // Loop through all table rows, and hide those who don't match the search query
    	  for (i = 0; i < tr.length; i++) {
    	    td = tr[i].getElementsByTagName("td")[4];
    	    if (td) {
    	      txtValue = td.textContent || td.innerText;
    	      if (txtValue.indexOf(filter) > -1) {
    	        tr[i].style.display = "";
    	      } else {
    	        tr[i].style.display = "none";
    	      }
    	    }
    	  }
    	};
    
    function buscarColaboradores() {
    	ColaboradorListService.get(
			{},
			function success(response) {
				$scope.loading = false;
				$scope.colaboradoresList = response;
			}, 
			function error(errorResponse) {
				$scope.loading = false;
				console.log("Error:" + JSON.stringify(errorResponse));
				$scope.mensagem = errorResponse.status + ' - ' + errorResponse.statusText;
				$scope.temErro = true;
				$scope.sucesso = false;
				return;
			}
    	);
    };
	
} ])

.controller('ColaboradorNovoCtrl', [ '$scope', '$routeParams', '$location', '$resource', 'ColaboradorCrudService', 'EstadoListService', 'MunicipioListService', 'ColaboradorFotoService', 'CepService',
    function($scope, $routeParams, $location, $resource, ColaboradorCrudService, EstadoListService, MunicipioListService, ColaboradorFotoService, CepService ) {
	
	$scope.sucesso = false;
	$scope.temErro = false;
	$scope.desabilitaPesquisaCep = false;
	$scope.listaEstados = null;
	$scope.listaMunicipios = null;
	$scope.situacaoLista = [ { nome: "Ativo"}, { nome: "Inativo"} ];
	$scope.uf = null;
	$scope.mensagem = null;
	$scope.foto = undefined;
	
	$scope.colaborador = {};
	$scope.colaborador.situacao = "Ativo"
	
	// Busca lista de estados
	EstadoListService.get(
		{},
		function success(response) {
			$scope.listaEstados = response;
		}, 
		function error(errorResponse) {
			console.log("Error:" + JSON.stringify(errorResponse));
			return;
		}
    );
	
	// Busca lista de municipios para a UF selecionada
	$scope.buscarMunicipios = function(uf) {
		MunicipioListService.get(
			{uf: uf},
			function success(response) {
				$scope.listaMunicipios = response;
			}, 
			function error(errorResponse) {
				console.log("Error:" + JSON.stringify(errorResponse));
				return;
		});
	}
	
	// Volta para a lista
	$scope.retornar = function() {
		$location.path('/colaboradores');
	}
	
	// Salva o cliente novo
	$scope.salvar = function(retornar) {
		
		// Formulario nao valido, cancela operacao
		$scope.temErro = !$scope.colaboradorForm.$valid;
		if ($scope.temErro == true) {
			// Monta mensagem de erro
			verificaCampos();
			
			return;
		}
		
		if ($scope.colaborador.id == null) {
			ColaboradorCrudService.save(
					$scope.colaborador,
					function success(response) {
						$scope.colaborador = response;
						
						// A data vem no formato de milesegundos
						if ($scope.colaborador.dataNascimento) {
							$scope.colaborador.dataNascimento = new Date($scope.colaborador.dataNascimento);
						}
						
						if ($scope.colaborador.dataAdmissao) {
							$scope.colaborador.dataAdmissao = new Date($scope.colaborador.dataAdmissao);
						}
						
						if ($scope.colaborador.dataDemissao) {
							$scope.colaborador.dataDemissao = new Date($scope.colaborador.dataDemissao);
						}
						
						$scope.sucesso = true;
					}, 
					function error(errorResponse) {
						console.log("Error:" + JSON.stringify(errorResponse));
						return;
					});
		} else {
			ColaboradorCrudService.update(
					$scope.colaborador,
					function success(response) {
						$scope.colaborador = response;
						
						// A data vem no formato de milesegundos
						if ($scope.colaborador.dataNascimento) {
							$scope.colaborador.dataNascimento = new Date($scope.colaborador.dataNascimento);
						}
						
						if ($scope.colaborador.dataAdmissao) {
							$scope.colaborador.dataAdmissao = new Date($scope.colaborador.dataAdmissao);
						}
						
						if ($scope.colaborador.dataDemissao) {
							$scope.colaborador.dataDemissao = new Date($scope.colaborador.dataDemissao);
						}
						
						$scope.sucesso = true;
					}, 
					function error(errorResponse) {
						console.log("Error:" + JSON.stringify(errorResponse));
						return;
					});
		};
		
		// Retorna para lista caso verdadeiro
		if (retornar == true) {
			$location.path('/colaboradores');
		}
	};
	
	$scope.gravarFoto = function() {
		$scope.temErro = false;
		$scope.sucesso = false;
		
		var fd = new FormData();
		fd.append('dados',$scope.foto);
		
		if ($scope.foto.size > 1048576) {
			$('#modalFoto').modal('hide');
			$scope.temErro = true;
			$scope.mensagem = "Tamanho de imagem limitado a 1 MB. Selecione outra.";
			return;
		}
		
		if ($scope.foto.type != 'image/jpeg') {
			$('#modalFoto').modal('hide');
			$scope.temErro = true;
			$scope.mensagem = "Utilize imagem do tipo JPG. Selecione outro arquivo.";
			return;
		}
		
		ColaboradorFotoService.save(
				{id: $scope.colaborador.id},
				fd,
				function success(response) {
					var urlFoto = '/solicitacoes/services/colaborador/foto/' + $scope.colaborador.id
					$('#modalFoto').modal('hide');
					$('#imgColaborador').attr('src',urlFoto);
					$scope.sucesso = true;
				}, 
				function error(errorResponse) {
					console.log("Error:" + JSON.stringify(errorResponse));
					return;
				}
		);
		
	};
	
	// Busca cep
	$scope.buscarCep = function(cep) {
		if (cep == undefined || cep.length < 8)
			return;
		
		$scope.desabilitaPesquisaCep = true;
		
		CepService.get(
			{cep: cep},
			function success(response) {
				$scope.desabilitaPesquisaCep = false;
				$scope.temErro = false;
				$scope.sucesso = false;
				$scope.colaborador.endereco = response.end;
				$scope.colaborador.bairro = response.bairro;
				
				// Encontra o estado retornado na lista
				var uf = estado.encontrarNaLista($scope.listaEstados, response.uf);
				var cidadeAux = response.cidade;
				
				if (uf != undefined) {
					$scope.uf = uf;
					MunicipioListService.get(
							{uf: uf.id},
							function success(response) {
								$scope.listaMunicipios = response;
								
								// Municipio
								var cidade = municipio.encontrarNaLista($scope.listaMunicipios, cidadeAux);
								
								if (cidade != undefined) {
									$scope.colaborador.municipio = cidade;
								}
								
							}, 
							function error(errorResponse) {
								console.log("Error:" + JSON.stringify(errorResponse));
								return;
						});
				}
			}, 
			function error(errorResponse) {
				$scope.desabilitaPesquisaCep = false;
			});
	};
	
	function verificaCampos() {
		$scope.mensagem = "";
		
		if ($scope.colaboradorForm.nome.$error.required) {
			$scope.mensagem += "Nome é requerido. ";
		}
		
		if ($scope.colaboradorForm.vinculoFuncao.$error.required) {
			$scope.mensagem += "Vinculo/Função é requerido. ";
		}
		
		if ($scope.colaboradorForm.cpf.$error.required) {
			$scope.mensagem += "CPF é requerido. ";
		}
		
		if ($scope.colaboradorForm.dataNascimento.$error.required) {
			$scope.mensagem += "Data de nascimento é requerida. "; 
		}
		
		if ($scope.colaboradorForm.dataAdmissao.$error.required) {
			$scope.mensagem += "Data de admissão é requerida. "; 
		}
		
		if ($scope.colaboradorForm.email.$error.required) {
			$scope.mensagem += "E-Mail é requerido. "; 
		}
		
		if ($scope.colaboradorForm.situacao.$error.required) {
			$scope.mensagem += "Situação é requerido. "; 
		}
		
		if ($scope.colaboradorForm.cep.$error.required) {
			$scope.mensagem += "CEP é requerido. "; 
		}
		
		if ($scope.colaboradorForm.uf.$error.required) {
			$scope.mensagem += "UF é requerido. "; 
		}
		
		if ($scope.colaboradorForm.municipio.$error.required) {
			$scope.mensagem += "Municipio é requerido. "; 
		}
		
		if ($scope.colaboradorForm.endereco.$error.required) {
			$scope.mensagem += "Endereço é requerido. "; 
		}
		
		if ($scope.colaboradorForm.numero.$error.required) {
			$scope.mensagem += "Numero é requerido. "; 
		}
		
		if ($scope.colaboradorForm.endereco.$error.required) {
			$scope.mensagem += "Bairro é requerido. "; 
		}
	}
	
} ])

.controller('ColaboradorEdicaoCtrl', [ '$scope', '$routeParams', '$location', '$http', 'ColaboradorCrudService', 'EstadoListService', 'MunicipioListService', 'CepService', 'ColaboradorFotoService',
    function($scope, $routeParams, $location, $http, ColaboradorCrudService, EstadoListService, MunicipioListService, CepService, ColaboradorFotoService) {
	
	var desab = $routeParams.desabilitar;
	if (desab == 'true'? $scope.desabilitar = true : $scope.desabilitar = false);
	
	$scope.idColaborador = $routeParams.id;
	$scope.sucesso = false;
	$scope.temErro = false;
	$scope.desabilitaPesquisaCep = false;
	$scope.listaEstados = null;
	$scope.listaMunicipios = null;
	$scope.situacaoLista = [ { nome: "Ativo"}, { nome: "Inativo"} ];
	$scope.uf = null;
	$scope.mensagem = null;
	$scope.colaborador = {};
	$scope.foto = undefined;
	
	// Busca dados do colaborador selecionado
	ColaboradorCrudService.get(
		{id: $scope.idColaborador},
		function success(response) {
			$scope.colaborador = response;
			
			// Busca lista de municipios para o estado do municipio
			// corrente no cadastro do usuario
			$scope.uf = $scope.colaborador.municipio.uf;
			if ($scope.uf != null) {
				$scope.buscarMunicipios($scope.uf.id);
			}
			
			if ($scope.colaborador.dataNascimento != null) {
				$scope.colaborador.dataNascimento = new Date($scope.colaborador.dataNascimento);
			}
			
			if ($scope.colaborador.dataAdmissao != null) {
				$scope.colaborador.dataAdmissao = new Date($scope.colaborador.dataAdmissao);
			}
			
			if ($scope.colaborador.dataDemissao != null) {
				$scope.colaborador.dataDemissao = new Date($scope.colaborador.dataDemissao);
			}
			
		}, 
		function error(errorResponse) {
			console.log("Error:" + JSON.stringify(errorResponse));
			return;
	});
	
	// Volta para a lista
	$scope.retornar = function() {
		$location.path('/colaboradores');
	}
	
	// Busca lista de estados
	EstadoListService.get(
		{},
		function success(response) {
			$scope.listaEstados = response;
		}, 
		function error(errorResponse) {
			console.log("Error:" + JSON.stringify(errorResponse));
			return;
		}
    );
	
	// Busca lista de municipios para a UF selecionada
	$scope.buscarMunicipios = function(uf) {
		MunicipioListService.get(
			{uf: uf},
			function success(response) {
				$scope.listaMunicipios = response;
			}, 
			function error(errorResponse) {
				console.log("Error:" + JSON.stringify(errorResponse));
				return;
		});
	}
	
	// Altera o colaborador selecionado na edicao
	$scope.salvar = function(retornar) {
		
		// Formulario nao valido, cancela operacao
		$scope.temErro = !$scope.colaboradorForm.$valid;
		if ($scope.temErro == true) {
			// Monta mensagem de erro
			verificaCampos();
			
			return;
		}
		
		ColaboradorCrudService.update(
			$scope.colaborador,
			function success(response) {
				$scope.colaborador = response;
				
				// A data vem no formato de milesegundos
				if ($scope.colaborador.dataNascimento) {
					$scope.colaborador.dataNascimento = new Date($scope.colaborador.dataNascimento);
				}
				
				if ($scope.colaborador.dataAdmissao) {
					$scope.colaborador.dataAdmissao = new Date($scope.colaborador.dataAdmissao);
				}
				
				if ($scope.colaborador.dataDemissao) {
					$scope.colaborador.dataDemissao = new Date($scope.colaborador.dataDemissao);
				}
				
				$scope.sucesso = true;
			}, 
			function error(errorResponse) {
				console.log("Error:" + JSON.stringify(errorResponse));
				return;
		});
		
		// Retorna para lista caso verdadeiro
		if (retornar == true) {
			$location.path('/colaboradores');
		}
	};
	
	// Busca cep
	$scope.buscarCep = function(cep) {
		if (cep == undefined || cep.length < 8)
			return;
		
		$scope.desabilitaPesquisaCep = true;
		
		CepService.get(
			{cep: cep},
			function success(response) {
				$scope.desabilitaPesquisaCep = false;
				$scope.temErro = false;
				$scope.sucesso = false;
				$scope.colaborador.endereco = response.end;
				$scope.colaborador.bairro = response.bairro;
				
				// Encontra o estado retornado na lista
				var uf = estado.encontrarNaLista($scope.listaEstados, response.uf);
				var cidadeAux = response.cidade;
				
				if (uf != undefined) {
					$scope.uf = uf;
					MunicipioListService.get(
							{uf: uf.id},
							function success(response) {
								$scope.listaMunicipios = response;
								
								// Municipio
								var cidade = municipio.encontrarNaLista($scope.listaMunicipios, cidadeAux);
								
								if (cidade != undefined) {
									$scope.colaborador.municipio = cidade;
								}
								
							}, 
							function error(errorResponse) {
								console.log("Error:" + JSON.stringify(errorResponse));
								return;
						});
				}
			}, 
			function error(errorResponse) {
				$scope.desabilitaPesquisaCep = false;
			});
	};
	
	$scope.gravarFoto = function() {
			$scope.temErro = false;
			$scope.sucesso = false;
			
			var fd = new FormData();
			fd.append('dados',$scope.foto);
			
			if ($scope.foto.size > 1048576) {
				$('#modalFoto').modal('hide');
				$scope.temErro = true;
				$scope.mensagem = "Tamanho de imagem limitado a 1 MB. Selecione outra.";
				return;
			}
			
			if ($scope.foto.type != 'image/jpeg') {
				$('#modalFoto').modal('hide');
				$scope.temErro = true;
				$scope.mensagem = "Utilize imagem do tipo JPG. Selecione outro arquivo.";
				return;
			}
			
			ColaboradorFotoService.save(
					{id: $scope.colaborador.id},
					fd,
					function success(response) {
						var urlFoto = '/solicitacoes/services/colaborador/foto/' + $scope.colaborador.id
						$('#modalFoto').modal('hide');
						$('#imgColaborador').attr('src',urlFoto);
						$scope.sucesso = true;
					}, 
					function error(errorResponse) {
						console.log("Error:" + JSON.stringify(errorResponse));
						return;
					}
			);
			
	};
	
	function verificaCampos() {
		$scope.mensagem = "";
		
		if ($scope.colaboradorForm.nome.$error.required) {
			$scope.mensagem += "Nome é requerido. ";
		}
		
		if ($scope.colaboradorForm.vinculoFuncao.$error.required) {
			$scope.mensagem += "Vinculo/Função é requerido. ";
		}
		
		if ($scope.colaboradorForm.cpf.$error.required) {
			$scope.mensagem += "CPF é requerido. ";
		}
		
		if ($scope.colaboradorForm.dataNascimento.$error.required) {
			$scope.mensagem += "Data de nascimento é requerido. "; 
		}
		
		if ($scope.colaboradorForm.dataAdmissao.$error.required) {
			$scope.mensagem += "Data de admissão é requerida. "; 
		}
		
		if ($scope.colaboradorForm.email.$error.required) {
			$scope.mensagem += "E-Mail é requerido. "; 
		}
		
		if ($scope.colaboradorForm.situacao.$error.required) {
			$scope.mensagem += "Situação é requerido. "; 
		}
		
		if ($scope.colaboradorForm.cep.$error.required) {
			$scope.mensagem += "CEP é requerido. "; 
		}
		
		if ($scope.colaboradorForm.uf.$error.required) {
			$scope.mensagem += "UF é requerido. "; 
		}
		
		if ($scope.colaboradorForm.municipio.$error.required) {
			$scope.mensagem += "Municipio é requerido. "; 
		}
		
		if ($scope.colaboradorForm.endereco.$error.required) {
			$scope.mensagem += "Endereço é requerido. "; 
		}
		
		if ($scope.colaboradorForm.numero.$error.required) {
			$scope.mensagem += "Numero é requerido. "; 
		}
		
		if ($scope.colaboradorForm.endereco.$error.required) {
			$scope.mensagem += "Bairro é requerido. "; 
		}
	};

} ]);


// Diretiva para isolar sub-formulario
solservControllers.directive('isolateForm', [function () {
    return {
        restrict: 'A',
        require: '?form',
        link: function (scope, elm, attrs, ctrl) {
            if (!ctrl) {
                return;
            }

            // Do a copy of the controller
            var ctrlCopy = {};
            angular.copy(ctrl, ctrlCopy);

            // Get the parent of the form
            var parent = elm.parent().controller('form');
            // Remove parent link to the controller
            parent.$removeControl(ctrl);

            // Replace form controller with a "isolated form"
            var isolatedFormCtrl = {
                $setValidity: function (validationToken, isValid, control) {
                    ctrlCopy.$setValidity(validationToken, isValid, control);
                    parent.$setValidity(validationToken, true, ctrl);
                },
                $setDirty: function () {
                    elm.removeClass('ng-pristine').addClass('ng-dirty');
                    ctrl.$dirty = true;
                    ctrl.$pristine = false;
                },
            };
            angular.extend(ctrl, isolatedFormCtrl);
        }
    };
}]);

// Diretiva para apresentar div contendo GIF "carregando..."
solservControllers.directive('loading', function () {
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