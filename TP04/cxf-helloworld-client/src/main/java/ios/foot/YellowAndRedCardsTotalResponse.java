
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
 *         &lt;element name="YellowAndRedCardsTotalResult" type="{http://footballpool.dataaccess.eu}tCards"/&gt;
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
    "yellowAndRedCardsTotalResult"
})
@XmlRootElement(name = "YellowAndRedCardsTotalResponse")
public class YellowAndRedCardsTotalResponse {

    @XmlElement(name = "YellowAndRedCardsTotalResult", required = true)
    protected TCards yellowAndRedCardsTotalResult;

    /**
     * Obtient la valeur de la propriété yellowAndRedCardsTotalResult.
     * 
     * @return
     *     possible object is
     *     {@link TCards }
     *     
     */
    public TCards getYellowAndRedCardsTotalResult() {
        return yellowAndRedCardsTotalResult;
    }

    /**
     * Définit la valeur de la propriété yellowAndRedCardsTotalResult.
     * 
     * @param value
     *     allowed object is
     *     {@link TCards }
     *     
     */
    public void setYellowAndRedCardsTotalResult(TCards value) {
        this.yellowAndRedCardsTotalResult = value;
    }

}
