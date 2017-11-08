
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
 *         &lt;element name="AllPlayersWithRedCardsResult" type="{http://footballpool.dataaccess.eu}ArrayOftPlayersWithCards"/&gt;
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
    "allPlayersWithRedCardsResult"
})
@XmlRootElement(name = "AllPlayersWithRedCardsResponse")
public class AllPlayersWithRedCardsResponse {

    @XmlElement(name = "AllPlayersWithRedCardsResult", required = true)
    protected ArrayOftPlayersWithCards allPlayersWithRedCardsResult;

    /**
     * Obtient la valeur de la propriété allPlayersWithRedCardsResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftPlayersWithCards }
     *     
     */
    public ArrayOftPlayersWithCards getAllPlayersWithRedCardsResult() {
        return allPlayersWithRedCardsResult;
    }

    /**
     * Définit la valeur de la propriété allPlayersWithRedCardsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftPlayersWithCards }
     *     
     */
    public void setAllPlayersWithRedCardsResult(ArrayOftPlayersWithCards value) {
        this.allPlayersWithRedCardsResult = value;
    }

}
