
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
 *         &lt;element name="FullTeamInfoResult" type="{http://footballpool.dataaccess.eu}tFullTeamInfo"/&gt;
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
    "fullTeamInfoResult"
})
@XmlRootElement(name = "FullTeamInfoResponse")
public class FullTeamInfoResponse {

    @XmlElement(name = "FullTeamInfoResult", required = true)
    protected TFullTeamInfo fullTeamInfoResult;

    /**
     * Obtient la valeur de la propriété fullTeamInfoResult.
     * 
     * @return
     *     possible object is
     *     {@link TFullTeamInfo }
     *     
     */
    public TFullTeamInfo getFullTeamInfoResult() {
        return fullTeamInfoResult;
    }

    /**
     * Définit la valeur de la propriété fullTeamInfoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link TFullTeamInfo }
     *     
     */
    public void setFullTeamInfoResult(TFullTeamInfo value) {
        this.fullTeamInfoResult = value;
    }

}
