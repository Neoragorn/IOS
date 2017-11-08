
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
 *         &lt;element name="StadiumNamesResult" type="{http://footballpool.dataaccess.eu}ArrayOfString"/&gt;
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
    "stadiumNamesResult"
})
@XmlRootElement(name = "StadiumNamesResponse")
public class StadiumNamesResponse {

    @XmlElement(name = "StadiumNamesResult", required = true)
    protected ArrayOfString stadiumNamesResult;

    /**
     * Obtient la valeur de la propriété stadiumNamesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getStadiumNamesResult() {
        return stadiumNamesResult;
    }

    /**
     * Définit la valeur de la propriété stadiumNamesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setStadiumNamesResult(ArrayOfString value) {
        this.stadiumNamesResult = value;
    }

}
