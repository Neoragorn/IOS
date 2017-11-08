
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
 *         &lt;element name="CoachesResult" type="{http://footballpool.dataaccess.eu}ArrayOftCoaches"/&gt;
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
    "coachesResult"
})
@XmlRootElement(name = "CoachesResponse")
public class CoachesResponse {

    @XmlElement(name = "CoachesResult", required = true)
    protected ArrayOftCoaches coachesResult;

    /**
     * Obtient la valeur de la propriété coachesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftCoaches }
     *     
     */
    public ArrayOftCoaches getCoachesResult() {
        return coachesResult;
    }

    /**
     * Définit la valeur de la propriété coachesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftCoaches }
     *     
     */
    public void setCoachesResult(ArrayOftCoaches value) {
        this.coachesResult = value;
    }

}
