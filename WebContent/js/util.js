/**
 * 
 */

var estado = {
		encontrarNaLista: function(lista, nome) {
			var uf = undefined;
			
			lista.forEach(function(entry) {
				if (entry.id == nome) {
					uf = entry;
				}
			});
			return uf;
		}
};

var municipio = {
		encontrarNaLista: function(lista, nome) {
			var mun = undefined;
			
			lista.forEach(function(entry) {
				if (entry.nome == nome) {
					mun = entry;
				}
			});
			return mun;
		}
};

var situacao = {
		encontrarNaLista: function(lista, nome) {
			var sit = undefined;
			
			lista.forEach(function(entry) {
				if (entry.descricao == nome) {
					sit = entry;
				}
			});
			return sit;
		}
};

var sentinela = {
		encontrarNaLista: function(lista, nome) {
			var mun = undefined;
			
			lista.forEach(function(entry) {
				if (entry.nome == nome) {
					mun = entry;
				}
			});
			return mun;
		}
};