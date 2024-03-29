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
 * <p>Java class for PublicHolidayTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PublicHolidayTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="betweenChristmasAndNewYear"/>
 *     &lt;enumeration value="boxingDay"/>
 *     &lt;enumeration value="bridgeHoliday"/>
 *     &lt;enumeration value="christmasEve"/>
 *     &lt;enumeration value="christmasDayAndBoxingDay"/>
 *     &lt;enumeration value="christmasHolidayPeriod"/>
 *     &lt;enumeration value="dayFollowingPublicHoliday"/>
 *     &lt;enumeration value="easterFridayHoliday"/>
 *     &lt;enumeration value="easterHolidayPeriod"/>
 *     &lt;enumeration value="easterMondayHoliday"/>
 *     &lt;enumeration value="easterSaturday"/>
 *     &lt;enumeration value="easterSunday"/>
 *     &lt;enumeration value="eveOfPublicHoliday"/>
 *     &lt;enumeration value="inLieuOfPublicHoliday"/>
 *     &lt;enumeration value="january2ndHoliday"/>
 *     &lt;enumeration value="newYearsDay"/>
 *     &lt;enumeration value="newYearsEve"/>
 *     &lt;enumeration value="notPublicHoliday"/>
 *     &lt;enumeration value="publicHoliday"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PublicHolidayTypeEnum")
@XmlEnum
public enum PublicHolidayTypeEnum {


    /**
     * The days between the Christmas and New Year public holidays which are not official public holdays.
     * 
     */
    @XmlEnumValue("betweenChristmasAndNewYear")
    BETWEEN_CHRISTMAS_AND_NEW_YEAR("betweenChristmasAndNewYear"),

    /**
     * The day following Christmas day.
     * 
     */
    @XmlEnumValue("boxingDay")
    BOXING_DAY("boxingDay"),

    /**
     * A day between a public holiday and the weekend.
     * 
     */
    @XmlEnumValue("bridgeHoliday")
    BRIDGE_HOLIDAY("bridgeHoliday"),

    /**
     * The day before Christmas day.
     * 
     */
    @XmlEnumValue("christmasEve")
    CHRISTMAS_EVE("christmasEve"),

    /**
     * Christmas day and Boxing day (day following Christmas day).
     * 
     */
    @XmlEnumValue("christmasDayAndBoxingDay")
    CHRISTMAS_DAY_AND_BOXING_DAY("christmasDayAndBoxingDay"),

    /**
     * The period between the Christmas and New Year public holidays (inclusive).
     * 
     */
    @XmlEnumValue("christmasHolidayPeriod")
    CHRISTMAS_HOLIDAY_PERIOD("christmasHolidayPeriod"),

    /**
     * A day following a public holiday.
     * 
     */
    @XmlEnumValue("dayFollowingPublicHoliday")
    DAY_FOLLOWING_PUBLIC_HOLIDAY("dayFollowingPublicHoliday"),

    /**
     * Good Friday (the Friday prior to the Easter weekend).
     * 
     */
    @XmlEnumValue("easterFridayHoliday")
    EASTER_FRIDAY_HOLIDAY("easterFridayHoliday"),

    /**
     * The period between Easter Friday and Easter Monday (inclusive).
     * 
     */
    @XmlEnumValue("easterHolidayPeriod")
    EASTER_HOLIDAY_PERIOD("easterHolidayPeriod"),

    /**
     * The Monday following the Easter weekend.
     * 
     */
    @XmlEnumValue("easterMondayHoliday")
    EASTER_MONDAY_HOLIDAY("easterMondayHoliday"),

    /**
     * The Saturday of the Easter weekend.
     * 
     */
    @XmlEnumValue("easterSaturday")
    EASTER_SATURDAY("easterSaturday"),

    /**
     * Easter Sunday.
     * 
     */
    @XmlEnumValue("easterSunday")
    EASTER_SUNDAY("easterSunday"),

    /**
     * The day preceding a public holiday.
     * 
     */
    @XmlEnumValue("eveOfPublicHoliday")
    EVE_OF_PUBLIC_HOLIDAY("eveOfPublicHoliday"),

    /**
     * A holiday in lieu of a public holiday which falls on a weekend.
     * 
     */
    @XmlEnumValue("inLieuOfPublicHoliday")
    IN_LIEU_OF_PUBLIC_HOLIDAY("inLieuOfPublicHoliday"),

    /**
     * The 2nd of January holiday.
     * 
     */
    @XmlEnumValue("january2ndHoliday")
    JANUARY_2_ND_HOLIDAY("january2ndHoliday"),

    /**
     * New Years day.
     * 
     */
    @XmlEnumValue("newYearsDay")
    NEW_YEARS_DAY("newYearsDay"),

    /**
     * The day before New Years day.
     * 
     */
    @XmlEnumValue("newYearsEve")
    NEW_YEARS_EVE("newYearsEve"),

    /**
     * A day which is not a public holiday.
     * 
     */
    @XmlEnumValue("notPublicHoliday")
    NOT_PUBLIC_HOLIDAY("notPublicHoliday"),

    /**
     * A public holiday in the respective country/region.
     * 
     */
    @XmlEnumValue("publicHoliday")
    PUBLIC_HOLIDAY("publicHoliday");
    private final String value;

    PublicHolidayTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PublicHolidayTypeEnum fromValue(String v) {
        for (PublicHolidayTypeEnum c: PublicHolidayTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
