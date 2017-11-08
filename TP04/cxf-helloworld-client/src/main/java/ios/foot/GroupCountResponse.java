
package ios.foot;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GroupCountResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "groupCountResult"
})
@XmlRootElement(name = "GroupCountResponse")
public class GroupCountResponse {

    @XmlElement(name = "GroupCountResult")
    protected int groupCountResult;

    /**
     * Obtient la valeur de la propriété groupCountResult.
     * 
     */
    public int getGroupCountResult() {
        return groupCountResult;
    }

    /**
     * Définit la valeur de la propriété groupCountResult.
     * 
     */
    public void setGroupCountResult(int value) {
        this.groupCountResult = value;
    }

}
