//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.05 at 02:48:15 PM CET 
//


package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A linear element along a single linear object defined by its identifier or code in a road network reference model (specified in LinearElement class) which segments the road network according to specific business rules.
 * 
 * <p>Java class for LinearElementByCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinearElementByCode">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}LinearElement">
 *       &lt;sequence>
 *         &lt;element name="linearElementIdentifier" type="{http://datex2.eu/schema/2/2_0}String"/>
 *         &lt;element name="linearElementByCodeExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinearElementByCode", propOrder = {
    "linearElementIdentifier",
    "linearElementByCodeExtension"
})
public class LinearElementByCode
    extends LinearElement
{

    @XmlElement(required = true)
    protected String linearElementIdentifier;
    protected ExtensionType linearElementByCodeExtension;

    /**
     * Gets the value of the linearElementIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinearElementIdentifier() {
        return linearElementIdentifier;
    }

    /**
     * Sets the value of the linearElementIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinearElementIdentifier(String value) {
        this.linearElementIdentifier = value;
    }

    /**
     * Gets the value of the linearElementByCodeExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLinearElementByCodeExtension() {
        return linearElementByCodeExtension;
    }

    /**
     * Sets the value of the linearElementByCodeExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLinearElementByCodeExtension(ExtensionType value) {
        this.linearElementByCodeExtension = value;
    }

}
