/**
 * ColetaReversaTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class ColetaReversaTO  extends br.com.correios.bsb.sigep.master.bean.cliente.ColetaTO  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 5207132551041714626L;

	private java.lang.String ag;

    private java.lang.Integer ar;

    private java.lang.Long cartao;

    private java.lang.Integer numero;

    private br.com.correios.bsb.sigep.master.bean.cliente.ObjetoTO[] obj_col;

    private java.lang.String servico_adicional;

    public ColetaReversaTO() {
    }

    public ColetaReversaTO(
           java.lang.String cklist,
           java.lang.String descricao,
           java.lang.String id_cliente,
           br.com.correios.bsb.sigep.master.bean.cliente.ProdutoTO[] produto,
           br.com.correios.bsb.sigep.master.bean.cliente.RemetenteTO remetente,
           java.lang.String tipo,
           java.lang.String valor_declarado,
           java.lang.String ag,
           java.lang.Integer ar,
           java.lang.Long cartao,
           java.lang.Integer numero,
           br.com.correios.bsb.sigep.master.bean.cliente.ObjetoTO[] obj_col,
           java.lang.String servico_adicional) {
        super(
            cklist,
            descricao,
            id_cliente,
            produto,
            remetente,
            tipo,
            valor_declarado);
        this.ag = ag;
        this.ar = ar;
        this.cartao = cartao;
        this.numero = numero;
        this.obj_col = obj_col;
        this.servico_adicional = servico_adicional;
    }


    /**
     * Gets the ag value for this ColetaReversaTO.
     * 
     * @return ag
     */
    public java.lang.String getAg() {
        return ag;
    }


    /**
     * Sets the ag value for this ColetaReversaTO.
     * 
     * @param ag
     */
    public void setAg(java.lang.String ag) {
        this.ag = ag;
    }


    /**
     * Gets the ar value for this ColetaReversaTO.
     * 
     * @return ar
     */
    public java.lang.Integer getAr() {
        return ar;
    }


    /**
     * Sets the ar value for this ColetaReversaTO.
     * 
     * @param ar
     */
    public void setAr(java.lang.Integer ar) {
        this.ar = ar;
    }


    /**
     * Gets the cartao value for this ColetaReversaTO.
     * 
     * @return cartao
     */
    public java.lang.Long getCartao() {
        return cartao;
    }


    /**
     * Sets the cartao value for this ColetaReversaTO.
     * 
     * @param cartao
     */
    public void setCartao(java.lang.Long cartao) {
        this.cartao = cartao;
    }


    /**
     * Gets the numero value for this ColetaReversaTO.
     * 
     * @return numero
     */
    public java.lang.Integer getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this ColetaReversaTO.
     * 
     * @param numero
     */
    public void setNumero(java.lang.Integer numero) {
        this.numero = numero;
    }


    /**
     * Gets the obj_col value for this ColetaReversaTO.
     * 
     * @return obj_col
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ObjetoTO[] getObj_col() {
        return obj_col;
    }


    /**
     * Sets the obj_col value for this ColetaReversaTO.
     * 
     * @param obj_col
     */
    public void setObj_col(br.com.correios.bsb.sigep.master.bean.cliente.ObjetoTO[] obj_col) {
        this.obj_col = obj_col;
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.ObjetoTO getObj_col(int i) {
        return this.obj_col[i];
    }

    public void setObj_col(int i, br.com.correios.bsb.sigep.master.bean.cliente.ObjetoTO _value) {
        this.obj_col[i] = _value;
    }


    /**
     * Gets the servico_adicional value for this ColetaReversaTO.
     * 
     * @return servico_adicional
     */
    public java.lang.String getServico_adicional() {
        return servico_adicional;
    }


    /**
     * Sets the servico_adicional value for this ColetaReversaTO.
     * 
     * @param servico_adicional
     */
    public void setServico_adicional(java.lang.String servico_adicional) {
        this.servico_adicional = servico_adicional;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ColetaReversaTO)) return false;
        ColetaReversaTO other = (ColetaReversaTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ag==null && other.getAg()==null) || 
             (this.ag!=null &&
              this.ag.equals(other.getAg()))) &&
            ((this.ar==null && other.getAr()==null) || 
             (this.ar!=null &&
              this.ar.equals(other.getAr()))) &&
            ((this.cartao==null && other.getCartao()==null) || 
             (this.cartao!=null &&
              this.cartao.equals(other.getCartao()))) &&
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero()))) &&
            ((this.obj_col==null && other.getObj_col()==null) || 
             (this.obj_col!=null &&
              java.util.Arrays.equals(this.obj_col, other.getObj_col()))) &&
            ((this.servico_adicional==null && other.getServico_adicional()==null) || 
             (this.servico_adicional!=null &&
              this.servico_adicional.equals(other.getServico_adicional())));
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
        if (getAg() != null) {
            _hashCode += getAg().hashCode();
        }
        if (getAr() != null) {
            _hashCode += getAr().hashCode();
        }
        if (getCartao() != null) {
            _hashCode += getCartao().hashCode();
        }
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        if (getObj_col() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getObj_col());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getObj_col(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServico_adicional() != null) {
            _hashCode += getServico_adicional().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ColetaReversaTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "coletaReversaTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cartao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obj_col");
        elemField.setXmlName(new javax.xml.namespace.QName("", "obj_col"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "objetoTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servico_adicional");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servico_adicional"));
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
