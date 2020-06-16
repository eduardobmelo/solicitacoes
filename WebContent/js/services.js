'use strict';

var solservServices = angular.module('solservServices',['ngResource','base64']);

solservServices.factory('ClienteListService', ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/cliente/todos", {}, {
		get: {method: 'GET', cache: false, isArray: true, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
	
}]);

solservServices.factory('ClienteListIdNomeService', ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/cliente/todos/id/nome", {}, {
		get: {method: 'GET', cache: false, isArray: true, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
	
}]);

solservServices.factory('ClienteCrudService', ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/cliente/crud", {}, {
		save: {method: 'POST', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}},
		update: {method: 'PUT', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}},
		get: {method: 'GET', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}},
		remove: {method: 'DELETE', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
}]);

solservServices.factory('ContatoCrudService', ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/contatoCliente/crud", {}, {
		save: {method: 'POST', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}},
		update: {method: 'PUT', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}},
		get: {method: 'GET', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}},
		remove: {method: 'DELETE', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
}]);

solservServices.factory('EstadoListService', ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/estado/todos", {}, {
		get: {method: 'GET', cache: false, isArray: true, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
}]);

solservServices.factory('MunicipioListService', ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/municipio/todosPorUf", {}, {
		get: {method: 'GET', cache: false, isArray: true, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
}]);

solservServices.factory('ContatoClienteListService', ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/contatoCliente/todos", {}, {
		get: {method: 'GET', cache: false, isArray: true, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
}]);

solservServices.factory('DashboardIndicadoresService', ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/dashboard/indicadores", {}, {
		get: {method: 'GET', cache: false, isArray: true, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
}]);

solservServices.factory('DashboarGraficoSolicService', ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/dashboard/grafico-sol-col", {}, {
		get: {method: 'GET', cache: false, isArray: true, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
}]);

solservServices.factory('ColaboradorListService', ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/colaborador/todos", {}, {
		get: {method: 'GET', cache: false, isArray: true, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
}]);

solservServices.factory('ColaboradorListIdNomeService', ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/colaborador/todos/id/nome", {}, {
		get: {method: 'GET', cache: false, isArray: true, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
}]);

solservServices.factory('ColaboradorCrudService', ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/colaborador/crud", {}, {
		save: {method: 'POST', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}},
		update: {method: 'PUT', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}},
		get: {method: 'GET', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}},
		remove: {method: 'DELETE', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
}]);

solservServices.factory('ColaboradorFotoService', ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/colaborador/foto/:id", {id:'@id'}, {
		save: {method: 'POST', 
			transformRequest: angular.identity,
	        cache: false,
			isArray: false, 
			headers: {'Content-Type': undefined, 'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}},
		get: {method: 'GET', 
			cache: false,
			isArray: false, 
			headers: {'Content-Type': undefined, 'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
}]);

solservServices.factory('UsuarioListService', ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/usuario/todos", {}, {
		get: {method: 'GET', cache: false, isArray: true, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
}]);

solservServices.factory('UsuarioCrudService', ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/usuario/crud", {}, {
		save: {method: 'POST', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())} },
		update: {method: 'PUT', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}},
		get: {method: 'GET', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}},
		remove: {method: 'DELETE', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
}]);

solservServices.factory('UsuarioPermissaoService', ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/usuario/permissao", {}, {
		update: {method: 'PUT', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
}]);

solservServices.factory('UsuarioPermissaoNovosPapeis', ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/usuario/inserirNovosPapeis", {}, {
		insert: {method: 'GET', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
}]);

solservServices.factory('UsuarioNovaSenhaService', ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/usuario/novaSenha", {}, {
		save: {method: 'PUT', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
}]);

solservServices.factory('PrioridadeListService', ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/prioridade/todos", {}, {
		get: {method: 'GET', cache: false, isArray: true, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
}]);

solservServices.factory('PrioridadeCrudService', ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/prioridade/crud", {}, {
		save: {method: 'POST', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())} },
		update: {method: 'PUT', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}},
		get: {method: 'GET', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}},
		remove: {method: 'DELETE', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
}]);

solservServices.factory('SituacaoSolicListService', ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/situacaoSolicitacao/todos", {}, {
		get: {method: 'GET', cache: false, isArray: true, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
}]);

solservServices.factory('SituacaoSolicCrudService', ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/situacaoSolicitacao/crud", {}, {
		save: {method: 'POST', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())} },
		update: {method: 'PUT', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}},
		get: {method: 'GET', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}},
		remove: {method: 'DELETE', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
}]);

solservServices.factory('SituacaoSolicEncerramentoService', ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/situacaoSolicitacao/primeiraSituacaoEncerramento", {}, {
		get: {method: 'GET', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
}]);

solservServices.factory('SolicitacaoListService', ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/solicitacao/todos", {}, {
		get: {method: 'GET', cache: false, isArray: true, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
}]);

solservServices.factory('SolicitacaoCrudService', ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/solicitacao/crud", {}, {
		save: {method: 'POST', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())} },
		update: {method: 'PUT', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())} },
		get: {method: 'GET', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())} },
		remove: {method: 'DELETE', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())} }
	});
}]);

solservServices.factory('SolicitacaoPainelListService', ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/solicitacao/painel/abertas", {}, {
		get: {method: 'GET', cache: false, isArray: true, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
}]);

solservServices.factory('ObjetoListService', ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/objetoSeguranca/todos", {}, {
		get: {method: 'GET', cache: false, isArray: true, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
}]);

solservServices.factory('PapelListService', ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/papelSeguranca/todos", {}, {
		get: {method: 'GET', cache: false, isArray: true, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
}]);

solservServices.factory('PapelCrudService', ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/papelSeguranca/crud", {}, {
		save: {method: 'POST', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())} },
		update: {method: 'PUT', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}},
		get: {method: 'GET', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}},
		remove: {method: 'DELETE', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
}]);

solservServices.factory('PapelPermissaoCrudService', ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/papelSeguranca/permissao", {}, {
		update: {method: 'PUT', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
}]);

solservServices.factory("CepService", ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/cep", {}, {
		get: {method: 'GET', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
}]);

solservServices.factory("PermissoesService", ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/seguranca/permissoesUsuario", {}, {
		get: {method: 'GET', cache: false, isArray: true, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
}]);

solservServices.factory("RelSolicPorColaboradorService", ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/relatorios/solicitacoes/por/colaborador", {}, {
		get: {method: 'GET', cache: false, isArray: false, responseType: 'arraybuffer', headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
}]);

solservServices.factory("RelSolicPorClienteService", ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/relatorios/solicitacoes/por/cliente", {}, {
		get: {method: 'GET', cache: false, isArray: false, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
}]);

