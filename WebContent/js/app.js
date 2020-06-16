'use strict';

var solservApp = angular.module('solservApp',
		[ 'ngRoute', 
		  'solservControllers', 
		  'solservDiretivas',
		  'solicitacaoControllers',
		  'prioridadeControllers',
		  'situacaoControllers',
		  'objetoControllers',
		  'papelControllers',
		  'usuarioControllers',
		  'relatControllers',
		  'solservServices',
		  'segServices',
		  'ui.mask', 
		  'datatables', 
		  'angular-media-preview']);

solservApp.config([ '$routeProvider', '$locationProvider', function($routeProvider, $locationProvider) {
	$routeProvider.when('/clientes', {
		templateUrl : 'partials/cliente/clienteList.html',
		controller : 'ClientesCtrl'
	}).when('/novoCliente', {
		templateUrl : 'partials/cliente/clienteEdit.html',
		controller : 'ClienteNovoCtrl'
	}).when('/editarCliente/:id/:desabilitar', {
		templateUrl : 'partials/cliente/clienteEdit.html',
		controller : 'ClienteEdicaoCtrl'
	}).when('/dash', {
		templateUrl : 'partials/dash.html',
		controller : 'DashboardCtrl'
	}).when('/colaboradores', {
		templateUrl : 'partials/colaborador/colaboradorList.html',
		controller : 'ColaboradoresCtrl'
	}).when('/novoColaborador', {
		templateUrl : 'partials/colaborador/colaboradorEdit.html',
		controller : 'ColaboradorNovoCtrl'
	}).when('/editarColaborador/:id/:desabilitar', {
		templateUrl : 'partials/colaborador/colaboradorEdit.html',
		controller : 'ColaboradorEdicaoCtrl'
	}).when('/solicitacoes', {
		templateUrl : 'partials/solicitacao/solicitacaoList.html',
		controller : 'SolicitacoesCtrl'
	}).when('/solicitacao/:id', {
		templateUrl : 'partials/solicitacao/solicitacaoEdit.html',
		controller : 'SolicitacaoEdicaoCtrl'
	}).when('/solicitacao/:id/:desabilitar', {
		templateUrl : 'partials/solicitacao/solicitacaoEdit.html',
		controller : 'SolicitacaoEdicaoCtrl'
	}).when('/prioridades', {
		templateUrl : 'partials/prioridade/prioridadeList.html',
		controller : 'PrioridadesCtrl'
	}).when('/prioridade/:id/:desabilitar', {
		templateUrl : 'partials/prioridade/prioridadeEdit.html',
		controller : 'PrioridadeEdicaoCtrl'
	}).when('/situacoes', {
		templateUrl : 'partials/situacao/situacaoList.html',
		controller : 'SituacoesCtrl'
	}).when('/situacao/:id/:desabilitar', {
		templateUrl : 'partials/situacao/situacaoEdit.html',
		controller : 'SituacaoEdicaoCtrl'
	}).when('/papeis', {
		templateUrl : 'partials/papel/papelList.html',
		controller : 'PapeisCtrl'
	}).when('/papel/:id/:desabilitar', {
		templateUrl : 'partials/papel/papelEdit.html',
		controller : 'PapelEdicaoCtrl'
	}).when('/usuarios', {
		templateUrl : 'partials/usuario/usuarioList.html',
		controller : 'UsuariosCtrl'
	}).when('/usuario/:id/:desabilitar', {
		templateUrl : 'partials/usuario/usuarioEdit.html',
		controller : 'UsuarioEdicaoCtrl'
	}).when('/novaSenha', {
		templateUrl : 'partials/usuario/usuarioSenha.html',
		controller : 'UsuarioSenhaCtrl'
	}).when('/rel-solicitacao-colaborador', {
		templateUrl : 'partials/relatorio/relSolicPorColaborador.html',
		controller : 'RelSolicPorColaboradorCtrl'
	}).when('/rel-solicitacao-cliente', {
		templateUrl : 'partials/relatorio/relSolicPorCliente.html',
		controller : 'RelSolicPorClienteCtrl'
	});
	
	$locationProvider.html5Mode(false);
} ]);