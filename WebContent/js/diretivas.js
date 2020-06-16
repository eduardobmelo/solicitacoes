'use strict';

var solservDiretivas = angular.module('solservDiretivas',[]);

solservDiretivas.directive('sentinela', function() {
	return {
		restrict: 'A',
		scope: false,
		link: function(scope, element, attrs) {
			scope.$watch('permissoes', function (perm) {
				hide(perm);
	        }, true);
			
			function hide(lista) {
				if (lista == undefined) {
					if (element[0].nodeName == 'LI') {
						element.attr('class','hide');
					} else if (element[0].nodeName == 'BUTTON') {
						element.attr('ng-hide','true');
					}
				} else {
					if (lista.length > 0) {
						if (lista.indexOf(attrs.sentinela) == -1) {
							if (element[0].nodeName == 'LI') {
								element.attr('class','hide');
							} else if (element[0].nodeName == 'BUTTON') {
								element.attr('ng-hide','true');
							}
						} else {
							if (element[0].nodeName == 'LI') {
								element.attr('class','');
							} else if (element[0].nodeName == 'BUTTON') {
								element.attr('ng-hide','false');
							}
						}
					}
				}
			}
		}
	}
});
