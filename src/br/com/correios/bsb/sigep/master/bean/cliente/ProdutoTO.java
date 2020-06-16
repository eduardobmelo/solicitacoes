/**
 * ProdutoTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class ProdutoTO  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -3084654635564820729L;

	private java.lang.Long codigo;

    private java.lang.Long qtd;

    private java.lang.Long tipo;

    public ProdutoTO() {
    }

    public ProdutoTO(
           java.lang.Long codigo,
           java.lang.Long qtd,
           java.lang.Long tipo) {
           this.codigo = codigo;
           this.qtd = qtd;
           this.tipo = tipo;
    }


    /**
     * Gets the codigo value for this ProdutoTO.
     * 
     * @return codigo
     */
    public java.lang.Long getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this ProdutoTO.
     * 
     * @param codigo
     */
    public void setCodigo(java.lang.Long codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the qtd value for this ProdutoTO.
     * 
     * @return qtd
     */
    public java.lang.Long getQtd() {
        return qtd;
    }


    /**
     * Sets the qtd value for this ProdutoTO.
     * 
     * @param qtd
     */
    public void setQtd(java.lang.Long qtd) {
        this.qtd = qtd;
    }


    /**
     * Gets the tipo value for this ProdutoTO.
     * 
     * @return tipo
     */
    public java.lang.Long getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this ProdutoTO.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.Long tipo) {
        this.tipo = tipo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProdutoTO)) return false;
        ProdutoTO other = (ProdutoTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo()))) &&
            ((this.qtd==null && other.getQtd()==null) || 
             (this.qtd!=null &&
              this.qtd.equals(other.getQtd()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo())));
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
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
        }
        if (getQtd() != null) {
            _hashCode += getQtd().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProdutoTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "produtoTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qtd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
