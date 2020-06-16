package br.com.correios.bsb.sigep.master.bean.cliente;

public class AtendeClienteProxy implements br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente {
  private String _endpoint = null;
  private br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente atendeCliente = null;
  
  public AtendeClienteProxy() {
    _initAtendeClienteProxy();
  }
  
  public AtendeClienteProxy(String endpoint) {
    _endpoint = endpoint;
    _initAtendeClienteProxy();
  }
  
  private void _initAtendeClienteProxy() {
    try {
      atendeCliente = (new br.com.correios.bsb.sigep.master.bean.cliente.AtendeClienteServiceLocator()).getAtendeClientePort();
      if (atendeCliente != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)atendeCliente)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)atendeCliente)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (atendeCliente != null)
      ((javax.xml.rpc.Stub)atendeCliente)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente getAtendeCliente() {
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente;
  }
  
  public java.lang.Long fechaPlp(java.lang.String xml, java.lang.Long idPlpCliente, java.lang.String cartaoPostagem, java.lang.String faixaEtiquetas, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.fechaPlp(xml, idPlpCliente, cartaoPostagem, faixaEtiquetas, usuario, senha);
  }
  
  public br.com.correios.bsb.sigep.master.bean.cliente.Retorno[] registrarPedidosInformacao(br.com.correios.bsb.sigep.master.bean.cliente.PedidoInformacaoRegistro[] pedidosInformacao, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.registrarPedidosInformacao(pedidosInformacao, usuario, senha);
  }
  
  public br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP buscaCliente(java.lang.String idContrato, java.lang.String idCartaoPostagem, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.buscaCliente(idContrato, idCartaoPostagem, usuario, senha);
  }
  
  public boolean validaEtiquetaPLP(java.lang.String numeroEtiqueta, java.lang.Long idPlp, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.validaEtiquetaPLP(numeroEtiqueta, idPlp, usuario, senha);
  }
  
  public boolean verificaDisponibilidadeServico(java.lang.Integer codAdministrativo, java.lang.String numeroServico, java.lang.String cepOrigem, java.lang.String cepDestino, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.verificaDisponibilidadeServico(codAdministrativo, numeroServico, cepOrigem, cepDestino, usuario, senha);
  }
  
  public br.com.correios.bsb.sigep.master.bean.cliente.StatusPlp getStatusPLP(br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal[] arg0, java.lang.String arg1) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.getStatusPLP(arg0, arg1);
  }
  
  public java.lang.String bloquearObjeto(java.lang.String numeroEtiqueta, java.lang.Long idPlp, br.com.correios.bsb.sigep.master.bean.cliente.TipoBloqueio tipoBloqueio, br.com.correios.bsb.sigep.master.bean.cliente.Acao acao, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.bloquearObjeto(numeroEtiqueta, idPlp, tipoBloqueio, acao, usuario, senha);
  }
  
  public java.lang.String solicitaEtiquetas(java.lang.String tipoDestinatario, java.lang.String identificador, java.lang.Long idServico, java.lang.Integer qtdEtiquetas, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.solicitaEtiquetas(tipoDestinatario, identificador, idServico, qtdEtiquetas, usuario, senha);
  }
  
  public br.com.correios.bsb.sigep.master.bean.cliente.MensagemRetornoPIMaster[] obterMensagemRetornoPI() throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.obterMensagemRetornoPI();
  }
  
  public br.com.correios.bsb.sigep.master.bean.cliente.Retorno[] consultarPedidosInformacao(br.com.correios.bsb.sigep.master.bean.cliente.PedidoInformacaoConsulta[] pedidosInformacao, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.consultarPedidosInformacao(pedidosInformacao, usuario, senha);
  }
  
  public java.lang.String buscaPagamentoEntrega(java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.buscaPagamentoEntrega(usuario, senha);
  }
  
  public int[] geraDigitoVerificadorEtiquetas(java.lang.String[] etiquetas, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.geraDigitoVerificadorEtiquetas(etiquetas, usuario, senha);
  }
  
  public java.lang.Boolean validarPostagemReversa(java.lang.Integer codAdministrativo, java.lang.Integer codigoServico, java.lang.String cepDestinatario, br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversaTO coleta, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.validarPostagemReversa(codAdministrativo, codigoServico, cepDestinatario, coleta, usuario, senha);
  }
  
  public java.lang.Long fechaPlpVariosServicos(java.lang.String xml, java.lang.Long idPlpCliente, java.lang.String cartaoPostagem, java.lang.String[] listaEtiquetas, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.fechaPlpVariosServicos(xml, idPlpCliente, cartaoPostagem, listaEtiquetas, usuario, senha);
  }
  
  public java.lang.Boolean cancelarObjeto(java.lang.Long idPlp, java.lang.String numeroEtiqueta, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException, br.com.correios.bsb.sigep.master.bean.cliente.Exception{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.cancelarObjeto(idPlp, numeroEtiqueta, usuario, senha);
  }
  
  public boolean validaPlp(long cliente, java.lang.String numero, long diretoria, java.lang.String cartao, java.lang.String unidadePostagem, java.lang.Long servico, java.lang.String[] servicosAdicionais, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.validaPlp(cliente, numero, diretoria, cartao, unidadePostagem, servico, servicosAdicionais, usuario, senha);
  }
  
  public java.lang.Boolean validarPostagemSimultanea(java.lang.Integer codAdministrativo, java.lang.Integer codigoServico, java.lang.String cepDestinatario, br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultaneaTO coleta, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.validarPostagemSimultanea(codAdministrativo, codigoServico, cepDestinatario, coleta, usuario, senha);
  }
  
  public br.com.correios.bsb.sigep.master.bean.cliente.EmbalagemLRSMaster[] obterEmbalagemLRS() throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.obterEmbalagemLRS();
  }
  
  public br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamentoTO cancelarPedidoScol(java.lang.Integer codAdministrativo, java.lang.String idPostagem, java.lang.String tipo, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.cancelarPedidoScol(codAdministrativo, idPostagem, tipo, usuario, senha);
  }
  
  public br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP[] buscaServicos(java.lang.String idContrato, java.lang.String idCartaoPostagem, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.buscaServicos(idContrato, idCartaoPostagem, usuario, senha);
  }
  
  public java.lang.String solicitarPostagemScol(java.lang.Integer codAdministrativo, java.lang.String xml, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.solicitarPostagemScol(codAdministrativo, xml, usuario, senha);
  }
  
  public java.lang.String solicitaPLP(java.lang.Long idPlpMaster, java.lang.String numEtiqueta, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.solicitaPLP(idPlpMaster, numEtiqueta, usuario, senha);
  }
  
  public br.com.correios.bsb.sigep.master.bean.cliente.StatusCartao getStatusCartaoPostagem(java.lang.String numeroCartaoPostagem, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.getStatusCartaoPostagem(numeroCartaoPostagem, usuario, senha);
  }
  
  public java.lang.String solicitaXmlPlp(java.lang.Long idPlpMaster, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.solicitaXmlPlp(idPlpMaster, usuario, senha);
  }
  
  public br.com.correios.bsb.sigep.master.bean.cliente.MotivoPIMaster[] obterMotivosPI() throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.obterMotivosPI();
  }
  
  public br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP buscaContrato(java.lang.String numero, long diretoria, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.buscaContrato(numero, diretoria, usuario, senha);
  }
  
  public java.lang.String consultaSRO(java.lang.String[] listaObjetos, java.lang.String tipoConsulta, java.lang.String tipoResultado, java.lang.String usuarioSro, java.lang.String senhaSro) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.consultaSRO(listaObjetos, tipoConsulta, tipoResultado, usuarioSro, senhaSro);
  }
  
  public java.util.Calendar obterClienteAtualizacao(java.lang.String cnpjCliente, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.obterClienteAtualizacao(cnpjCliente, usuario, senha);
  }
  
  public java.lang.Boolean integrarUsuarioScol(java.lang.Integer codAdministrativo, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.integrarUsuarioScol(codAdministrativo, usuario, senha);
  }
  
  public boolean atualizaPLP(java.lang.Long idPlpMaster, java.lang.String numEtiqueta, java.lang.String usuario, java.lang.String senha, java.lang.String xml) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.atualizaPLP(idPlpMaster, numEtiqueta, usuario, senha, xml);
  }
  
  public br.com.correios.bsb.sigep.master.bean.cliente.AssuntoPIMaster[] obterAssuntosPI() throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.obterAssuntosPI();
  }
  
  public br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP consultaCEP(java.lang.String cep) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SQLException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.consultaCEP(cep);
  }
  
  
}