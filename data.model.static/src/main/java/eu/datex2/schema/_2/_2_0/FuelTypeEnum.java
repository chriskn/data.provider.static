//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.05 at 02:48:15 PM CET 
//


package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FuelTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FuelTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="battery"/>
 *     &lt;enumeration value="biodiesel"/>
 *     &lt;enumeration value="diesel"/>
 *     &lt;enumeration value="dieselBatteryHybrid"/>
 *     &lt;enumeration value="ethanol"/>
 *     &lt;enumeration value="hydrogen"/>
 *     &lt;enumeration value="liquidGas"/>
 *     &lt;enumeration value="lpg"/>
 *     &lt;enumeration value="methane"/>
 *     &lt;enumeration value="petrol"/>
 *     &lt;enumeration value="petrolBatteryHybrid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FuelTypeEnum")
@XmlEnum
public enum FuelTypeEnum {


    /**
     * Battery.
     * 
     */
    @XmlEnumValue("battery")
    BATTERY("battery"),

    /**
     * Biodiesel.
     * 
     */
    @XmlEnumValue("biodiesel")
    BIODIESEL("biodiesel"),

    /**
     * Diesel.
     * 
     */
    @XmlEnumValue("diesel")
    DIESEL("diesel"),

    /**
     * Diesel and battery hybrid.
     * 
     */
    @XmlEnumValue("dieselBatteryHybrid")
    DIESEL_BATTERY_HYBRID("dieselBatteryHybrid"),

    /**
     * Ethanol.
     * 
     */
    @XmlEnumValue("ethanol")
    ETHANOL("ethanol"),

    /**
     * Hydrogen.
     * 
     */
    @XmlEnumValue("hydrogen")
    HYDROGEN("hydrogen"),

    /**
     * Liquid gas of any type including LPG.
     * 
     */
    @XmlEnumValue("liquidGas")
    LIQUID_GAS("liquidGas"),

    /**
     * Liquid petroleum gas.
     * 
     */
    @XmlEnumValue("lpg")
    LPG("lpg"),

    /**
     * Methane gas.
     * 
     */
    @XmlEnumValue("methane")
    METHANE("methane"),

    /**
     * Petrol.
     * 
     */
    @XmlEnumValue("petrol")
    PETROL("petrol"),

    /**
     * Petrol and battery hybrid.
     * 
     */
    @XmlEnumValue("petrolBatteryHybrid")
    PETROL_BATTERY_HYBRID("petrolBatteryHybrid");
    private final String value;

    FuelTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FuelTypeEnum fromValue(String v) {
        for (FuelTypeEnum c: FuelTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
