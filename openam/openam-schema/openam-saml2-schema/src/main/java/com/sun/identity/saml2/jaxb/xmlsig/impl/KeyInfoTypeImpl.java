//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:34:07 AM PDT 
//


package com.sun.identity.saml2.jaxb.xmlsig.impl;

public class KeyInfoTypeImpl implements com.sun.identity.saml2.jaxb.xmlsig.KeyInfoType, com.sun.xml.bind.JAXBObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallableObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializable, com.sun.xml.bind.marshaller.IdentifiableObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.ValidatableObject
{

    protected java.lang.String _Id;
    protected com.sun.xml.bind.util.ListImpl _Content;
    public final static java.lang.Class version = (com.sun.identity.saml2.jaxb.xmlsig.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.saml2.jaxb.xmlsig.KeyInfoType.class);
    }

    public java.lang.String getId() {
        return _Id;
    }

    public void setId(java.lang.String value) {
        _Id = value;
    }

    protected com.sun.xml.bind.util.ListImpl _getContent() {
        if (_Content == null) {
            _Content = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _Content;
    }

    public java.util.List getContent() {
        return _getContent();
    }

    public com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_Content == null)? 0 :_Content.size());
        while (idx2 != len2) {
            {
                java.lang.Object o = _Content.get(idx2);
                if (o instanceof com.sun.xml.bind.JAXBObject) {
                    context.childAsBody(((com.sun.xml.bind.JAXBObject) _Content.get(idx2 ++)), "Content");
                } else {
                    if (o instanceof java.lang.String) {
                        try {
                            context.text(((java.lang.String) _Content.get(idx2 ++)), "Content");
                        } catch (java.lang.Exception e) {
                            com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
                        }
                    } else {
                        if (o instanceof java.lang.Object) {
                            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Content.get(idx2 ++)), "Content");
                        } else {
                            com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handleTypeMismatchError(context, this, "Content", o);
                        }
                    }
                }
            }
        }
    }

    public void serializeAttributes(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_Content == null)? 0 :_Content.size());
        if (_Id!= null) {
            context.startAttribute("", "Id");
            try {
                context.text(context.onID(this, ((java.lang.String) _Id)), "Id");
            } catch (java.lang.Exception e) {
                com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        while (idx2 != len2) {
            {
                java.lang.Object o = _Content.get(idx2);
                if (o instanceof com.sun.xml.bind.JAXBObject) {
                    context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Content.get(idx2 ++)), "Content");
                } else {
                    if (o instanceof java.lang.String) {
                        try {
                            idx2 += 1;
                        } catch (java.lang.Exception e) {
                            com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
                        }
                    } else {
                        if (o instanceof java.lang.Object) {
                            idx2 += 1;
                        } else {
                            com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handleTypeMismatchError(context, this, "Content", o);
                        }
                    }
                }
            }
        }
    }

    public void serializeURIs(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_Content == null)? 0 :_Content.size());
        while (idx2 != len2) {
            {
                java.lang.Object o = _Content.get(idx2);
                if (o instanceof com.sun.xml.bind.JAXBObject) {
                    context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Content.get(idx2 ++)), "Content");
                } else {
                    if (o instanceof java.lang.String) {
                        try {
                            idx2 += 1;
                        } catch (java.lang.Exception e) {
                            com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
                        }
                    } else {
                        if (o instanceof java.lang.Object) {
                            idx2 += 1;
                        } else {
                            com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handleTypeMismatchError(context, this, "Content", o);
                        }
                    }
                }
            }
        }
    }

    public java.lang.String ____jaxb____getId() {
        return ((java.lang.String) _Id);
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.saml2.jaxb.xmlsig.KeyInfoType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsr\u0000\u001ccom.sun.msv.grammar.MixedExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000"
+"~\u0000\u0003ppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0007pp"
+"sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsq\u0000~\u0000\u000bpp"
+"sq\u0000~\u0000\u000bppsq\u0000~\u0000\u000bppsq\u0000~\u0000\u000bppsq\u0000~\u0000\u000bppsq\u0000~\u0000\u000bppsr\u0000\'com.sun.msv.gram"
+"mar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/ms"
+"v/grammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003"
+"pp\u0000sq\u0000~\u0000\u000bppsq\u0000~\u0000\tsr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000"
+"psr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L"
+"\u0000\tnameClassq\u0000~\u0000\u0014xq\u0000~\u0000\u0003q\u0000~\u0000\u001apsr\u00002com.sun.msv.grammar.Expressi"
+"on$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\u0019\u0001q\u0000~\u0000\u001esr\u0000 com.s"
+"un.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.gramma"
+"r.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$E"
+"psilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u001fq\u0000~\u0000$sr\u0000#com.sun.msv.g"
+"rammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/S"
+"tring;L\u0000\fnamespaceURIq\u0000~\u0000&xq\u0000~\u0000!t\u00001com.sun.identity.saml2.ja"
+"xb.xmlsig.KeyNameElementt\u0000+http://java.sun.com/jaxb/xjc/dumm"
+"y-elementssq\u0000~\u0000\u0013pp\u0000sq\u0000~\u0000\u000bppsq\u0000~\u0000\tq\u0000~\u0000\u001apsq\u0000~\u0000\u001bq\u0000~\u0000\u001apq\u0000~\u0000\u001eq\u0000~\u0000"
+"\"q\u0000~\u0000$sq\u0000~\u0000%t\u00002com.sun.identity.saml2.jaxb.xmlsig.KeyValueEl"
+"ementq\u0000~\u0000)sq\u0000~\u0000\u0013pp\u0000sq\u0000~\u0000\u000bppsq\u0000~\u0000\tq\u0000~\u0000\u001apsq\u0000~\u0000\u001bq\u0000~\u0000\u001apq\u0000~\u0000\u001eq\u0000~\u0000"
+"\"q\u0000~\u0000$sq\u0000~\u0000%t\u00009com.sun.identity.saml2.jaxb.xmlsig.RetrievalM"
+"ethodElementq\u0000~\u0000)sq\u0000~\u0000\u0013pp\u0000sq\u0000~\u0000\u000bppsq\u0000~\u0000\tq\u0000~\u0000\u001apsq\u0000~\u0000\u001bq\u0000~\u0000\u001apq\u0000"
+"~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%t\u00002com.sun.identity.saml2.jaxb.xmlsig.X50"
+"9DataElementq\u0000~\u0000)sq\u0000~\u0000\u0013pp\u0000sq\u0000~\u0000\u000bppsq\u0000~\u0000\tq\u0000~\u0000\u001apsq\u0000~\u0000\u001bq\u0000~\u0000\u001apq\u0000"
+"~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%t\u00001com.sun.identity.saml2.jaxb.xmlsig.PGP"
+"DataElementq\u0000~\u0000)sq\u0000~\u0000\u0013pp\u0000sq\u0000~\u0000\u000bppsq\u0000~\u0000\tq\u0000~\u0000\u001apsq\u0000~\u0000\u001bq\u0000~\u0000\u001apq\u0000~"
+"\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%t\u00002com.sun.identity.saml2.jaxb.xmlsig.SPKI"
+"DataElementq\u0000~\u0000)sq\u0000~\u0000\u0013pp\u0000sq\u0000~\u0000\u000bppsq\u0000~\u0000\tq\u0000~\u0000\u001apsq\u0000~\u0000\u001bq\u0000~\u0000\u001apq\u0000~"
+"\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%t\u00002com.sun.identity.saml2.jaxb.xmlsig.Mgmt"
+"DataElementq\u0000~\u0000)sq\u0000~\u0000\u0013pp\u0000sq\u0000~\u0000\u001bppq\u0000~\u0000\u001esr\u0000\'com.sun.msv.gramma"
+"r.DifferenceNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003nc1q\u0000~\u0000\u0014L\u0000\u0003nc2q\u0000~\u0000\u0014xq\u0000~\u0000!"
+"q\u0000~\u0000\"sr\u0000#com.sun.msv.grammar.ChoiceNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003nc"
+"1q\u0000~\u0000\u0014L\u0000\u0003nc2q\u0000~\u0000\u0014xq\u0000~\u0000!sr\u0000&com.sun.msv.grammar.NamespaceName"
+"Class\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\fnamespaceURIq\u0000~\u0000&xq\u0000~\u0000!t\u0000\u0000sq\u0000~\u0000Tt\u0000\"http:/"
+"/www.w3.org/2000/09/xmldsig#sq\u0000~\u0000Tq\u0000~\u0000)sq\u0000~\u0000\u000bppsq\u0000~\u0000\u001bq\u0000~\u0000\u001aps"
+"r\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxn"
+"g/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/uti"
+"l/StringPair;xq\u0000~\u0000\u0003ppsr\u0000\u001fcom.sun.msv.datatype.xsd.IDType\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd.NcnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000"
+"\"com.sun.msv.datatype.xsd.TokenType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.ms"
+"v.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxr\u0000*com."
+"sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun"
+".msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.dat"
+"atype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000&L\u0000\bty"
+"peNameq\u0000~\u0000&L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSp"
+"aceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0002IDsr\u00005c"
+"om.sun.msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xp\u0000sr\u00000com.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u001apsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002"
+"\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000&L\u0000\fnamespaceURIq\u0000~\u0000&xpq\u0000~\u0000jq\u0000~\u0000isq\u0000~\u0000%t\u0000\u0002"
+"Idq\u0000~\u0000Vq\u0000~\u0000$sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHas"
+"h;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed"
+"\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar"
+"/ExpressionPool;xp\u0000\u0000\u0000\u0019\u0001pq\u0000~\u0000\u0017q\u0000~\u0000+q\u0000~\u00001q\u0000~\u00007q\u0000~\u0000=q\u0000~\u0000Cq\u0000~\u0000Iq"
+"\u0000~\u0000\fq\u0000~\u0000\nq\u0000~\u0000Zq\u0000~\u0000\u0005q\u0000~\u0000\u0018q\u0000~\u0000,q\u0000~\u00002q\u0000~\u00008q\u0000~\u0000\u0010q\u0000~\u0000>q\u0000~\u0000Dq\u0000~\u0000Jq"
+"\u0000~\u0000\u000fq\u0000~\u0000\u0012q\u0000~\u0000\u000eq\u0000~\u0000\rq\u0000~\u0000\bq\u0000~\u0000\u0011x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.saml2.jaxb.assertion.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        if (("KeyName" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            _getContent().add(((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyNameElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyNameElementImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("KeyValue" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            _getContent().add(((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyValueElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyValueElementImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("RetrievalMethod" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            _getContent().add(((com.sun.identity.saml2.jaxb.xmlsig.impl.RetrievalMethodElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.xmlsig.impl.RetrievalMethodElementImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("X509Data" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            _getContent().add(((com.sun.identity.saml2.jaxb.xmlsig.impl.X509DataElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.xmlsig.impl.X509DataElementImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("PGPData" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            _getContent().add(((com.sun.identity.saml2.jaxb.xmlsig.impl.PGPDataElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.xmlsig.impl.PGPDataElementImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("SPKIData" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            _getContent().add(((com.sun.identity.saml2.jaxb.xmlsig.impl.SPKIDataElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.xmlsig.impl.SPKIDataElementImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("MgmtData" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            _getContent().add(((com.sun.identity.saml2.jaxb.xmlsig.impl.MgmtDataElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.xmlsig.impl.MgmtDataElementImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (!(("" == ___uri)||("http://www.w3.org/2000/09/xmldsig#" == ___uri))) {
                            java.lang.Object co = spawnWildcard(3, ___uri, ___local, ___qname, __atts);
                            if (co!= null) {
                                _getContent().add(co);
                            }
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Id = context.addToIdTable(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
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
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        state = 3;
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
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        if (("Id" == ___local)&&("" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        state = 3;
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
                    case  2 :
                        if (("Id" == ___local)&&("" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        state = 3;
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
                        case  1 :
                            state = 2;
                            eatText1(value);
                            return ;
                        case  3 :
                            state = 3;
                            eatText2(value);
                            return ;
                        case  0 :
                            attIdx = context.getAttribute("", "Id");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 3;
                                eatText1(v);
                                continue outer;
                            }
                            state = 3;
                            continue outer;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _getContent().add(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

    }

}
