/**
 * Retorno.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class Retorno  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 3887810284284755879L;

	private java.lang.Long codigoPI;

    private java.lang.String codigoRegistro;

    private java.lang.String codigoRetorno;

    private java.lang.String dataPrazoResposta;

    private java.lang.String dataRegistro;

    private java.lang.String dataResposta;

    private java.lang.String dataUltimaRecorrencia;

    private java.lang.Long id;

    private java.lang.String mensagemRetorno;

    private java.lang.String resposta;

    public Retorno() {
    }

    public Retorno(
           java.lang.Long codigoPI,
           java.lang.String codigoRegistro,
           java.lang.String codigoRetorno,
           java.lang.String dataPrazoResposta,
           java.lang.String dataRegistro,
           java.lang.String dataResposta,
           java.lang.String dataUltimaRecorrencia,
           java.lang.Long id,
           java.lang.String mensagemRetorno,
           java.lang.String resposta) {
           this.codigoPI = codigoPI;
           this.codigoRegistro = codigoRegistro;
           this.codigoRetorno = codigoRetorno;
           this.dataPrazoResposta = dataPrazoResposta;
           this.dataRegistro = dataRegistro;
           this.dataResposta = dataResposta;
           this.dataUltimaRecorrencia = dataUltimaRecorrencia;
           this.id = id;
           this.mensagemRetorno = mensagemRetorno;
           this.resposta = resposta;
    }


    /**
     * Gets the codigoPI value for this Retorno.
     * 
     * @return codigoPI
     */
    public java.lang.Long getCodigoPI() {
        return codigoPI;
    }


    /**
     * Sets the codigoPI value for this Retorno.
     * 
     * @param codigoPI
     */
    public void setCodigoPI(java.lang.Long codigoPI) {
        this.codigoPI = codigoPI;
    }


    /**
     * Gets the codigoRegistro value for this Retorno.
     * 
     * @return codigoRegistro
     */
    public java.lang.String getCodigoRegistro() {
        return codigoRegistro;
    }


    /**
     * Sets the codigoRegistro value for this Retorno.
     * 
     * @param codigoRegistro
     */
    public void setCodigoRegistro(java.lang.String codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }


    /**
     * Gets the codigoRetorno value for this Retorno.
     * 
     * @return codigoRetorno
     */
    public java.lang.String getCodigoRetorno() {
        return codigoRetorno;
    }


    /**
     * Sets the codigoRetorno value for this Retorno.
     * 
     * @param codigoRetorno
     */
    public void setCodigoRetorno(java.lang.String codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
    }


    /**
     * Gets the dataPrazoResposta value for this Retorno.
     * 
     * @return dataPrazoResposta
     */
    public java.lang.String getDataPrazoResposta() {
        return dataPrazoResposta;
    }


    /**
     * Sets the dataPrazoResposta value for this Retorno.
     * 
     * @param dataPrazoResposta
     */
    public void setDataPrazoResposta(java.lang.String dataPrazoResposta) {
        this.dataPrazoResposta = dataPrazoResposta;
    }


    /**
     * Gets the dataRegistro value for this Retorno.
     * 
     * @return dataRegistro
     */
    public java.lang.String getDataRegistro() {
        return dataRegistro;
    }


    /**
     * Sets the dataRegistro value for this Retorno.
     * 
     * @param dataRegistro
     */
    public void setDataRegistro(java.lang.String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }


    /**
     * Gets the dataResposta value for this Retorno.
     * 
     * @return dataResposta
     */
    public java.lang.String getDataResposta() {
        return dataResposta;
    }


    /**
     * Sets the dataResposta value for this Retorno.
     * 
     * @param dataResposta
     */
    public void setDataResposta(java.lang.String dataResposta) {
        this.dataResposta = dataResposta;
    }


    /**
     * Gets the dataUltimaRecorrencia value for this Retorno.
     * 
     * @return dataUltimaRecorrencia
     */
    public java.lang.String getDataUltimaRecorrencia() {
        return dataUltimaRecorrencia;
    }


    /**
     * Sets the dataUltimaRecorrencia value for this Retorno.
     * 
     * @param dataUltimaRecorrencia
     */
    public void setDataUltimaRecorrencia(java.lang.String dataUltimaRecorrencia) {
        this.dataUltimaRecorrencia = dataUltimaRecorrencia;
    }


    /**
     * Gets the id value for this Retorno.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Retorno.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the mensagemRetorno value for this Retorno.
     * 
     * @return mensagemRetorno
     */
    public java.lang.String getMensagemRetorno() {
        return mensagemRetorno;
    }


    /**
     * Sets the mensagemRetorno value for this Retorno.
     * 
     * @param mensagemRetorno
     */
    public void setMensagemRetorno(java.lang.String mensagemRetorno) {
        this.mensagemRetorno = mensagemRetorno;
    }


    /**
     * Gets the resposta value for this Retorno.
     * 
     * @return resposta
     */
    public java.lang.String getResposta() {
        return resposta;
    }


    /**
     * Sets the resposta value for this Retorno.
     * 
     * @param resposta
     */
    public void setResposta(java.lang.String resposta) {
        this.resposta = resposta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Retorno)) return false;
        Retorno other = (Retorno) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoPI==null && other.getCodigoPI()==null) || 
             (this.codigoPI!=null &&
              this.codigoPI.equals(other.getCodigoPI()))) &&
            ((this.codigoRegistro==null && other.getCodigoRegistro()==null) || 
             (this.codigoRegistro!=null &&
              this.codigoRegistro.equals(other.getCodigoRegistro()))) &&
            ((this.codigoRetorno==null && other.getCodigoRetorno()==null) || 
             (this.codigoRetorno!=null &&
              this.codigoRetorno.equals(other.getCodigoRetorno()))) &&
            ((this.dataPrazoResposta==null && other.getDataPrazoResposta()==null) || 
             (this.dataPrazoResposta!=null &&
              this.dataPrazoResposta.equals(other.getDataPrazoResposta()))) &&
            ((this.dataRegistro==null && other.getDataRegistro()==null) || 
             (this.dataRegistro!=null &&
              this.dataRegistro.equals(other.getDataRegistro()))) &&
            ((this.dataResposta==null && other.getDataResposta()==null) || 
             (this.dataResposta!=null &&
              this.dataResposta.equals(other.getDataResposta()))) &&
            ((this.dataUltimaRecorrencia==null && other.getDataUltimaRecorrencia()==null) || 
             (this.dataUltimaRecorrencia!=null &&
              this.dataUltimaRecorrencia.equals(other.getDataUltimaRecorrencia()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.mensagemRetorno==null && other.getMensagemRetorno()==null) || 
             (this.mensagemRetorno!=null &&
              this.mensagemRetorno.equals(other.getMensagemRetorno()))) &&
            ((this.resposta==null && other.getResposta()==null) || 
             (this.resposta!=null &&
              this.resposta.equals(other.getResposta())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCodigoPI() != null) {
            _hashCode += getCodigoPI().hashCode();
        }
        if (getCodigoRegistro() != null) {
            _hashCode += getCodigoRegistro().hashCode();
        }
        if (getCodigoRetorno() != null) {
            _hashCode += getCodigoRetorno().hashCode();
        }
        if (getDataPrazoResposta() != null) {
            _hashCode += getDataPrazoResposta().hashCode();
        }
        if (getDataRegistro() != null) {
            _hashCode += getDataRegistro().hashCode();
        }
        if (getDataResposta() != null) {
            _hashCode += getDataResposta().hashCode();
        }
        if (getDataUltimaRecorrencia() != null) {
            _hashCode += getDataUltimaRecorrencia().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getMensagemRetorno() != null) {
            _hashCode += getMensagemRetorno().hashCode();
        }
        if (getResposta() != null) {
            _hashCode += getResposta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Retorno.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "retorno"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoPI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoPI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("codigoRetorno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoRetorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataPrazoResposta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataPrazoResposta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataRegistro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataRegistro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataResposta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataResposta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataUltimaRecorrencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataUltimaRecorrencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagemRetorno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensagemRetorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resposta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resposta"));
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
