
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
 *         &lt;element name="TeamsCompeteListResult" type="{http://footballpool.dataaccess.eu}ArrayOftTeamCompete"/&gt;
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
    "teamsCompeteListResult"
})
@XmlRootElement(name = "TeamsCompeteListResponse")
public class TeamsCompeteListResponse {

    @XmlElement(name = "TeamsCompeteListResult", required = true)
    protected ArrayOftTeamCompete teamsCompeteListResult;

    /**
     * Obtient la valeur de la propriété teamsCompeteListResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftTeamCompete }
     *     
     */
    public ArrayOftTeamCompete getTeamsCompeteListResult() {
        return teamsCompeteListResult;
    }

    /**
     * Définit la valeur de la propriété teamsCompeteListResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftTeamCompete }
     *     
     */
    public void setTeamsCompeteListResult(ArrayOftTeamCompete value) {
        this.teamsCompeteListResult = value;
    }

}
