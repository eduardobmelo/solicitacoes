/**
 * AtendeClienteServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class AtendeClienteServiceSoapBindingStub extends org.apache.axis.client.Stub implements br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[32];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("fechaPlp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idPlpCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cartaoPostagem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "faixaEtiquetas"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(java.lang.Long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registrarPedidosInformacao");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pedidosInformacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "pedidoInformacaoRegistro"), br.com.correios.bsb.sigep.master.bean.cliente.PedidoInformacaoRegistro[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "retorno"));
        oper.setReturnClass(br.com.correios.bsb.sigep.master.bean.cliente.Retorno[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("buscaCliente");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idContrato"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idCartaoPostagem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "clienteERP"));
        oper.setReturnClass(br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validaEtiquetaPLP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numeroEtiqueta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idPlp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("verificaDisponibilidadeServico");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codAdministrativo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numeroServico"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cepOrigem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cepDestino"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getStatusPLP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "objetoPostal"), br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "statusPlp"));
        oper.setReturnClass(br.com.correios.bsb.sigep.master.bean.cliente.StatusPlp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("bloquearObjeto");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numeroEtiqueta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idPlp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tipoBloqueio"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "tipoBloqueio"), br.com.correios.bsb.sigep.master.bean.cliente.TipoBloqueio.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "acao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "acao"), br.com.correios.bsb.sigep.master.bean.cliente.Acao.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("solicitaEtiquetas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tipoDestinatario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "identificador"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idServico"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "qtdEtiquetas"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obterMensagemRetornoPI");
        oper.setReturnType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "mensagemRetornoPIMaster"));
        oper.setReturnClass(br.com.correios.bsb.sigep.master.bean.cliente.MensagemRetornoPIMaster[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarPedidosInformacao");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pedidosInformacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "pedidoInformacaoConsulta"), br.com.correios.bsb.sigep.master.bean.cliente.PedidoInformacaoConsulta[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "retorno"));
        oper.setReturnClass(br.com.correios.bsb.sigep.master.bean.cliente.Retorno[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("buscaPagamentoEntrega");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("geraDigitoVerificadorEtiquetas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "etiquetas"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelarObjeto");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idPlp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numeroEtiqueta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "Exception"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.Exception",
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "Exception"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("fechaPlpVariosServicos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idPlpCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cartaoPostagem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "listaEtiquetas"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(java.lang.Long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validarPostagemReversa");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codAdministrativo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoServico"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cepDestinatario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "coleta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "coletaReversaTO"), br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversaTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validaPlp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numero"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "diretoria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cartao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unidadePostagem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "servico"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "servicosAdicionais"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelarPedidoScol");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codAdministrativo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idPostagem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tipo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "retornoCancelamentoTO"));
        oper.setReturnClass(br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamentoTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obterEmbalagemLRS");
        oper.setReturnType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "embalagemLRSMaster"));
        oper.setReturnClass(br.com.correios.bsb.sigep.master.bean.cliente.EmbalagemLRSMaster[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validarPostagemSimultanea");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codAdministrativo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoServico"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cepDestinatario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "coleta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "coletaSimultaneaTO"), br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultaneaTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("buscaServicos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idContrato"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idCartaoPostagem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "servicoERP"));
        oper.setReturnClass(br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("solicitarPostagemScol");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codAdministrativo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getStatusCartaoPostagem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numeroCartaoPostagem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "statusCartao"));
        oper.setReturnClass(br.com.correios.bsb.sigep.master.bean.cliente.StatusCartao.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("solicitaPLP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idPlpMaster"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numEtiqueta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("solicitaXmlPlp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idPlpMaster"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obterMotivosPI");
        oper.setReturnType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "motivoPIMaster"));
        oper.setReturnClass(br.com.correios.bsb.sigep.master.bean.cliente.MotivoPIMaster[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("buscaContrato");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numero"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "diretoria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "contratoERP"));
        oper.setReturnClass(br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultaSRO");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "listaObjetos"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tipoConsulta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tipoResultado"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuarioSro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senhaSro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obterClienteAtualizacao");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cnpjCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        oper.setReturnClass(java.util.Calendar.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("integrarUsuarioScol");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codAdministrativo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("atualizaPLP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idPlpMaster"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numEtiqueta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obterAssuntosPI");
        oper.setReturnType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "assuntoPIMaster"));
        oper.setReturnClass(br.com.correios.bsb.sigep.master.bean.cliente.AssuntoPIMaster[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultaCEP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cep"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "enderecoERP"));
        oper.setReturnClass(br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SQLException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SQLException",
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SQLException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"),
                      "br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException",
                      new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), 
                      false
                     ));
        _operations[31] = oper;

    }

    public AtendeClienteServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public AtendeClienteServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public AtendeClienteServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "acao");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.Acao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "assuntoPIMaster");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.AssuntoPIMaster.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "cartaoPostagemERP");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "categoriaServico");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.CategoriaServico.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "chancelaMaster");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.ChancelaMaster.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "cliente");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.Cliente.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "clienteERP");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "coletaReversaTO");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversaTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "coletaSimultaneaTO");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultaneaTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "coletaTO");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.ColetaTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "conta");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.Conta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "contratoERP");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "contratoERPPK");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.ContratoERPPK.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "destinatario");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.Destinatario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "embalagemLRSMaster");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.EmbalagemLRSMaster.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "enderecoERP");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "Exception");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.Exception.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "gerenteConta");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "mensagemRetornoPIMaster");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.MensagemRetornoPIMaster.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "motivoPIMaster");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.MotivoPIMaster.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "objetoPostal");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "objetoPostalPK");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostalPK.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "objetoSimplificadoTO");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.ObjetoSimplificadoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "objetoTO");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.ObjetoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "parametroMaster");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "pedidoInformacao");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.PedidoInformacao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "pedidoInformacaoConsulta");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.PedidoInformacaoConsulta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "pedidoInformacaoRegistro");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.PedidoInformacaoRegistro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "pessoa");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.Pessoa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "pessoaTO");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.PessoaTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "postagem");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.Postagem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "preListaPostagem");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "produtoTO");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.ProdutoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "remetente");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.Remetente.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "remetenteTO");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.RemetenteTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "retorno");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.Retorno.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "retornoCancelamentoTO");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamentoTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "servicoAdicionalERP");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "servicoERP");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "servicoSigep");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SQLException");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.SQLException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "statusCartao");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.StatusCartao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "statusGerente");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.StatusGerente.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "statusObjetoPostal");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.StatusObjetoPostal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "statusPlp");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.StatusPlp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "statusUsuario");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.StatusUsuario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "tipoBloqueio");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.TipoBloqueio.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "tipoGerente");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.TipoGerente.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "unidadePostagemERP");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "usuarioInstalacao");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "vigenciaERP");
            cachedSerQNames.add(qName);
            cls = br.com.correios.bsb.sigep.master.bean.cliente.VigenciaERP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public java.lang.Long fechaPlp(java.lang.String xml, java.lang.Long idPlpCliente, java.lang.String cartaoPostagem, java.lang.String faixaEtiquetas, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "fechaPlp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {xml, idPlpCliente, cartaoPostagem, faixaEtiquetas, usuario, senha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Long) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Long.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.Retorno[] registrarPedidosInformacao(br.com.correios.bsb.sigep.master.bean.cliente.PedidoInformacaoRegistro[] pedidosInformacao, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "registrarPedidosInformacao"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pedidosInformacao, usuario, senha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.correios.bsb.sigep.master.bean.cliente.Retorno[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.correios.bsb.sigep.master.bean.cliente.Retorno[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.correios.bsb.sigep.master.bean.cliente.Retorno[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP buscaCliente(java.lang.String idContrato, java.lang.String idCartaoPostagem, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaCliente"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idContrato, idCartaoPostagem, usuario, senha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean validaEtiquetaPLP(java.lang.String numeroEtiqueta, java.lang.Long idPlp, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "validaEtiquetaPLP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {numeroEtiqueta, idPlp, usuario, senha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean verificaDisponibilidadeServico(java.lang.Integer codAdministrativo, java.lang.String numeroServico, java.lang.String cepOrigem, java.lang.String cepDestino, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "verificaDisponibilidadeServico"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {codAdministrativo, numeroServico, cepOrigem, cepDestino, usuario, senha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.StatusPlp getStatusPLP(br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal[] arg0, java.lang.String arg1) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "getStatusPLP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.correios.bsb.sigep.master.bean.cliente.StatusPlp) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.correios.bsb.sigep.master.bean.cliente.StatusPlp) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.correios.bsb.sigep.master.bean.cliente.StatusPlp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String bloquearObjeto(java.lang.String numeroEtiqueta, java.lang.Long idPlp, br.com.correios.bsb.sigep.master.bean.cliente.TipoBloqueio tipoBloqueio, br.com.correios.bsb.sigep.master.bean.cliente.Acao acao, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "bloquearObjeto"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {numeroEtiqueta, idPlp, tipoBloqueio, acao, usuario, senha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String solicitaEtiquetas(java.lang.String tipoDestinatario, java.lang.String identificador, java.lang.Long idServico, java.lang.Integer qtdEtiquetas, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "solicitaEtiquetas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {tipoDestinatario, identificador, idServico, qtdEtiquetas, usuario, senha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.MensagemRetornoPIMaster[] obterMensagemRetornoPI() throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "obterMensagemRetornoPI"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.correios.bsb.sigep.master.bean.cliente.MensagemRetornoPIMaster[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.correios.bsb.sigep.master.bean.cliente.MensagemRetornoPIMaster[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.correios.bsb.sigep.master.bean.cliente.MensagemRetornoPIMaster[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.Retorno[] consultarPedidosInformacao(br.com.correios.bsb.sigep.master.bean.cliente.PedidoInformacaoConsulta[] pedidosInformacao, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "consultarPedidosInformacao"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pedidosInformacao, usuario, senha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.correios.bsb.sigep.master.bean.cliente.Retorno[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.correios.bsb.sigep.master.bean.cliente.Retorno[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.correios.bsb.sigep.master.bean.cliente.Retorno[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String buscaPagamentoEntrega(java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaPagamentoEntrega"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {usuario, senha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int[] geraDigitoVerificadorEtiquetas(java.lang.String[] etiquetas, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "geraDigitoVerificadorEtiquetas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {etiquetas, usuario, senha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (int[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (int[]) org.apache.axis.utils.JavaUtils.convert(_resp, int[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Boolean cancelarObjeto(java.lang.Long idPlp, java.lang.String numeroEtiqueta, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException, br.com.correios.bsb.sigep.master.bean.cliente.Exception {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "cancelarObjeto"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idPlp, numeroEtiqueta, usuario, senha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Boolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Boolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.Exception) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.Exception) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Long fechaPlpVariosServicos(java.lang.String xml, java.lang.Long idPlpCliente, java.lang.String cartaoPostagem, java.lang.String[] listaEtiquetas, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "fechaPlpVariosServicos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {xml, idPlpCliente, cartaoPostagem, listaEtiquetas, usuario, senha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Long) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Long.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Boolean validarPostagemReversa(java.lang.Integer codAdministrativo, java.lang.Integer codigoServico, java.lang.String cepDestinatario, br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversaTO coleta, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "validarPostagemReversa"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {codAdministrativo, codigoServico, cepDestinatario, coleta, usuario, senha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Boolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Boolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean validaPlp(long cliente, java.lang.String numero, long diretoria, java.lang.String cartao, java.lang.String unidadePostagem, java.lang.Long servico, java.lang.String[] servicosAdicionais, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "validaPlp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(cliente), numero, new java.lang.Long(diretoria), cartao, unidadePostagem, servico, servicosAdicionais, usuario, senha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamentoTO cancelarPedidoScol(java.lang.Integer codAdministrativo, java.lang.String idPostagem, java.lang.String tipo, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "cancelarPedidoScol"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {codAdministrativo, idPostagem, tipo, usuario, senha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamentoTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamentoTO) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamentoTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.EmbalagemLRSMaster[] obterEmbalagemLRS() throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "obterEmbalagemLRS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.correios.bsb.sigep.master.bean.cliente.EmbalagemLRSMaster[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.correios.bsb.sigep.master.bean.cliente.EmbalagemLRSMaster[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.correios.bsb.sigep.master.bean.cliente.EmbalagemLRSMaster[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Boolean validarPostagemSimultanea(java.lang.Integer codAdministrativo, java.lang.Integer codigoServico, java.lang.String cepDestinatario, br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultaneaTO coleta, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "validarPostagemSimultanea"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {codAdministrativo, codigoServico, cepDestinatario, coleta, usuario, senha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Boolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Boolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP[] buscaServicos(java.lang.String idContrato, java.lang.String idCartaoPostagem, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaServicos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idContrato, idCartaoPostagem, usuario, senha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String solicitarPostagemScol(java.lang.Integer codAdministrativo, java.lang.String xml, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "solicitarPostagemScol"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {codAdministrativo, xml, usuario, senha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.StatusCartao getStatusCartaoPostagem(java.lang.String numeroCartaoPostagem, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "getStatusCartaoPostagem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {numeroCartaoPostagem, usuario, senha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.correios.bsb.sigep.master.bean.cliente.StatusCartao) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.correios.bsb.sigep.master.bean.cliente.StatusCartao) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.correios.bsb.sigep.master.bean.cliente.StatusCartao.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String solicitaPLP(java.lang.Long idPlpMaster, java.lang.String numEtiqueta, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "solicitaPLP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idPlpMaster, numEtiqueta, usuario, senha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String solicitaXmlPlp(java.lang.Long idPlpMaster, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "solicitaXmlPlp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idPlpMaster, usuario, senha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.MotivoPIMaster[] obterMotivosPI() throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "obterMotivosPI"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.correios.bsb.sigep.master.bean.cliente.MotivoPIMaster[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.correios.bsb.sigep.master.bean.cliente.MotivoPIMaster[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.correios.bsb.sigep.master.bean.cliente.MotivoPIMaster[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP buscaContrato(java.lang.String numero, long diretoria, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaContrato"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {numero, new java.lang.Long(diretoria), usuario, senha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String consultaSRO(java.lang.String[] listaObjetos, java.lang.String tipoConsulta, java.lang.String tipoResultado, java.lang.String usuarioSro, java.lang.String senhaSro) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "consultaSRO"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {listaObjetos, tipoConsulta, tipoResultado, usuarioSro, senhaSro});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.util.Calendar obterClienteAtualizacao(java.lang.String cnpjCliente, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "obterClienteAtualizacao"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cnpjCliente, usuario, senha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.util.Calendar) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.util.Calendar) org.apache.axis.utils.JavaUtils.convert(_resp, java.util.Calendar.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Boolean integrarUsuarioScol(java.lang.Integer codAdministrativo, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "integrarUsuarioScol"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {codAdministrativo, usuario, senha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Boolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Boolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean atualizaPLP(java.lang.Long idPlpMaster, java.lang.String numEtiqueta, java.lang.String usuario, java.lang.String senha, java.lang.String xml) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "atualizaPLP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idPlpMaster, numEtiqueta, usuario, senha, xml});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.AssuntoPIMaster[] obterAssuntosPI() throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "obterAssuntosPI"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.correios.bsb.sigep.master.bean.cliente.AssuntoPIMaster[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.correios.bsb.sigep.master.bean.cliente.AssuntoPIMaster[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.correios.bsb.sigep.master.bean.cliente.AssuntoPIMaster[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP consultaCEP(java.lang.String cep) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SQLException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "consultaCEP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cep});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SQLException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SQLException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) {
              throw (br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
