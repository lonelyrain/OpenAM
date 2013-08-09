//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:33:54 AM PDT 
//


package com.sun.identity.liberty.ws.common.jaxb.assertion.impl;

public class AuthorizationDecisionStatementTypeImpl
    extends com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectStatementAbstractTypeImpl
    implements com.sun.identity.liberty.ws.common.jaxb.assertion.AuthorizationDecisionStatementType, com.sun.xml.bind.JAXBObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    protected java.lang.String _Resource;
    protected com.sun.xml.bind.util.ListImpl _Action;
    protected java.lang.String _Decision;
    protected com.sun.identity.liberty.ws.common.jaxb.assertion.EvidenceType _Evidence;
    public final static java.lang.Class version = (com.sun.identity.liberty.ws.common.jaxb.assertion.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.liberty.ws.common.jaxb.assertion.AuthorizationDecisionStatementType.class);
    }

    public java.lang.String getResource() {
        return _Resource;
    }

    public void setResource(java.lang.String value) {
        _Resource = value;
    }

    protected com.sun.xml.bind.util.ListImpl _getAction() {
        if (_Action == null) {
            _Action = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _Action;
    }

    public java.util.List getAction() {
        return _getAction();
    }

    public java.lang.String getDecision() {
        return _Decision;
    }

    public void setDecision(java.lang.String value) {
        _Decision = value;
    }

    public com.sun.identity.liberty.ws.common.jaxb.assertion.EvidenceType getEvidence() {
        return _Evidence;
    }

    public void setEvidence(com.sun.identity.liberty.ws.common.jaxb.assertion.EvidenceType value) {
        _Evidence = value;
    }

    public com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AuthorizationDecisionStatementTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_Action == null)? 0 :_Action.size());
        super.serializeBody(context);
        while (idx2 != len2) {
            if (_Action.get(idx2) instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Action.get(idx2 ++)), "Action");
            } else {
                context.startElement("urn:oasis:names:tc:SAML:1.0:assertion", "Action");
                int idx_0 = idx2;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Action.get(idx_0 ++)), "Action");
                context.endNamespaceDecls();
                int idx_1 = idx2;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Action.get(idx_1 ++)), "Action");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Action.get(idx2 ++)), "Action");
                context.endElement();
            }
        }
        if (_Evidence!= null) {
            if (_Evidence instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Evidence), "Evidence");
            } else {
                context.startElement("urn:oasis:names:tc:SAML:1.0:assertion", "Evidence");
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Evidence), "Evidence");
                context.endNamespaceDecls();
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Evidence), "Evidence");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Evidence), "Evidence");
                context.endElement();
            }
        }
    }

    public void serializeAttributes(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_Action == null)? 0 :_Action.size());
        context.startAttribute("", "Decision");
        try {
            context.text(((java.lang.String) _Decision), "Decision");
        } catch (java.lang.Exception e) {
            com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endAttribute();
        context.startAttribute("", "Resource");
        try {
            context.text(((java.lang.String) _Resource), "Resource");
        } catch (java.lang.Exception e) {
            com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endAttribute();
        super.serializeAttributes(context);
        while (idx2 != len2) {
            if (_Action.get(idx2) instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Action.get(idx2 ++)), "Action");
            } else {
                idx2 += 1;
            }
        }
        if (_Evidence!= null) {
            if (_Evidence instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Evidence), "Evidence");
            }
        }
    }

    public void serializeURIs(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_Action == null)? 0 :_Action.size());
        super.serializeURIs(context);
        while (idx2 != len2) {
            if (_Action.get(idx2) instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Action.get(idx2 ++)), "Action");
            } else {
                idx2 += 1;
            }
        }
        if (_Evidence!= null) {
            if (_Evidence instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Evidence), "Evidence");
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.liberty.ws.common.jaxb.assertion.AuthorizationDecisionStatementType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsr\u0000\u001dcom.sun.msv."
+"grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsq\u0000~\u0000\tppsq\u0000~\u0000\tppsr\u0000\'com."
+"sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000"
+"\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.Elem"
+"entExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentMode"
+"lq\u0000~\u0000\u0002xq\u0000~\u0000\u0003pp\u0000sq\u0000~\u0000\tppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq"
+"\u0000~\u0000\u0002xq\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 co"
+"m.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameC"
+"lassq\u0000~\u0000\u000exq\u0000~\u0000\u0003q\u0000~\u0000\u0016psr\u00002com.sun.msv.grammar.Expression$AnyS"
+"tringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\u0015\u0001q\u0000~\u0000\u001asr\u0000 com.sun.msv."
+"grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameC"
+"lass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonE"
+"xpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u001bq\u0000~\u0000 sr\u0000#com.sun.msv.grammar."
+"SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L"
+"\u0000\fnamespaceURIq\u0000~\u0000\"xq\u0000~\u0000\u001dt\u0000@com.sun.identity.liberty.ws.comm"
+"on.jaxb.assertion.SubjectElementt\u0000+http://java.sun.com/jaxb/"
+"xjc/dummy-elementssq\u0000~\u0000\rpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\rpp\u0000sq\u0000~\u0000\tppsq\u0000~\u0000\u0012q\u0000"
+"~\u0000\u0016psq\u0000~\u0000\u0017q\u0000~\u0000\u0016pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000=com.sun.identity.lib"
+"erty.ws.common.jaxb.assertion.SubjectTypeq\u0000~\u0000%sq\u0000~\u0000\tppsq\u0000~\u0000\u0017"
+"q\u0000~\u0000\u0016psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg"
+"/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/"
+"msv/util/StringPair;xq\u0000~\u0000\u0003q\u0000~\u0000\u0016psr\u0000\"com.sun.msv.datatype.xsd"
+".QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAto"
+"micType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000\"L\u0000\btypeNameq\u0000~\u0000\"L\u0000\nwhiteSpacet\u0000.Lcom"
+"/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3"
+".org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.Whit"
+"eSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype."
+"xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar."
+"Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0016psr\u0000\u001bcom.s"
+"un.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\"L\u0000\fnamespa"
+"ceURIq\u0000~\u0000\"xpq\u0000~\u0000;q\u0000~\u0000:sq\u0000~\u0000!t\u0000\u0004typet\u0000)http://www.w3.org/2001"
+"/XMLSchema-instanceq\u0000~\u0000 sq\u0000~\u0000!t\u0000\u0007Subjectt\u0000%urn:oasis:names:t"
+"c:SAML:1.0:assertionsq\u0000~\u0000\rpp\u0000sq\u0000~\u0000\tppsq\u0000~\u0000\u0012q\u0000~\u0000\u0016psq\u0000~\u0000\u0017q\u0000~\u0000\u0016"
+"pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00009com.sun.identity.liberty.ws.common."
+"jaxb.ps.SubjectElementq\u0000~\u0000%sq\u0000~\u0000\rpp\u0000sq\u0000~\u0000\tppsq\u0000~\u0000\u0012q\u0000~\u0000\u0016psq\u0000~"
+"\u0000\u0017q\u0000~\u0000\u0016pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000Dcom.sun.identity.liberty.ws."
+"common.jaxb.security.ProxySubjectElementq\u0000~\u0000%sq\u0000~\u0000\u0012ppsq\u0000~\u0000\tp"
+"psq\u0000~\u0000\rpp\u0000sq\u0000~\u0000\tppsq\u0000~\u0000\u0012q\u0000~\u0000\u0016psq\u0000~\u0000\u0017q\u0000~\u0000\u0016pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000"
+"~\u0000!t\u0000?com.sun.identity.liberty.ws.common.jaxb.assertion.Acti"
+"onElementq\u0000~\u0000%sq\u0000~\u0000\rpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\rpp\u0000sq\u0000~\u0000\tppsq\u0000~\u0000\u0012q\u0000~\u0000\u0016p"
+"sq\u0000~\u0000\u0017q\u0000~\u0000\u0016pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000<com.sun.identity.liberty"
+".ws.common.jaxb.assertion.ActionTypeq\u0000~\u0000%sq\u0000~\u0000\tppsq\u0000~\u0000\u0017q\u0000~\u0000\u0016"
+"pq\u0000~\u00003q\u0000~\u0000Cq\u0000~\u0000 sq\u0000~\u0000!t\u0000\u0006Actionq\u0000~\u0000Hsq\u0000~\u0000\tppsq\u0000~\u0000\tq\u0000~\u0000\u0016psq\u0000~"
+"\u0000\rq\u0000~\u0000\u0016p\u0000sq\u0000~\u0000\tppsq\u0000~\u0000\u0012q\u0000~\u0000\u0016psq\u0000~\u0000\u0017q\u0000~\u0000\u0016pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~"
+"\u0000!t\u0000Acom.sun.identity.liberty.ws.common.jaxb.assertion.Evide"
+"nceElementq\u0000~\u0000%sq\u0000~\u0000\rq\u0000~\u0000\u0016p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\rpp\u0000sq\u0000~\u0000\tppsq\u0000~\u0000\u0012q"
+"\u0000~\u0000\u0016psq\u0000~\u0000\u0017q\u0000~\u0000\u0016pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000>com.sun.identity.li"
+"berty.ws.common.jaxb.assertion.EvidenceTypeq\u0000~\u0000%sq\u0000~\u0000\tppsq\u0000~"
+"\u0000\u0017q\u0000~\u0000\u0016pq\u0000~\u00003q\u0000~\u0000Cq\u0000~\u0000 sq\u0000~\u0000!t\u0000\bEvidenceq\u0000~\u0000Hq\u0000~\u0000 sq\u0000~\u0000\u0017ppsq"
+"\u0000~\u00000ppsr\u0000)com.sun.msv.datatype.xsd.EnumerationFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0001L\u0000\u0006valuest\u0000\u000fLjava/util/Set;xr\u00009com.sun.msv.datatype.xsd.Da"
+"taTypeWithValueConstraintFacet\"\u00a7Ro\u00ca\u00c7\u008aT\u0002\u0000\u0000xr\u0000*com.sun.msv.dat"
+"atype.xsd.DataTypeWithFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFixedZ\u0000\u0012need"
+"ValueCheckFlagL\u0000\bbaseTypet\u0000)Lcom/sun/msv/datatype/xsd/XSData"
+"typeImpl;L\u0000\fconcreteTypet\u0000\'Lcom/sun/msv/datatype/xsd/Concret"
+"eType;L\u0000\tfacetNameq\u0000~\u0000\"xq\u0000~\u00007q\u0000~\u0000Ht\u0000\fDecisionTypesr\u00005com.sun"
+".msv.datatype.xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000"
+"~\u0000=\u0000\u0000sr\u0000#com.sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\ris"
+"AlwaysValidxq\u0000~\u00005q\u0000~\u0000:t\u0000\u0006stringq\u0000~\u0000\u0088\u0001q\u0000~\u0000\u008at\u0000\u000benumerationsr\u0000\u0011"
+"java.util.HashSet\u00baD\u0085\u0095\u0096\u00b8\u00b74\u0003\u0000\u0000xpw\f\u0000\u0000\u0000\u0010?@\u0000\u0000\u0000\u0000\u0000\u0003t\u0000\u0006Permitt\u0000\rInde"
+"terminatet\u0000\u0004Denyxq\u0000~\u0000@sq\u0000~\u0000Aq\u0000~\u0000\u0086q\u0000~\u0000Hsq\u0000~\u0000!t\u0000\bDecisiont\u0000\u0000sq"
+"\u0000~\u0000\u0017ppsq\u0000~\u00000q\u0000~\u0000\u0016psr\u0000#com.sun.msv.datatype.xsd.AnyURIType\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00005q\u0000~\u0000:t\u0000\u0006anyURIq\u0000~\u0000>q\u0000~\u0000@sq\u0000~\u0000Aq\u0000~\u0000\u009aq\u0000~\u0000:sq\u0000~\u0000!"
+"t\u0000\bResourceq\u0000~\u0000\u0095sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$Close"
+"dHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0"
+"N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/gra"
+"mmar/ExpressionPool;xp\u0000\u0000\u0000!\u0001pq\u0000~\u0000Vq\u0000~\u0000jq\u0000~\u0000\u0006q\u0000~\u0000Uq\u0000~\u0000\u0014q\u0000~\u0000*q\u0000"
+"~\u0000Kq\u0000~\u0000Qq\u0000~\u0000Yq\u0000~\u0000aq\u0000~\u0000mq\u0000~\u0000uq\u0000~\u0000\u0005q\u0000~\u0000\u0007q\u0000~\u0000\bq\u0000~\u0000\u0011q\u0000~\u0000)q\u0000~\u0000Jq\u0000"
+"~\u0000Pq\u0000~\u0000Xq\u0000~\u0000`q\u0000~\u0000lq\u0000~\u0000tq\u0000~\u0000\'q\u0000~\u0000^q\u0000~\u0000rq\u0000~\u0000\u000bq\u0000~\u0000\nq\u0000~\u0000iq\u0000~\u0000.q\u0000"
+"~\u0000eq\u0000~\u0000yq\u0000~\u0000\fx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.federation.jaxb.entityconfig.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
            super(context, "--------------");
        }

        protected Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AuthorizationDecisionStatementTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  6 :
                        if (("Subject" == ___local)&&("urn:liberty:iff:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectStatementAbstractTypeImpl)com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AuthorizationDecisionStatementTypeImpl.this).new Unmarshaller(context)), 7, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ProxySubject" == ___local)&&("urn:liberty:sec:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectStatementAbstractTypeImpl)com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AuthorizationDecisionStatementTypeImpl.this).new Unmarshaller(context)), 7, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Subject" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectStatementAbstractTypeImpl)com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AuthorizationDecisionStatementTypeImpl.this).new Unmarshaller(context)), 7, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Subject" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectStatementAbstractTypeImpl)com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AuthorizationDecisionStatementTypeImpl.this).new Unmarshaller(context)), 7, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectStatementAbstractTypeImpl)com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AuthorizationDecisionStatementTypeImpl.this).new Unmarshaller(context)), 7, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "Decision");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        break;
                    case  7 :
                        if (("Action" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            _getAction().add(((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.ActionElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.ActionElementImpl.class), 8, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Action" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 10;
                            return ;
                        }
                        break;
                    case  8 :
                        if (("Action" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            _getAction().add(((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.ActionElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.ActionElementImpl.class), 8, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Action" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 10;
                            return ;
                        }
                        if (("Evidence" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            _Evidence = ((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.EvidenceElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.EvidenceElementImpl.class), 9, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Evidence" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 12;
                            return ;
                        }
                        state = 9;
                        continue outer;
                    case  10 :
                        attIdx = context.getAttribute("", "Namespace");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  12 :
                        if (("AssertionIDReference" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            _Evidence = ((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.EvidenceTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.EvidenceTypeImpl.class), 13, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Assertion" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            _Evidence = ((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.EvidenceTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.EvidenceTypeImpl.class), 13, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                    case  9 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  3 :
                        attIdx = context.getAttribute("", "Resource");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 6;
                            eatText2(v);
                            continue outer;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Decision = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Resource = com.sun.xml.bind.WhiteSpaceProcessor.collapse(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  6 :
                        spawnHandlerFromLeaveElement((((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectStatementAbstractTypeImpl)com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AuthorizationDecisionStatementTypeImpl.this).new Unmarshaller(context)), 7, ___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "Decision");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        break;
                    case  8 :
                        state = 9;
                        continue outer;
                    case  11 :
                        if (("Action" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            context.popAttributes();
                            state = 8;
                            return ;
                        }
                        break;
                    case  13 :
                        if (("Evidence" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            context.popAttributes();
                            state = 9;
                            return ;
                        }
                        break;
                    case  10 :
                        attIdx = context.getAttribute("", "Namespace");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  9 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  3 :
                        attIdx = context.getAttribute("", "Resource");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 6;
                            eatText2(v);
                            continue outer;
                        }
                        break;
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
                    case  6 :
                        spawnHandlerFromEnterAttribute((((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectStatementAbstractTypeImpl)com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AuthorizationDecisionStatementTypeImpl.this).new Unmarshaller(context)), 7, ___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        if (("Decision" == ___local)&&("" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        break;
                    case  8 :
                        state = 9;
                        continue outer;
                    case  10 :
                        if (("Namespace" == ___local)&&("" == ___uri)) {
                            _getAction().add(((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.ActionTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.ActionTypeImpl.class), 11, ___uri, ___local, ___qname)));
                            return ;
                        }
                        break;
                    case  9 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  3 :
                        if (("Resource" == ___local)&&("" == ___uri)) {
                            state = 4;
                            return ;
                        }
                        break;
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
                    case  6 :
                        spawnHandlerFromLeaveAttribute((((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectStatementAbstractTypeImpl)com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AuthorizationDecisionStatementTypeImpl.this).new Unmarshaller(context)), 7, ___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "Decision");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        break;
                    case  2 :
                        if (("Decision" == ___local)&&("" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                    case  8 :
                        state = 9;
                        continue outer;
                    case  10 :
                        attIdx = context.getAttribute("", "Namespace");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  5 :
                        if (("Resource" == ___local)&&("" == ___uri)) {
                            state = 6;
                            return ;
                        }
                        break;
                    case  9 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  3 :
                        attIdx = context.getAttribute("", "Resource");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 6;
                            eatText2(v);
                            continue outer;
                        }
                        break;
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
                        case  6 :
                            spawnHandlerFromText((((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectStatementAbstractTypeImpl)com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AuthorizationDecisionStatementTypeImpl.this).new Unmarshaller(context)), 7, value);
                            return ;
                        case  0 :
                            attIdx = context.getAttribute("", "Decision");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 3;
                                eatText1(v);
                                continue outer;
                            }
                            break;
                        case  4 :
                            state = 5;
                            eatText2(value);
                            return ;
                        case  8 :
                            state = 9;
                            continue outer;
                        case  1 :
                            state = 2;
                            eatText1(value);
                            return ;
                        case  10 :
                            attIdx = context.getAttribute("", "Namespace");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            _getAction().add(((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.ActionTypeImpl) spawnChildFromText((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.ActionTypeImpl.class), 11, value)));
                            return ;
                        case  9 :
                            revertToParentFromText(value);
                            return ;
                        case  3 :
                            attIdx = context.getAttribute("", "Resource");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 6;
                                eatText2(v);
                                continue outer;
                            }
                            break;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
