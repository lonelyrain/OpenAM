//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:34:16 AM PDT 
//


package com.sun.identity.wsfederation.jaxb.wsspolicy.impl;

public class IssuedTokenTypeImpl implements com.sun.identity.wsfederation.jaxb.wsspolicy.IssuedTokenType, com.sun.xml.bind.JAXBObject, com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    protected com.sun.identity.wsfederation.jaxb.wsaddr.EndpointReferenceType _Issuer;
    protected com.sun.xml.bind.util.ListImpl _Any;
    protected com.sun.identity.wsfederation.jaxb.wsspolicy.RequestSecurityTokenTemplateType _RequestSecurityTokenTemplate;
    protected java.lang.String _IncludeToken;
    public final static java.lang.Class version = (com.sun.identity.wsfederation.jaxb.wsspolicy.impl.JAXBVersion.class);
    private final static org.relaxng.datatype.Datatype ___dt0 = com.sun.xml.bind.unmarshaller.DatatypeDeserializer.deserialize("\u00ac\u00ed\u0000\u0005sr\u0000)com.sun.msv.datatype.xsd.EnumerationFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0006valuest\u0000\u000fLjava/util/Set;xr\u00009com.sun.msv.datatype.xsd.DataTypeWithValueConstraintFacet\"\u00a7Ro\u00ca\u00c7\u008aT\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.DataTypeWithFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFixedZ\u0000\u0012needValueCheckFlagL\u0000\bbaseTypet\u0000)Lcom/sun/msv/datatype/xsd/XSDatatypeImpl;L\u0000\fconcreteTypet\u0000\'Lcom/sun/msv/datatype/xsd/ConcreteType;L\u0000\tfacetNamet\u0000\u0012Ljava/lang/String;xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000\u0006L\u0000\btypeNameq\u0000~\u0000\u0006L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u00009http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200512t\u0000\u0010IncludeTokenTypesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0000\u0000sr\u0000#com.sun.msv.datatype.xsd.AnyURIType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0007t\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0006anyURIq\u0000~\u0000\u000eq\u0000~\u0000\u0012t\u0000\u000benumerationsr\u0000\u0011java.util.HashSet\u00baD\u0085\u0095\u0096\u00b8\u00b74\u0003\u0000\u0000xpw\f\u0000\u0000\u0000\u0010?@\u0000\u0000\u0000\u0000\u0000\u0005t\u0000Vhttp://docs.oasis-open.org/ws-sx/ws-trust/200512/ws-securitypolicy/IncludeToken/Alwayst\u0000Uhttp://docs.oasis-open.org/ws-sx/ws-trust/200512/ws-securitypolicy/IncludeToken/Nevert\u0000Thttp://docs.oasis-open.org/ws-sx/ws-trust/200512/ws-securitypolicy/IncludeToken/Oncet\u0000ahttp://docs.oasis-open.org/ws-sx/ws-trust/200512/ws-securitypolicy/IncludeToken/AlwaysToRecipientt\u0000ahttp://docs.oasis-open.org/ws-sx/ws-trust/200512/ws-securitypolicy/IncludeToken/AlwaysToInitiatorx");
    private final static org.relaxng.datatype.Datatype ___dt1 = com.sun.xml.bind.unmarshaller.DatatypeDeserializer.deserialize("\u00ac\u00ed\u0000\u0005sr\u0000#com.sun.msv.datatype.xsd.AnyURIType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUrit\u0000\u0012Ljava/lang/String;L\u0000\btypeNameq\u0000~\u0000\u0004L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0006anyURIsr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp");
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.wsfederation.jaxb.wsspolicy.IssuedTokenType.class);
    }

    public com.sun.identity.wsfederation.jaxb.wsaddr.EndpointReferenceType getIssuer() {
        return _Issuer;
    }

    public void setIssuer(com.sun.identity.wsfederation.jaxb.wsaddr.EndpointReferenceType value) {
        _Issuer = value;
    }

    protected com.sun.xml.bind.util.ListImpl _getAny() {
        if (_Any == null) {
            _Any = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _Any;
    }

    public java.util.List getAny() {
        return _getAny();
    }

    public com.sun.identity.wsfederation.jaxb.wsspolicy.RequestSecurityTokenTemplateType getRequestSecurityTokenTemplate() {
        return _RequestSecurityTokenTemplate;
    }

    public void setRequestSecurityTokenTemplate(com.sun.identity.wsfederation.jaxb.wsspolicy.RequestSecurityTokenTemplateType value) {
        _RequestSecurityTokenTemplate = value;
    }

    public java.lang.String getIncludeToken() {
        return _IncludeToken;
    }

    public void setIncludeToken(java.lang.String value) {
        _IncludeToken = value;
    }

    public com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.wsfederation.jaxb.wsspolicy.impl.IssuedTokenTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_Any == null)? 0 :_Any.size());
        if (_Issuer!= null) {
            context.startElement("http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200512", "Issuer");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Issuer), "Issuer");
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Issuer), "Issuer");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Issuer), "Issuer");
            context.endElement();
        }
        context.startElement("http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200512", "RequestSecurityTokenTemplate");
        context.childAsURIs(((com.sun.xml.bind.JAXBObject) _RequestSecurityTokenTemplate), "RequestSecurityTokenTemplate");
        context.endNamespaceDecls();
        context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _RequestSecurityTokenTemplate), "RequestSecurityTokenTemplate");
        context.endAttributes();
        context.childAsBody(((com.sun.xml.bind.JAXBObject) _RequestSecurityTokenTemplate), "RequestSecurityTokenTemplate");
        context.endElement();
        while (idx2 != len2) {
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Any.get(idx2 ++)), "Any");
        }
    }

    public void serializeAttributes(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_Any == null)? 0 :_Any.size());
        if (_IncludeToken!= null) {
            context.startAttribute("http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200512", "IncludeToken");
            if (_IncludeToken instanceof java.lang.String) {
                try {
                    context.text(((java.lang.String) _IncludeToken), "IncludeToken");
                } catch (java.lang.Exception e) {
                    com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
                }
            } else {
                if (_IncludeToken instanceof java.lang.String) {
                    try {
                        context.text(((java.lang.String) _IncludeToken), "IncludeToken");
                    } catch (java.lang.Exception e) {
                        com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
                    }
                } else {
                    com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.Util.handleTypeMismatchError(context, this, "IncludeToken", _IncludeToken);
                }
            }
            context.endAttribute();
        }
        while (idx2 != len2) {
            idx2 += 1;
        }
    }

    public void serializeURIs(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_Any == null)? 0 :_Any.size());
        if (_IncludeToken!= null) {
            context.getNamespaceContext().declareNamespace("http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200512", null, true);
        }
        while (idx2 != len2) {
            idx2 += 1;
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.wsfederation.jaxb.wsspolicy.IssuedTokenType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsr\u0000\u001dcom.sun.msv.grammar."
+"ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000\'com.sun.msv.grammar.trex.Ele"
+"mentPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/Na"
+"meClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aigno"
+"reUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003sr\u0000\u0011java.lan"
+"g.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\npp\u0000sq\u0000~\u0000\bppsr"
+"\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv"
+".grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\u000fpsr\u0000 com.s"
+"un.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClas"
+"sq\u0000~\u0000\u000bxq\u0000~\u0000\u0003q\u0000~\u0000\u000fpsr\u00002com.sun.msv.grammar.Expression$AnyStri"
+"ngExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\u000e\u0001q\u0000~\u0000\u0019sr\u0000 com.sun.msv.gra"
+"mmar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClas"
+"s\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpr"
+"ession\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u001aq\u0000~\u0000\u001fsr\u0000#com.sun.msv.grammar.Sim"
+"pleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fn"
+"amespaceURIq\u0000~\u0000!xq\u0000~\u0000\u001ct\u0000?com.sun.identity.wsfederation.jaxb."
+"wsaddr.EndpointReferenceTypet\u0000+http://java.sun.com/jaxb/xjc/"
+"dummy-elementssq\u0000~\u0000\bppsq\u0000~\u0000\u0016q\u0000~\u0000\u000fpsr\u0000\u001bcom.sun.msv.grammar.Da"
+"taExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006ex"
+"ceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003ppsr\u0000\""
+"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv"
+".datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.da"
+"tatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.x"
+"sd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000!L\u0000\btypeNameq"
+"\u0000~\u0000!L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProc"
+"essor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.s"
+"un.msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"r\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp"
+"sr\u00000com.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u000fpsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\t"
+"localNameq\u0000~\u0000!L\u0000\fnamespaceURIq\u0000~\u0000!xpq\u0000~\u00002q\u0000~\u00001sq\u0000~\u0000 t\u0000\u0004typet"
+"\u0000)http://www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\u0006Iss"
+"uert\u00009http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200"
+"512q\u0000~\u0000\u001fsq\u0000~\u0000\npp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\npp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0013q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016"
+"q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000Mcom.sun.identity.wsfederation."
+"jaxb.wsspolicy.RequestSecurityTokenTemplateTypeq\u0000~\u0000$sq\u0000~\u0000\bpp"
+"sq\u0000~\u0000\u0016q\u0000~\u0000\u000fpq\u0000~\u0000*q\u0000~\u0000:q\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\u001cRequestSecurityTokenTemp"
+"lateq\u0000~\u0000?sq\u0000~\u0000\bppsq\u0000~\u0000\u0013q\u0000~\u0000\u000fpsq\u0000~\u0000\nq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u0016ppq\u0000~\u0000\u0019sr\u0000\'c"
+"om.sun.msv.grammar.DifferenceNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003nc1q\u0000~\u0000\u000b"
+"L\u0000\u0003nc2q\u0000~\u0000\u000bxq\u0000~\u0000\u001cq\u0000~\u0000\u001dsr\u0000#com.sun.msv.grammar.ChoiceNameClas"
+"s\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003nc1q\u0000~\u0000\u000bL\u0000\u0003nc2q\u0000~\u0000\u000bxq\u0000~\u0000\u001csr\u0000&com.sun.msv.gram"
+"mar.NamespaceNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\fnamespaceURIq\u0000~\u0000!xq\u0000~\u0000\u001ct"
+"\u0000\u0000sq\u0000~\u0000Tq\u0000~\u0000?sq\u0000~\u0000Tq\u0000~\u0000$q\u0000~\u0000\u001fsq\u0000~\u0000\bppsq\u0000~\u0000\u0016q\u0000~\u0000\u000fpsq\u0000~\u0000\'ppsr\u0000"
+"\"com.sun.msv.datatype.xsd.UnionType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001[\u0000\u000bmemberTypes"
+"t\u0000*[Lcom/sun/msv/datatype/xsd/XSDatatypeImpl;xq\u0000~\u0000-q\u0000~\u0000?t\u0000\u0014I"
+"ncludeTokenOpenTypeq\u0000~\u00005ur\u0000*[Lcom.sun.msv.datatype.xsd.XSDat"
+"atypeImpl;H\u001c\u00ad{pzHw\u0002\u0000\u0000xp\u0000\u0000\u0000\u0002sr\u0000)com.sun.msv.datatype.xsd.Enum"
+"erationFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0006valuest\u0000\u000fLjava/util/Set;xr\u00009com.su"
+"n.msv.datatype.xsd.DataTypeWithValueConstraintFacet\"\u00a7Ro\u00ca\u00c7\u008aT\u0002"
+"\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.DataTypeWithFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z"
+"\u0000\fisFacetFixedZ\u0000\u0012needValueCheckFlagL\u0000\bbaseTypet\u0000)Lcom/sun/ms"
+"v/datatype/xsd/XSDatatypeImpl;L\u0000\fconcreteTypet\u0000\'Lcom/sun/msv"
+"/datatype/xsd/ConcreteType;L\u0000\tfacetNameq\u0000~\u0000!xq\u0000~\u0000.q\u0000~\u0000?t\u0000\u0010In"
+"cludeTokenTypeq\u0000~\u00005\u0000\u0000sr\u0000#com.sun.msv.datatype.xsd.AnyURIType"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000,q\u0000~\u00001t\u0000\u0006anyURIq\u0000~\u00005q\u0000~\u0000kt\u0000\u000benumerationsr\u0000\u0011j"
+"ava.util.HashSet\u00baD\u0085\u0095\u0096\u00b8\u00b74\u0003\u0000\u0000xpw\f\u0000\u0000\u0000\u0010?@\u0000\u0000\u0000\u0000\u0000\u0005t\u0000Vhttp://docs.oa"
+"sis-open.org/ws-sx/ws-trust/200512/ws-securitypolicy/Include"
+"Token/Alwayst\u0000Uhttp://docs.oasis-open.org/ws-sx/ws-trust/200"
+"512/ws-securitypolicy/IncludeToken/Nevert\u0000Thttp://docs.oasis"
+"-open.org/ws-sx/ws-trust/200512/ws-securitypolicy/IncludeTok"
+"en/Oncet\u0000ahttp://docs.oasis-open.org/ws-sx/ws-trust/200512/w"
+"s-securitypolicy/IncludeToken/AlwaysToRecipientt\u0000ahttp://doc"
+"s.oasis-open.org/ws-sx/ws-trust/200512/ws-securitypolicy/Inc"
+"ludeToken/AlwaysToInitiatorxq\u0000~\u0000kq\u0000~\u00007psq\u0000~\u0000 t\u0000\fIncludeToken"
+"q\u0000~\u0000?q\u0000~\u0000\u001fsr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L"
+"\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;"
+"xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003"
+"\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/E"
+"xpressionPool;xp\u0000\u0000\u0000\u000f\u0001pq\u0000~\u0000\u0007q\u0000~\u0000Mq\u0000~\u0000\tq\u0000~\u0000\u0010q\u0000~\u0000Aq\u0000~\u0000%q\u0000~\u0000Hq\u0000~"
+"\u0000Lq\u0000~\u0000\u0012q\u0000~\u0000Cq\u0000~\u0000\u0005q\u0000~\u0000\u0006q\u0000~\u0000Yq\u0000~\u0000\u0015q\u0000~\u0000Dx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
            super(context, "-----------");
        }

        protected Unmarshaller(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.wsfederation.jaxb.wsspolicy.impl.IssuedTokenTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  4 :
                        if (("Address" == ___local)&&("http://www.w3.org/2005/08/addressing" == ___uri)) {
                            _Issuer = ((com.sun.identity.wsfederation.jaxb.wsaddr.impl.EndpointReferenceTypeImpl) spawnChildFromEnterElement((com.sun.identity.wsfederation.jaxb.wsaddr.impl.EndpointReferenceTypeImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                    case  7 :
                        attIdx = context.getAttribute("", "TrustVersion");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (!(("" == ___uri)||("http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200512" == ___uri))) {
                            _RequestSecurityTokenTemplate = ((com.sun.identity.wsfederation.jaxb.wsspolicy.impl.RequestSecurityTokenTemplateTypeImpl) spawnChildFromEnterElement((com.sun.identity.wsfederation.jaxb.wsspolicy.impl.RequestSecurityTokenTemplateTypeImpl.class), 8, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _RequestSecurityTokenTemplate = ((com.sun.identity.wsfederation.jaxb.wsspolicy.impl.RequestSecurityTokenTemplateTypeImpl) spawnChildFromEnterElement((com.sun.identity.wsfederation.jaxb.wsspolicy.impl.RequestSecurityTokenTemplateTypeImpl.class), 8, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  10 :
                        if (!(("" == ___uri)||("http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200512" == ___uri))) {
                            java.lang.Object co = spawnWildcard(10, ___uri, ___local, ___qname, __atts);
                            if (co!= null) {
                                _getAny().add(co);
                            }
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  9 :
                        if (!(("" == ___uri)||("http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200512" == ___uri))) {
                            java.lang.Object co = spawnWildcard(10, ___uri, ___local, ___qname, __atts);
                            if (co!= null) {
                                _getAny().add(co);
                            }
                            return ;
                        }
                        state = 10;
                        continue outer;
                    case  6 :
                        if (("RequestSecurityTokenTemplate" == ___local)&&("http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200512" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 7;
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200512", "IncludeToken");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        state = 3;
                        continue outer;
                    case  3 :
                        if (("Issuer" == ___local)&&("http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200512" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 4;
                            return ;
                        }
                        state = 6;
                        continue outer;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  7 :
                        attIdx = context.getAttribute("", "TrustVersion");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        _RequestSecurityTokenTemplate = ((com.sun.identity.wsfederation.jaxb.wsspolicy.impl.RequestSecurityTokenTemplateTypeImpl) spawnChildFromLeaveElement((com.sun.identity.wsfederation.jaxb.wsspolicy.impl.RequestSecurityTokenTemplateTypeImpl.class), 8, ___uri, ___local, ___qname));
                        return ;
                    case  10 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  9 :
                        state = 10;
                        continue outer;
                    case  5 :
                        if (("Issuer" == ___local)&&("http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200512" == ___uri)) {
                            context.popAttributes();
                            state = 6;
                            return ;
                        }
                        break;
                    case  8 :
                        if (("RequestSecurityTokenTemplate" == ___local)&&("http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200512" == ___uri)) {
                            context.popAttributes();
                            state = 9;
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200512", "IncludeToken");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        state = 3;
                        continue outer;
                    case  3 :
                        state = 6;
                        continue outer;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  7 :
                        if (("TrustVersion" == ___local)&&("" == ___uri)) {
                            _RequestSecurityTokenTemplate = ((com.sun.identity.wsfederation.jaxb.wsspolicy.impl.RequestSecurityTokenTemplateTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.wsfederation.jaxb.wsspolicy.impl.RequestSecurityTokenTemplateTypeImpl.class), 8, ___uri, ___local, ___qname));
                            return ;
                        }
                        _RequestSecurityTokenTemplate = ((com.sun.identity.wsfederation.jaxb.wsspolicy.impl.RequestSecurityTokenTemplateTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.wsfederation.jaxb.wsspolicy.impl.RequestSecurityTokenTemplateTypeImpl.class), 8, ___uri, ___local, ___qname));
                        return ;
                    case  10 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  9 :
                        state = 10;
                        continue outer;
                    case  0 :
                        if (("IncludeToken" == ___local)&&("http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200512" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        state = 3;
                        continue outer;
                    case  3 :
                        state = 6;
                        continue outer;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  7 :
                        attIdx = context.getAttribute("", "TrustVersion");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        _RequestSecurityTokenTemplate = ((com.sun.identity.wsfederation.jaxb.wsspolicy.impl.RequestSecurityTokenTemplateTypeImpl) spawnChildFromLeaveAttribute((com.sun.identity.wsfederation.jaxb.wsspolicy.impl.RequestSecurityTokenTemplateTypeImpl.class), 8, ___uri, ___local, ___qname));
                        return ;
                    case  10 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  9 :
                        state = 10;
                        continue outer;
                    case  2 :
                        if (("IncludeToken" == ___local)&&("http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200512" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200512", "IncludeToken");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        state = 3;
                        continue outer;
                    case  3 :
                        state = 6;
                        continue outer;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  7 :
                            attIdx = context.getAttribute("", "TrustVersion");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            _RequestSecurityTokenTemplate = ((com.sun.identity.wsfederation.jaxb.wsspolicy.impl.RequestSecurityTokenTemplateTypeImpl) spawnChildFromText((com.sun.identity.wsfederation.jaxb.wsspolicy.impl.RequestSecurityTokenTemplateTypeImpl.class), 8, value));
                            return ;
                        case  10 :
                            revertToParentFromText(value);
                            return ;
                        case  9 :
                            state = 10;
                            continue outer;
                        case  0 :
                            attIdx = context.getAttribute("http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200512", "IncludeToken");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            state = 3;
                            continue outer;
                        case  3 :
                            state = 6;
                            continue outer;
                        case  1 :
                            if (___dt0 .isValid(value, null)) {
                                state = 2;
                                eatText1(value);
                                return ;
                            }
                            if (___dt1 .isValid(value, null)) {
                                state = 2;
                                eatText2(value);
                                return ;
                            }
                            break;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _IncludeToken = com.sun.xml.bind.WhiteSpaceProcessor.collapse(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _IncludeToken = com.sun.xml.bind.WhiteSpaceProcessor.collapse(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

    }

}
