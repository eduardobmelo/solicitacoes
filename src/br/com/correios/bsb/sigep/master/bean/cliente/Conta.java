/**
 * Conta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class Conta  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -5312323431051349865L;

	private java.lang.String codigoBanco;

    private java.lang.String nomeBanco;

    private java.lang.String numeroAgencia;

    private java.lang.String numeroConta;

    public Conta() {
    }

    public Conta(
           java.lang.String codigoBanco,
           java.lang.String nomeBanco,
           java.lang.String numeroAgencia,
           java.lang.String numeroConta) {
           this.codigoBanco = codigoBanco;
           this.nomeBanco = nomeBanco;
           this.numeroAgencia = numeroAgencia;
           this.numeroConta = numeroConta;
    }


    /**
     * Gets the codigoBanco value for this Conta.
     * 
     * @return codigoBanco
     */
    public java.lang.String getCodigoBanco() {
        return codigoBanco;
    }


    /**
     * Sets the codigoBanco value for this Conta.
     * 
     * @param codigoBanco
     */
    public void setCodigoBanco(java.lang.String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }


    /**
     * Gets the nomeBanco value for this Conta.
     * 
     * @return nomeBanco
     */
    public java.lang.String getNomeBanco() {
        return nomeBanco;
    }


    /**
     * Sets the nomeBanco value for this Conta.
     * 
     * @param nomeBanco
     */
    public void setNomeBanco(java.lang.String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }


    /**
     * Gets the numeroAgencia value for this Conta.
     * 
     * @return numeroAgencia
     */
    public java.lang.String getNumeroAgencia() {
        return numeroAgencia;
    }


    /**
     * Sets the numeroAgencia value for this Conta.
     * 
     * @param numeroAgencia
     */
    public void setNumeroAgencia(java.lang.String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }


    /**
     * Gets the numeroConta value for this Conta.
     * 
     * @return numeroConta
     */
    public java.lang.String getNumeroConta() {
        return numeroConta;
    }


    /**
     * Sets the numeroConta value for this Conta.
     * 
     * @param numeroConta
     */
    public void setNumeroConta(java.lang.String numeroConta) {
        this.numeroConta = numeroConta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Conta)) return false;
        Conta other = (Conta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoBanco==null && other.getCodigoBanco()==null) || 
             (this.codigoBanco!=null &&
              this.codigoBanco.equals(other.getCodigoBanco()))) &&
            ((this.nomeBanco==null && other.getNomeBanco()==null) || 
             (this.nomeBanco!=null &&
              this.nomeBanco.equals(other.getNomeBanco()))) &&
            ((this.numeroAgencia==null && other.getNumeroAgencia()==null) || 
             (this.numeroAgencia!=null &&
              this.numeroAgencia.equals(other.getNumeroAgencia()))) &&
            ((this.numeroConta==null && other.getNumeroConta()==null) || 
             (this.numeroConta!=null &&
              this.numeroConta.equals(other.getNumeroConta())));
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
        if (getCodigoBanco() != null) {
            _hashCode += getCodigoBanco().hashCode();
        }
        if (getNomeBanco() != null) {
            _hashCode += getNomeBanco().hashCode();
        }
        if (getNumeroAgencia() != null) {
            _hashCode += getNumeroAgencia().hashCode();
        }
        if (getNumeroConta() != null) {
            _hashCode += getNumeroConta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Conta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "conta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoBanco");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoBanco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeBanco");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeBanco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroAgencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroAgencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroConta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroConta"));
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
