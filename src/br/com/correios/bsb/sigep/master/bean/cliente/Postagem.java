/**
 * Postagem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class Postagem  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -4580730130617419039L;

	private java.lang.String agencia;

    private java.lang.String avisoRecebimento;

    private java.lang.String data;

    private java.lang.String local;

    private java.lang.String valorDeclarado;

    public Postagem() {
    }

    public Postagem(
           java.lang.String agencia,
           java.lang.String avisoRecebimento,
           java.lang.String data,
           java.lang.String local,
           java.lang.String valorDeclarado) {
           this.agencia = agencia;
           this.avisoRecebimento = avisoRecebimento;
           this.data = data;
           this.local = local;
           this.valorDeclarado = valorDeclarado;
    }


    /**
     * Gets the agencia value for this Postagem.
     * 
     * @return agencia
     */
    public java.lang.String getAgencia() {
        return agencia;
    }


    /**
     * Sets the agencia value for this Postagem.
     * 
     * @param agencia
     */
    public void setAgencia(java.lang.String agencia) {
        this.agencia = agencia;
    }


    /**
     * Gets the avisoRecebimento value for this Postagem.
     * 
     * @return avisoRecebimento
     */
    public java.lang.String getAvisoRecebimento() {
        return avisoRecebimento;
    }


    /**
     * Sets the avisoRecebimento value for this Postagem.
     * 
     * @param avisoRecebimento
     */
    public void setAvisoRecebimento(java.lang.String avisoRecebimento) {
        this.avisoRecebimento = avisoRecebimento;
    }


    /**
     * Gets the data value for this Postagem.
     * 
     * @return data
     */
    public java.lang.String getData() {
        return data;
    }


    /**
     * Sets the data value for this Postagem.
     * 
     * @param data
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }


    /**
     * Gets the local value for this Postagem.
     * 
     * @return local
     */
    public java.lang.String getLocal() {
        return local;
    }


    /**
     * Sets the local value for this Postagem.
     * 
     * @param local
     */
    public void setLocal(java.lang.String local) {
        this.local = local;
    }


    /**
     * Gets the valorDeclarado value for this Postagem.
     * 
     * @return valorDeclarado
     */
    public java.lang.String getValorDeclarado() {
        return valorDeclarado;
    }


    /**
     * Sets the valorDeclarado value for this Postagem.
     * 
     * @param valorDeclarado
     */
    public void setValorDeclarado(java.lang.String valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Postagem)) return false;
        Postagem other = (Postagem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agencia==null && other.getAgencia()==null) || 
             (this.agencia!=null &&
              this.agencia.equals(other.getAgencia()))) &&
            ((this.avisoRecebimento==null && other.getAvisoRecebimento()==null) || 
             (this.avisoRecebimento!=null &&
              this.avisoRecebimento.equals(other.getAvisoRecebimento()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.local==null && other.getLocal()==null) || 
             (this.local!=null &&
              this.local.equals(other.getLocal()))) &&
            ((this.valorDeclarado==null && other.getValorDeclarado()==null) || 
             (this.valorDeclarado!=null &&
              this.valorDeclarado.equals(other.getValorDeclarado())));
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
        if (getAgencia() != null) {
            _hashCode += getAgencia().hashCode();
        }
        if (getAvisoRecebimento() != null) {
            _hashCode += getAvisoRecebimento().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getLocal() != null) {
            _hashCode += getLocal().hashCode();
        }
        if (getValorDeclarado() != null) {
            _hashCode += getValorDeclarado().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Postagem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "postagem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avisoRecebimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "avisoRecebimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("local");
        elemField.setXmlName(new javax.xml.namespace.QName("", "local"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorDeclarado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorDeclarado"));
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
