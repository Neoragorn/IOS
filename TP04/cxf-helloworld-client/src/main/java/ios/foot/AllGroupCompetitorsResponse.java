
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
 *         &lt;element name="AllGroupCompetitorsResult" type="{http://footballpool.dataaccess.eu}ArrayOftGroupsCompetitors"/&gt;
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
    "allGroupCompetitorsResult"
})
@XmlRootElement(name = "AllGroupCompetitorsResponse")
public class AllGroupCompetitorsResponse {

    @XmlElement(name = "AllGroupCompetitorsResult", required = true)
    protected ArrayOftGroupsCompetitors allGroupCompetitorsResult;

    /**
     * Obtient la valeur de la propriété allGroupCompetitorsResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftGroupsCompetitors }
     *     
     */
    public ArrayOftGroupsCompetitors getAllGroupCompetitorsResult() {
        return allGroupCompetitorsResult;
    }

    /**
     * Définit la valeur de la propriété allGroupCompetitorsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftGroupsCompetitors }
     *     
     */
    public void setAllGroupCompetitorsResult(ArrayOftGroupsCompetitors value) {
        this.allGroupCompetitorsResult = value;
    }

}
