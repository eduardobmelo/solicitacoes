'use strict';

var segServices = angular.module('segServices',['ngResource','ngCookies','base64']);

segServices.factory('Login', ['$resource', function($resource) {
	return $resource("/solicitacoes/services/seguranca/login", {}, {
		login: {method: 'GET', cache: false, isArray: false}
	});
}]);

segServices.factory('NovaSenhaService', ['$resource', function($resource) {
	return $resource("/solicitacoes/services/seguranca/novaSenha", {}, {
		save: {method: 'GET', cache: false, isArray: false}
	});
}]);

segServices.factory('CredencialService', ['$resource', function($resource) {
	return $resource("/solicitacoes/services/seguranca/checkCreds", {}, {
		verifica: {method: 'GET', cache: false, isArray: false}
	});
}]);

segServices.factory('PermissaoUsuarioService', ['$resource','base64','getToken','getUsername', function($resource, base64, getToken, getUsername){
	return $resource("/solicitacoes/services/seguranca/permissoesUsuario", {}, {
		get: {method: 'GET', cache: false, isArray: true, headers: {'Authorization':'Basic ' + base64.encode(getUsername() + ":" + getToken())}}
	});
}]);

segServices.factory('setCreds', ['$cookies', function($cookies) {
	return function(un, pw, re, uid, cid) {
		if (re) {
			var expireDate = new Date(); 
			expireDate.setDate(expireDate.getDate() + 10); 
			
			$cookies.put('solServCreds', pw, {
				  expires: expireDate
			});
			$cookies.put('solServUsername', un, {
				  expires: expireDate
			});
			$cookies.put('solServRemember', re, {
				  expires: expireDate
			});
			$cookies.put('solServUid', uid, {
				  expires: expireDate
			});
			$cookies.put('solServCid', cid, {
				  expires: expireDate
			});
		} else {
			$cookies.put('solServCreds', pw);
			$cookies.put('solServUsername', un);
			$cookies.put('solServRemember', re);
			$cookies.put('solServUid', uid);
			$cookies.put('solServCid', cid);
		}
	};
}]);

segServices.factory('deleteCreds', ['$cookies', function($cookies) {
	return function() {
		$cookies.put('solServCreds','');
		$cookies.put('solServUid','');
		$cookies.put('solServCid','');
	};
}]);

segServices.factory('getToken', ['$cookies', function($cookies) {
	return function() {
		var returnVal = "";
		var solServCreds = $cookies.get('solServCreds');
		
		if (solServCreds !== undefined && solServCreds !== "") {
			returnVal = solServCreds;
		}
		
		return returnVal;
	};
}]);


segServices.factory('getUsername', ['$cookies', function($cookies) {
	return function() {
		var returnVal = "";
		var solServUsername = $cookies.get('solServUsername');
		
		if (solServUsername !== undefined && solServUsername !== "") {
			returnVal = solServUsername;
		}
		return returnVal;
	};
}]);

segServices.factory('getRemember', ['$cookies', function($cookies) {
	return function() {
		var solServRemember = $cookies.get('solServRemember');
		
		if (solServRemember !== undefined && solServRemember !== "") {
			if (solServRemember == 'true') {
				return true;
			}
		}
		return false;
	};
}]);

segServices.factory('getUid', ['$cookies', function($cookies) {
	return function() {
		var returnVal = "";
		var solServUid = $cookies.get('solServUid');
		
		if (solServUid !== undefined && solServUid !== "") {
			returnVal = solServUid;
		}
		return returnVal;
	};
}]);

segServices.factory('getCid', ['$cookies', function($cookies) {
	return function() {
		var returnVal = "";
		var solServCid = $cookies.get('solServCid');
		
		if (solServCid !== undefined && solServCid !== "") {
			returnVal = solServCid;
		}
		return returnVal;
	};
}]);

segServices.factory('setFilter', ['$cookies', function($cookies) {
	return function(name, value) {
		var expireDate = new Date(); 
		expireDate.setDate(expireDate.getDate() + 1);
		
		if (value == "null") {
			value = "";
		};
		
		$cookies.put(name, value, {
			  expires: expireDate
		});
	};
}]);

segServices.factory('getFilter', ['$cookies', function($cookies) {
	return function(name) {
		var value = $cookies.get(name);
		
		if (value !== undefined && value !== "") {
			return value;
		}
		return "";
	};
}]);