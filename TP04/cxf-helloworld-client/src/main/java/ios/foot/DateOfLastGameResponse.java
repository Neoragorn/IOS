
package ios.foot;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="DateOfLastGameResult" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
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
    "dateOfLastGameResult"
})
@XmlRootElement(name = "DateOfLastGameResponse")
public class DateOfLastGameResponse {

    @XmlElement(name = "DateOfLastGameResult", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfLastGameResult;

    /**
     * Obtient la valeur de la propriété dateOfLastGameResult.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfLastGameResult() {
        return dateOfLastGameResult;
    }

    /**
     * Définit la valeur de la propriété dateOfLastGameResult.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfLastGameResult(XMLGregorianCalendar value) {
        this.dateOfLastGameResult = value;
    }

}
