
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
 *         &lt;element name="AllGoalKeepersResult" type="{http://footballpool.dataaccess.eu}ArrayOfString"/&gt;
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
    "allGoalKeepersResult"
})
@XmlRootElement(name = "AllGoalKeepersResponse")
public class AllGoalKeepersResponse {

    @XmlElement(name = "AllGoalKeepersResult", required = true)
    protected ArrayOfString allGoalKeepersResult;

    /**
     * Obtient la valeur de la propriété allGoalKeepersResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getAllGoalKeepersResult() {
        return allGoalKeepersResult;
    }

    /**
     * Définit la valeur de la propriété allGoalKeepersResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setAllGoalKeepersResult(ArrayOfString value) {
        this.allGoalKeepersResult = value;
    }

}
