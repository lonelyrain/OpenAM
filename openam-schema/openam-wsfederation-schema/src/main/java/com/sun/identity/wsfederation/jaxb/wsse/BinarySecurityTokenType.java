//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:34:16 AM PDT 
//


package com.sun.identity.wsfederation.jaxb.wsse;


/**
 * A security token that is encoded in binary
 * Java content class for BinarySecurityTokenType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/allan/A-SVN/trunk/opensso/products/federation/library/xsd/wsfederation/oasis-200401-wss-wssecurity-secext-1.0.xsd line 56)
 * <p>
 * <pre>
 * &lt;complexType name="BinarySecurityTokenType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd>EncodedString">
 *       &lt;attribute name="ValueType" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface BinarySecurityTokenType
    extends com.sun.identity.wsfederation.jaxb.wsse.EncodedString
{


    /**
     * Gets the value of the valueType property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getValueType();

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setValueType(java.lang.String value);

}
