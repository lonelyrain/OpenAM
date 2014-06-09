/**
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2011-2013 ForgeRock AS. All Rights Reserved
 *
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the License). You may not use this file except in
 * compliance with the License.
 *
 * You can obtain a copy of the License at
 * http://forgerock.org/license/CDDLv1.0.html
 * See the License for the specific language governing
 * permission and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL
 * Header Notice in each file and include the License file
 * at http://forgerock.org/license/CDDLv1.0.html
 * If applicable, add the following below the CDDL Header,
 * with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.01.21 at 10:40:04 AM PST 
//


package com.sun.identity.entitlement.xacml3.core;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}RequestDefaults" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}Attributes" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}MultiRequests" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ReturnPolicyIdList" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CombinedDecision" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestType", propOrder = {
    "requestDefaults",
    "attributes",
    "multiRequests"
})
public class Request implements XACMLRootElement {

    @XmlElement(name = "RequestDefaults")
    protected RequestDefaults requestDefaults;
    @XmlElement(name = "Attributes", required = true)
    protected List<Attributes> attributes;
    @XmlElement(name = "MultiRequests")
    protected MultiRequests multiRequests;
    @XmlAttribute(name = "ReturnPolicyIdList", required = true)
    protected boolean returnPolicyIdList;
    @XmlAttribute(name = "CombinedDecision", required = true)
    protected boolean combinedDecision;

    /**
     * Gets the value of the requestDefaults property.
     * 
     * @return
     *     possible object is
     *     {@link RequestDefaults }
     *     
     */
    public RequestDefaults getRequestDefaults() {
        return requestDefaults;
    }

    /**
     * Sets the value of the requestDefaults property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestDefaults }
     *     
     */
    public void setRequestDefaults(RequestDefaults value) {
        this.requestDefaults = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attributes }
     * 
     * 
     */
    public List<Attributes> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<Attributes>();
        }
        return this.attributes;
    }

    /**
     * Gets the value of the multiRequests property.
     * 
     * @return
     *     possible object is
     *     {@link MultiRequests }
     *     
     */
    public MultiRequests getMultiRequests() {
        return multiRequests;
    }

    /**
     * Sets the value of the multiRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiRequests }
     *     
     */
    public void setMultiRequests(MultiRequests value) {
        this.multiRequests = value;
    }

    /**
     * Gets the value of the returnPolicyIdList property.
     * 
     */
    public boolean isReturnPolicyIdList() {
        return returnPolicyIdList;
    }

    /**
     * Sets the value of the returnPolicyIdList property.
     * 
     */
    public void setReturnPolicyIdList(boolean value) {
        this.returnPolicyIdList = value;
    }

    /**
     * Gets the value of the combinedDecision property.
     * 
     */
    public boolean isCombinedDecision() {
        return combinedDecision;
    }

    /**
     * Sets the value of the combinedDecision property.
     * 
     */
    public void setCombinedDecision(boolean value) {
        this.combinedDecision = value;
    }

    /**
     * Default toXML Method to Marshal Object into XML.
     * @return String - Marshaled Results into XML String.
     */
    public String toXML() {
        StringBuilder stringBuilder = new StringBuilder();



        // Return Marshaled Data.
        return stringBuilder.toString();
    }

}