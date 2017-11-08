
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
 *         &lt;element name="AllPlayerNamesResult" type="{http://footballpool.dataaccess.eu}ArrayOftPlayerNames"/&gt;
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
    "allPlayerNamesResult"
})
@XmlRootElement(name = "AllPlayerNamesResponse")
public class AllPlayerNamesResponse {

    @XmlElement(name = "AllPlayerNamesResult", required = true)
    protected ArrayOftPlayerNames allPlayerNamesResult;

    /**
     * Obtient la valeur de la propriété allPlayerNamesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftPlayerNames }
     *     
     */
    public ArrayOftPlayerNames getAllPlayerNamesResult() {
        return allPlayerNamesResult;
    }

    /**
     * Définit la valeur de la propriété allPlayerNamesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftPlayerNames }
     *     
     */
    public void setAllPlayerNamesResult(ArrayOftPlayerNames value) {
        this.allPlayerNamesResult = value;
    }

}
