
package ios.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour accountType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="accountType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CHEQUES"/&gt;
 *     &lt;enumeration value="LIVRET_A"/&gt;
 *     &lt;enumeration value="LIVRET_DEVELOPPEMENT_DURABLE"/&gt;
 *     &lt;enumeration value="LIVRET_JEUNE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "accountType")
@XmlEnum
public enum AccountType {

    CHEQUES,
    LIVRET_A,
    LIVRET_DEVELOPPEMENT_DURABLE,
    LIVRET_JEUNE;

    public String value() {
        return name();
    }

    public static AccountType fromValue(String v) {
        return valueOf(v);
    }

}
