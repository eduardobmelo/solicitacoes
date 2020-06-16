INSERT INTO tb_colaborador(
            cb_nome, cb_data_nascto, cb_vinculo_funcao, cb_data_admissao, 
            cb_data_demissao, cb_cpf, cb_telefone_principal, cb_telefone_celular, 
            cb_email, cb_cep, mu_id, cb_complemento, cb_endereco, cb_bairro, 
            cb_numero, cb_situacao)
    VALUES ('Silmar Oliveira do Amaral', now(), 'Presidente', now(), 
            null, '12345678901', '6733030011', null, 
            'silmar.amaral@audivisa.com.br', '79100000', 4156, NULL, 'Rua X', 'Centro', 
            '000', 'Ativo');

INSERT INTO tb_usuario(us_login, us_senha, us_data_cadastro, cb_id, us_situacao, 
            us_facebook)
    VALUES ('silmar.amaral@audivisa.com.br', 'E8D95A51F3AF4A3B134BF6BB680A213A', now(), 1, 'Ativo', 
            false);