/**
 * Módulo de controle do CRUD de solicitação de serviço.
 * 
 */

'use strict';

var solicitacaoControllers = angular.module('solicitacaoControllers', []);
var nomeFiltroColaborador = "filtro.solic.colaborador";
var nomeFiltroSituacao = "filtro.solic.situacao";

solicitacaoControllers.controller('SolicitacoesCtrl', [ '$rootScope', '$scope', '$location', 'SolicitacaoListService', 'SolicitacaoCrudService', 'SituacaoSolicListService', 'ColaboradorListIdNomeService', 'setFilter', 'getFilter', 
	
	function($rootScope, $scope, $location, SolicitacaoListService, SolicitacaoCrudService, SituacaoSolicListService, ColaboradorListIdNomeService, setFilterService, getFilterService) {
	
	$scope.idSelecionado = null;
	$scope.sucesso = false;
	$scope.listaSolicitacoes = {};
	$scope.listaSituacoes = {};
	$scope.listaColaboradores = {};
	$scope.mensagem = null;
	$scope.loading = true;
	$scope.naoatendidas = true;
	$scope.colaborador = undefined;
	$scope.situacao = undefined;
	
	var filtro = getFilterService(nomeFiltroColaborador);
	if (filtro != undefined || filtro != "") {
		$scope.colaborador = filtro;
	}
	
	filtro = getFilterService(nomeFiltroSituacao);
	if (filtro != undefined || filtro != "") {
		$scope.situacao = filtro;
	}
	
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
	
	
	// Nova solicitacao
	$scope.novo = function (id) {
        $location.path('/solicitacao/nova');
    };
    
	// Edita a solicitação selecionada na lista.
    $scope.editar = function (id) {
        $location.path('/solicitacao/' + id+ '/false');
    };
    
    // Visualiza a solicitacao selecionada na lista.
    // Utiliza o mesmo form de edição. Apenas desabilita os componentes.
    $scope.visualizar = function (id) {
    	$location.path('/solicitacao/' + id + '/true');
    };
    
    // Exclui solicitacao selecionada
    $scope.excluir = function() {
		
    	SolicitacaoCrudService.remove(
    			{id: $scope.idSelecionado},
    			function success(response) {
    				buscarSolicitacoes();
    				$scope.sucesso = true;
    				$scope.idSelecionado = null;
    				return;
    			}, 
    			function error(errorResponse) {
    				console.log("Error:" + JSON.stringify(errorResponse));
    				return;
    			});
    }
	
    
    // Aponta a solicitação selecionada.
    $scope.selecionar = function (id) {
        $scope.idSelecionado = id;
    };
    
    // Define a classe de formatacao da progress bar.
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
    
    // Busca as solicitações existentes.
    $scope.buscarSolicitacoes = function () {
    	    	
    	SolicitacaoListService.get(
			{ naoatendidas: $scope.naoatendidas,
				situacao: $scope.situacao,
				colaborador: $scope.colaborador},
			function success(response) {
				$scope.loading = false;
				$scope.listaSolicitacoes = response;
				
				setFilterService(nomeFiltroColaborador, $scope.colaborador);
				setFilterService(nomeFiltroSituacao, $scope.situacao);
			}, 
			function error(errorResponse) {
				$scope.loading = false;
				console.log("Error:" + JSON.stringify(errorResponse));
				return;
			}
    	);
    }
    
    $scope.limparFiltros = function () {
    	$scope.colaborador = undefined;
    	$scope.situacao = undefined;
    	$scope.naoatendidas = true;
    	
    	setFilterService(nomeFiltroColaborador, "");
		setFilterService(nomeFiltroSituacao, "");
		
		$scope.buscarSolicitacoes();
    };
    
    // Aciona a busca da lista de solicitações.
	$scope.buscarSolicitacoes();
	
} ])

