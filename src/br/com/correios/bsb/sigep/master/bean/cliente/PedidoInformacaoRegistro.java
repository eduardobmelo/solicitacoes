/**
 * PedidoInformacaoRegistro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class PedidoInformacaoRegistro  extends br.com.correios.bsb.sigep.master.bean.cliente.PedidoInformacao  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -8796863365741585609L;

	private br.com.correios.bsb.sigep.master.bean.cliente.Cliente cliente;

    private java.lang.String codigoRegistro;

    private br.com.correios.bsb.sigep.master.bean.cliente.Conta conta;

    private java.lang.String conteudoObjeto;

    private java.lang.String cpfCnpj;

    private br.com.correios.bsb.sigep.master.bean.cliente.Destinatario destinatario;

    private java.lang.String embalagem;

    private java.lang.Integer motivo;

    private java.lang.String observacao;

    private br.com.correios.bsb.sigep.master.bean.cliente.Postagem postagem;

    private br.com.correios.bsb.sigep.master.bean.cliente.Remetente remetente;

    private java.lang.Integer servico;

    private java.lang.String tipoDocumento;

    public PedidoInformacaoRegistro() {
    }

    public PedidoInformacaoRegistro(
           java.lang.Long id,
           java.lang.String usuario,
           br.com.correios.bsb.sigep.master.bean.cliente.Cliente cliente,
           java.lang.String codigoRegistro,
           br.com.correios.bsb.sigep.master.bean.cliente.Conta conta,
           java.lang.String conteudoObjeto,
           java.lang.String cpfCnpj,
           br.com.correios.bsb.sigep.master.bean.cliente.Destinatario destinatario,
           java.lang.String embalagem,
           java.lang.Integer motivo,
           java.lang.String observacao,
           br.com.correios.bsb.sigep.master.bean.cliente.Postagem postagem,
           br.com.correios.bsb.sigep.master.bean.cliente.Remetente remetente,
           java.lang.Integer servico,
           java.lang.String tipoDocumento) {
        super(
            id,
            usuario);
        this.cliente = cliente;
        this.codigoRegistro = codigoRegistro;
        this.conta = conta;
        this.conteudoObjeto = conteudoObjeto;
        this.cpfCnpj = cpfCnpj;
        this.destinatario = destinatario;
        this.embalagem = embalagem;
        this.motivo = motivo;
        this.observacao = observacao;
        this.postagem = postagem;
        this.remetente = remetente;
        this.servico = servico;
        this.tipoDocumento = tipoDocumento;
    }


    /**
     * Gets the cliente value for this PedidoInformacaoRegistro.
     * 
     * @return cliente
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.Cliente getCliente() {
        return cliente;
    }


    /**
     * Sets the cliente value for this PedidoInformacaoRegistro.
     * 
     * @param cliente
     */
    public void setCliente(br.com.correios.bsb.sigep.master.bean.cliente.Cliente cliente) {
        this.cliente = cliente;
    }


    /**
     * Gets the codigoRegistro value for this PedidoInformacaoRegistro.
     * 
     * @return codigoRegistro
     */
    public java.lang.String getCodigoRegistro() {
        return codigoRegistro;
    }


    /**
     * Sets the codigoRegistro value for this PedidoInformacaoRegistro.
     * 
     * @param codigoRegistro
     */
    public void setCodigoRegistro(java.lang.String codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }


    /**
     * Gets the conta value for this PedidoInformacaoRegistro.
     * 
     * @return conta
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.Conta getConta() {
        return conta;
    }


    /**
     * Sets the conta value for this PedidoInformacaoRegistro.
     * 
     * @param conta
     */
    public void setConta(br.com.correios.bsb.sigep.master.bean.cliente.Conta conta) {
        this.conta = conta;
    }


    /**
     * Gets the conteudoObjeto value for this PedidoInformacaoRegistro.
     * 
     * @return conteudoObjeto
     */
    public java.lang.String getConteudoObjeto() {
        return conteudoObjeto;
    }


    /**
     * Sets the conteudoObjeto value for this PedidoInformacaoRegistro.
     * 
     * @param conteudoObjeto
     */
    public void setConteudoObjeto(java.lang.String conteudoObjeto) {
        this.conteudoObjeto = conteudoObjeto;
    }


    /**
     * Gets the cpfCnpj value for this PedidoInformacaoRegistro.
     * 
     * @return cpfCnpj
     */
    public java.lang.String getCpfCnpj() {
        return cpfCnpj;
    }


    /**
     * Sets the cpfCnpj value for this PedidoInformacaoRegistro.
     * 
     * @param cpfCnpj
     */
    public void setCpfCnpj(java.lang.String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }


    /**
     * Gets the destinatario value for this PedidoInformacaoRegistro.
     * 
     * @return destinatario
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.Destinatario getDestinatario() {
        return destinatario;
    }


    /**
     * Sets the destinatario value for this PedidoInformacaoRegistro.
     * 
     * @param destinatario
     */
    public void setDestinatario(br.com.correios.bsb.sigep.master.bean.cliente.Destinatario destinatario) {
        this.destinatario = destinatario;
    }


    /**
     * Gets the embalagem value for this PedidoInformacaoRegistro.
     * 
     * @return embalagem
     */
    public java.lang.String getEmbalagem() {
        return embalagem;
    }


    /**
     * Sets the embalagem value for this PedidoInformacaoRegistro.
     * 
     * @param embalagem
     */
    public void setEmbalagem(java.lang.String embalagem) {
        this.embalagem = embalagem;
    }


    /**
     * Gets the motivo value for this PedidoInformacaoRegistro.
     * 
     * @return motivo
     */
    public java.lang.Integer getMotivo() {
        return motivo;
    }


    /**
     * Sets the motivo value for this PedidoInformacaoRegistro.
     * 
     * @param motivo
     */
    public void setMotivo(java.lang.Integer motivo) {
        this.motivo = motivo;
    }


    /**
     * Gets the observacao value for this PedidoInformacaoRegistro.
     * 
     * @return observacao
     */
    public java.lang.String getObservacao() {
        return observacao;
    }


    /**
     * Sets the observacao value for this PedidoInformacaoRegistro.
     * 
     * @param observacao
     */
    public void setObservacao(java.lang.String observacao) {
        this.observacao = observacao;
    }


    /**
     * Gets the postagem value for this PedidoInformacaoRegistro.
     * 
     * @return postagem
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.Postagem getPostagem() {
        return postagem;
    }


    /**
     * Sets the postagem value for this PedidoInformacaoRegistro.
     * 
     * @param postagem
     */
    public void setPostagem(br.com.correios.bsb.sigep.master.bean.cliente.Postagem postagem) {
        this.postagem = postagem;
    }


    /**
     * Gets the remetente value for this PedidoInformacaoRegistro.
     * 
     * @return remetente
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.Remetente getRemetente() {
        return remetente;
    }


    /**
     * Sets the remetente value for this PedidoInformacaoRegistro.
     * 
     * @param remetente
     */
    public void setRemetente(br.com.correios.bsb.sigep.master.bean.cliente.Remetente remetente) {
        this.remetente = remetente;
    }


    /**
     * Gets the servico value for this PedidoInformacaoRegistro.
     * 
     * @return servico
     */
    public java.lang.Integer getServico() {
        return servico;
    }


    /**
     * Sets the servico value for this PedidoInformacaoRegistro.
     * 
     * @param servico
     */
    public void setServico(java.lang.Integer servico) {
        this.servico = servico;
    }


    /**
     * Gets the tipoDocumento value for this PedidoInformacaoRegistro.
     * 
     * @return tipoDocumento
     */
    public java.lang.String getTipoDocumento() {
        return tipoDocumento;
    }


    /**
     * Sets the tipoDocumento value for this PedidoInformacaoRegistro.
     * 
     * @param tipoDocumento
     */
    public void setTipoDocumento(java.lang.String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PedidoInformacaoRegistro)) return false;
        PedidoInformacaoRegistro other = (PedidoInformacaoRegistro) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cliente==null && other.getCliente()==null) || 
             (this.cliente!=null &&
              this.cliente.equals(other.getCliente()))) &&
            ((this.codigoRegistro==null && other.getCodigoRegistro()==null) || 
             (this.codigoRegistro!=null &&
              this.codigoRegistro.equals(other.getCodigoRegistro()))) &&
            ((this.conta==null && other.getConta()==null) || 
             (this.conta!=null &&
              this.conta.equals(other.getConta()))) &&
            ((this.conteudoObjeto==null && other.getConteudoObjeto()==null) || 
             (this.conteudoObjeto!=null &&
              this.conteudoObjeto.equals(other.getConteudoObjeto()))) &&
            ((this.cpfCnpj==null && other.getCpfCnpj()==null) || 
             (this.cpfCnpj!=null &&
              this.cpfCnpj.equals(other.getCpfCnpj()))) &&
            ((this.destinatario==null && other.getDestinatario()==null) || 
             (this.destinatario!=null &&
              this.destinatario.equals(other.getDestinatario()))) &&
            ((this.embalagem==null && other.getEmbalagem()==null) || 
             (this.embalagem!=null &&
              this.embalagem.equals(other.getEmbalagem()))) &&
            ((this.motivo==null && other.getMotivo()==null) || 
             (this.motivo!=null &&
              this.motivo.equals(other.getMotivo()))) &&
            ((this.observacao==null && other.getObservacao()==null) || 
             (this.observacao!=null &&
              this.observacao.equals(other.getObservacao()))) &&
            ((this.postagem==null && other.getPostagem()==null) || 
             (this.postagem!=null &&
              this.postagem.equals(other.getPostagem()))) &&
            ((this.remetente==null && other.getRemetente()==null) || 
             (this.remetente!=null &&
              this.remetente.equals(other.getRemetente()))) &&
            ((this.servico==null && other.getServico()==null) || 
             (this.servico!=null &&
              this.servico.equals(other.getServico()))) &&
            ((this.tipoDocumento==null && other.getTipoDocumento()==null) || 
             (this.tipoDocumento!=null &&
              this.tipoDocumento.equals(other.getTipoDocumento())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCliente() != null) {
            _hashCode += getCliente().hashCode();
        }
        if (getCodigoRegistro() != null) {
            _hashCode += getCodigoRegistro().hashCode();
        }
        if (getConta() != null) {
            _hashCode += getConta().hashCode();
        }
        if (getConteudoObjeto() != null) {
            _hashCode += getConteudoObjeto().hashCode();
        }
        if (getCpfCnpj() != null) {
            _hashCode += getCpfCnpj().hashCode();
        }
        if (getDestinatario() != null) {
            _hashCode += getDestinatario().hashCode();
        }
        if (getEmbalagem() != null) {
            _hashCode += getEmbalagem().hashCode();
        }
        if (getMotivo() != null) {
            _hashCode += getMotivo().hashCode();
        }
        if (getObservacao() != null) {
            _hashCode += getObservacao().hashCode();
        }
        if (getPostagem() != null) {
            _hashCode += getPostagem().hashCode();
        }
        if (getRemetente() != null) {
            _hashCode += getRemetente().hashCode();
        }
        if (getServico() != null) {
            _hashCode += getServico().hashCode();
        }
        if (getTipoDocumento() != null) {
            _hashCode += getTipoDocumento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PedidoInformacaoRegistro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "pedidoInformacaoRegistro"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "cliente"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoRegistro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoRegistro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "conta"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conteudoObjeto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conteudoObjeto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfCnpj");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpfCnpj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinatario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinatario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "destinatario"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("embalagem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "embalagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "motivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "observacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postagem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "postagem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remetente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remetente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "remetente"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servico");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
