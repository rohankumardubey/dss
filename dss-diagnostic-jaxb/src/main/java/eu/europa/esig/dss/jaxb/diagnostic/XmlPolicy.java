//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.13 at 08:47:49 AM CEST 
//


package eu.europa.esig.dss.jaxb.diagnostic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DigestAlgAndValue" type="{http://dss.esig.europa.eu/validation/diagnostic}DigestAlgAndValueType" minOccurs="0"/>
 *         &lt;element name="Asn1Processable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Identified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProcessingError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DigestAlgorithmsEqual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "url",
    "notice",
    "digestAlgAndValue",
    "asn1Processable",
    "identified",
    "status",
    "processingError",
    "digestAlgorithmsEqual"
})
public class XmlPolicy {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Url")
    protected String url;
    @XmlElement(name = "Notice")
    protected String notice;
    @XmlElement(name = "DigestAlgAndValue")
    protected XmlDigestAlgAndValueType digestAlgAndValue;
    @XmlElement(name = "Asn1Processable")
    protected Boolean asn1Processable;
    @XmlElement(name = "Identified")
    protected Boolean identified;
    @XmlElement(name = "Status")
    protected Boolean status;
    @XmlElement(name = "ProcessingError")
    protected String processingError;
    @XmlElement(name = "DigestAlgorithmsEqual")
    protected Boolean digestAlgorithmsEqual;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the notice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotice() {
        return notice;
    }

    /**
     * Sets the value of the notice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotice(String value) {
        this.notice = value;
    }

    /**
     * Gets the value of the digestAlgAndValue property.
     * 
     * @return
     *     possible object is
     *     {@link XmlDigestAlgAndValueType }
     *     
     */
    public XmlDigestAlgAndValueType getDigestAlgAndValue() {
        return digestAlgAndValue;
    }

    /**
     * Sets the value of the digestAlgAndValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlDigestAlgAndValueType }
     *     
     */
    public void setDigestAlgAndValue(XmlDigestAlgAndValueType value) {
        this.digestAlgAndValue = value;
    }

    /**
     * Gets the value of the asn1Processable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAsn1Processable() {
        return asn1Processable;
    }

    /**
     * Sets the value of the asn1Processable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAsn1Processable(Boolean value) {
        this.asn1Processable = value;
    }

    /**
     * Gets the value of the identified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdentified() {
        return identified;
    }

    /**
     * Sets the value of the identified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdentified(Boolean value) {
        this.identified = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatus(Boolean value) {
        this.status = value;
    }

    /**
     * Gets the value of the processingError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingError() {
        return processingError;
    }

    /**
     * Sets the value of the processingError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingError(String value) {
        this.processingError = value;
    }

    /**
     * Gets the value of the digestAlgorithmsEqual property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDigestAlgorithmsEqual() {
        return digestAlgorithmsEqual;
    }

    /**
     * Sets the value of the digestAlgorithmsEqual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDigestAlgorithmsEqual(Boolean value) {
        this.digestAlgorithmsEqual = value;
    }

}