.controller('SolicitacaoEdicaoCtrl', [ '$scope', '$routeParams', '$location', 'ClienteListIdNomeService', 'PrioridadeListService', 'ColaboradorListIdNomeService', 'SituacaoSolicListService','SituacaoSolicCrudService', 'SolicitacaoCrudService', 'SituacaoSolicEncerramentoService',
    function($scope, $routeParams, $location, ClienteListIdNomeService, PrioridadeListService, ColaboradorListIdNomeService, SituacaoSolicListService, SituacaoSolicCrudService, SolicitacaoCrudService, SituacaoSolicEncerramentoService) {
	
	var id = $routeParams.id;

	if ($routeParams.desabilitar == "true") {
		$scope.desabilitar = true;
	} else {
		$scope.desabilitar = false;
	}
	
	$scope.solicitacao = {};
	$scope.listaClientes = {};
	$scope.listaPrioridades = {};
	$scope.listaColaboradores = {};
	$scope.listaSituacoes = {};
	$scope.sucesso = false;
	$scope.temErro = false;
	$scope.mensagem = null;
	$scope.solicitacao.dataHoraSolicitacao = new Date();
	$scope.solicitacao.execucao = '0';
	$scope.listaPercExecucoes = ["0","10","20","30","40","50","60","70","80","90","100"];
	document.getElementById("field_titulo").focus();
	
	// Busca lista de clientes (id e nome)
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
	
	// Busca lista de colaboradores ativos
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
			if (id == 'nova') {
				var sit = situacao.encontrarNaLista(response, 'Nova')
				if (sit != undefined) {
					$scope.solicitacao.situacao = sit;
				}
			}
		}, 
		function error(errorResponse) {
			console.log("Error:" + JSON.stringify(errorResponse));
			return;
		}
    );
	
	// ID informado, inicia a busca da solicitacao.
	// Senao, considera novo cadastro.
	if (id != "nova") {
		buscarSolicitacao(id);
	}
	
	// Volta para a lista
	$scope.retornar = function() {
		$location.path('/solicitacoes');
	};
	
	// Salva a solicitacao
	$scope.salvar = function(retornar) {
		
		// Formulario nao valido, cancela operacao
		$scope.temErro = !$scope.solicitacaoForm.$valid;
		if ($scope.temErro == true) {
			// Monta mensagem de erro
			verificarCampos();
			
			return;
		}
		
		if ($scope.solicitacao.id == null) {
			SolicitacaoCrudService.save(
					$scope.solicitacao,
					function success(response) {
						$scope.solicitacao = response;
						
						// A data vem no formato de milesegundos
						if ($scope.solicitacao.dataHoraSolicitacao) {
							$scope.solicitacao.dataHoraSolicitacao = new Date($scope.solicitacao.dataHoraSolicitacao);
						}
						
						$scope.sucesso = true;
					}, 
					function error(errorResponse) {
						console.log("Error:" + JSON.stringify(errorResponse));
						return;
					});
		} else {
			SolicitacaoCrudService.update(
					$scope.solicitacao,
					function success(response) {
						$scope.solicitacao = response;
						
						// A data vem no formato de milesegundos
						if ($scope.solicitacao.dataHoraSolicitacao) {
							$scope.solicitacao.dataHoraSolicitacao = new Date($scope.solicitacao.dataHoraSolicitacao);
						}
						
						if ($scope.solicitacao.dataHoraAtender) {
							$scope.solicitacao.dataHoraAtender = new Date($scope.solicitacao.dataHoraAtender);
						}
						
						if ($scope.solicitacao.dataAtendimento) {
							$scope.solicitacao.dataAtendimento = new Date($scope.solicitacao.dataAtendimento);
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
			$location.path('/solicitacoes');
		}
		
	};
	
	$scope.concluir = function() {
		if ($scope.solicitacao.situacao.encerrada == true) {
			$scope.temErro = true;
			$scope.sucesso = false
			$scope.mensagem = 'A solicitação encontra-se em situação encerrada.'
			return;
		}
		
		// Identifica situacao de encerramento
		SituacaoSolicEncerramentoService.get(
			{},
			function success(response) {
				$scope.solicitacao.situacao = response;
				$scope.solicitacao.dataHoraAtendimento = new Date();
				$scope.solicitacao.execucao = '100';
				$scope.salvar(true);
			}, 
			function error(errorResponse) {
				$scope.temErro = true;
				$scope.sucesso = false
				$scope.mensagem = 'Ao menos uma das situações cadastradas deve possuir a situação de encerrada.'
				return;
			});
		
	};
	
	// Busca os dados da solicitacao
	function buscarSolicitacao(id) {
		SolicitacaoCrudService.get(
				{id: id},
				function success(response) {
					$scope.solicitacao = response;
					
					// A data vem no formato de milesegundos
					if ($scope.solicitacao.dataHoraSolicitacao) {
						$scope.solicitacao.dataHoraSolicitacao = new Date($scope.solicitacao.dataHoraSolicitacao);
					}
					
					if ($scope.solicitacao.dataHoraAtender) {
						$scope.solicitacao.dataHoraAtender = new Date($scope.solicitacao.dataHoraAtender);
					}
					
					if ($scope.solicitacao.dataHoraAtendimento) {
						$scope.solicitacao.dataHoraAtendimento = new Date($scope.solicitacao.dataHoraAtendimento);
					}
				}, 
				function error(errorResponse) {
					console.log("Error:" + JSON.stringify(errorResponse));
					return;
				});
		
	};
	
	function verificarCampos() {
		$scope.mensagem = "";
		
		if ($scope.solicitacaoForm.titulo.$error.required) {
			$scope.mensagem += "Titulo é requerido. ";
		}
		
		if ($scope.solicitacaoForm.cliente.$error.required) {
			$scope.mensagem += "Cliente é requerido. ";
		}
		
		if ($scope.solicitacaoForm.solicitante.$error.required) {
			$scope.mensagem += "Solicitante é requerido. ";
		}
		
		if ($scope.solicitacaoForm.dataHoraSolicitacao.$error.required) {
			$scope.mensagem += "Data/Hora pedido é requerido. ";
		}
		
		if ($scope.solicitacaoForm.prioridade.$error.required) {
			$scope.mensagem += "Prioridade é requerido. "; 
		}
		
		if ($scope.solicitacaoForm.colaborador.$error.required) {
			$scope.mensagem += "Atribuido para é requerido. "; 
		}
		
		if ($scope.solicitacaoForm.situacao.$error.required) {
			$scope.mensagem += "Situação é requerida. "; 
		}
		
		if ($scope.solicitacaoForm.solicitacao.$error.required) {
			$scope.mensagem += "Descrição da solicitação é requerida. "; 
		}
	};
	
} ]);