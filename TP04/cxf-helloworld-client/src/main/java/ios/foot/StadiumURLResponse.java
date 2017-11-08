
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
 *         &lt;element name="StadiumURLResult" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "stadiumURLResult"
})
@XmlRootElement(name = "StadiumURLResponse")
public class StadiumURLResponse {

    @XmlElement(name = "StadiumURLResult", required = true)
    protected String stadiumURLResult;

    /**
     * Obtient la valeur de la propriété stadiumURLResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStadiumURLResult() {
        return stadiumURLResult;
    }

    /**
     * Définit la valeur de la propriété stadiumURLResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStadiumURLResult(String value) {
        this.stadiumURLResult = value;
    }

}
