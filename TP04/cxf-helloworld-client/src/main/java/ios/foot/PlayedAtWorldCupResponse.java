
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
 *         &lt;element name="PlayedAtWorldCupResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "playedAtWorldCupResult"
})
@XmlRootElement(name = "PlayedAtWorldCupResponse")
public class PlayedAtWorldCupResponse {

    @XmlElement(name = "PlayedAtWorldCupResult")
    protected int playedAtWorldCupResult;

    /**
     * Obtient la valeur de la propriété playedAtWorldCupResult.
     * 
     */
    public int getPlayedAtWorldCupResult() {
        return playedAtWorldCupResult;
    }

    /**
     * Définit la valeur de la propriété playedAtWorldCupResult.
     * 
     */
    public void setPlayedAtWorldCupResult(int value) {
        this.playedAtWorldCupResult = value;
    }

}
