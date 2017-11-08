
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
 *         &lt;element name="AllStadiumInfoResult" type="{http://footballpool.dataaccess.eu}ArrayOftStadiumInfo"/&gt;
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
    "allStadiumInfoResult"
})
@XmlRootElement(name = "AllStadiumInfoResponse")
public class AllStadiumInfoResponse {

    @XmlElement(name = "AllStadiumInfoResult", required = true)
    protected ArrayOftStadiumInfo allStadiumInfoResult;

    /**
     * Obtient la valeur de la propriété allStadiumInfoResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftStadiumInfo }
     *     
     */
    public ArrayOftStadiumInfo getAllStadiumInfoResult() {
        return allStadiumInfoResult;
    }

    /**
     * Définit la valeur de la propriété allStadiumInfoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftStadiumInfo }
     *     
     */
    public void setAllStadiumInfoResult(ArrayOftStadiumInfo value) {
        this.allStadiumInfoResult = value;
    }

}
