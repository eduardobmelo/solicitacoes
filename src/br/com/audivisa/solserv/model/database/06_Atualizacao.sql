ALTER TABLE tb_objeto_seg
  ADD COLUMN os_hierarquia character varying(20);
COMMENT ON COLUMN tb_objeto_seg.os_hierarquia IS 'Código hierarquico do objeto.';

update tb_objeto_seg
set os_hierarquia = '01'
where os_codigo = 'dashBoard';

update tb_objeto_seg
set os_hierarquia = '02'
where os_codigo = 'solicitacao.lista';

update tb_objeto_seg
set os_hierarquia = '02.01'
where os_codigo = 'solicitacao.nova';

update tb_objeto_seg
set os_hierarquia = '02.02'
where os_codigo = 'solicitacao.editar';

update tb_objeto_seg
set os_hierarquia = '02.03'
where os_codigo = 'solicitacao.visualizar';

update tb_objeto_seg
set os_hierarquia = '02.04'
where os_codigo = 'solicitacao.excluir';

update tb_objeto_seg
set os_hierarquia = '03'
where os_codigo = 'cliente.lista';

update tb_objeto_seg
set os_hierarquia = '03.01'
where os_codigo = 'cliente.nova';

update tb_objeto_seg
set os_hierarquia = '03.02'
where os_codigo = 'cliente.editar';

update tb_objeto_seg
set os_hierarquia = '03.03'
where os_codigo = 'cliente.visualizar';

update tb_objeto_seg
set os_hierarquia = '03.04'
where os_codigo = 'cliente.excluir';

update tb_objeto_seg
set os_hierarquia = '04'
where os_codigo = 'cliente.contato.lista';

update tb_objeto_seg
set os_hierarquia = '04.01'
where os_codigo = 'cliente.contato.nova';

update tb_objeto_seg
set os_hierarquia = '04.02'
where os_codigo = 'cliente.contato.editar';

update tb_objeto_seg
set os_hierarquia = '04.03'
where os_codigo = 'cliente.contato.visualizar';

update tb_objeto_seg
set os_hierarquia = '04.04'
where os_codigo = 'cliente.contato.excluir';

update tb_objeto_seg
set os_hierarquia = '05'
where os_codigo = 'colaborador.lista';

update tb_objeto_seg
set os_hierarquia = '05.01'
where os_codigo = 'colaborador.nova';

update tb_objeto_seg
set os_hierarquia = '05.02'
where os_codigo = 'colaborador.editar';

update tb_objeto_seg
set os_hierarquia = '05.03'
where os_codigo = 'colaborador.visualizar';

update tb_objeto_seg
set os_hierarquia = '05.04'
where os_codigo = 'colaborador.excluir';

update tb_objeto_seg
set os_hierarquia = '06'
where os_codigo = 'relatorios';

update tb_objeto_seg
set os_hierarquia = '06.01'
where os_codigo = 'relatorio.solic.cliente';

update tb_objeto_seg
set os_hierarquia = '06.02'
where os_codigo = 'relatorio.solic.colaborador';

update tb_objeto_seg
set os_hierarquia = '07'
where os_codigo = 'cad.basicos';

update tb_objeto_seg
set os_hierarquia = '07.01.01'
where os_codigo = 'prioridade.lista';

update tb_objeto_seg
set os_hierarquia = '07.01.02'
where os_codigo = 'prioridade.nova';

update tb_objeto_seg
set os_hierarquia = '07.01.03'
where os_codigo = 'prioridade.editar';

update tb_objeto_seg
set os_hierarquia = '07.01.04'
where os_codigo = 'prioridade.visualizar';

update tb_objeto_seg
set os_hierarquia = '07.01.05'
where os_codigo = 'prioridade.excluir';

update tb_objeto_seg
set os_hierarquia = '07.02.01'
where os_codigo = 'situacao.lista';

update tb_objeto_seg
set os_hierarquia = '07.02.02'
where os_codigo = 'situacao.nova';

update tb_objeto_seg
set os_hierarquia = '07.02.03'
where os_codigo = 'situacao.editar';

update tb_objeto_seg
set os_hierarquia = '07.02.04'
where os_codigo = 'situacao.visualizar';

update tb_objeto_seg
set os_hierarquia = '07.02.05'
where os_codigo = 'situacao.excluir';

update tb_objeto_seg
set os_hierarquia = '08'
where os_codigo = 'seguranca';

update tb_objeto_seg
set os_hierarquia = '08.01.01'
where os_codigo = 'seguranca.usuario.lista';

update tb_objeto_seg
set os_hierarquia = '08.01.02'
where os_codigo = 'seguranca.usuario.nova';

update tb_objeto_seg
set os_hierarquia = '08.01.03'
where os_codigo = 'seguranca.usuario.editar';

update tb_objeto_seg
set os_hierarquia = '08.01.04'
where os_codigo = 'seguranca.usuario.visualizar';

update tb_objeto_seg
set os_hierarquia = '08.01.05'
where os_codigo = 'seguranca.usuario.excluir';

update tb_objeto_seg
set os_hierarquia = '08.02.01'
where os_codigo = 'seguranca.papel.lista';

update tb_objeto_seg
set os_hierarquia = '08.02.02'
where os_codigo = 'seguranca.papel.nova';

update tb_objeto_seg
set os_hierarquia = '08.02.03'
where os_codigo = 'seguranca.papel.editar';

update tb_objeto_seg
set os_hierarquia = '08.02.04'
where os_codigo = 'seguranca.papel.visualizar';

update tb_objeto_seg
set os_hierarquia = '08.02.05'
where os_codigo = 'seguranca.papel.excluir';




