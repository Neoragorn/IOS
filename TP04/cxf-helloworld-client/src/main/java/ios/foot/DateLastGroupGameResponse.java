
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
 *         &lt;element name="DateLastGroupGameResult" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
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
    "dateLastGroupGameResult"
})
@XmlRootElement(name = "DateLastGroupGameResponse")
public class DateLastGroupGameResponse {

    @XmlElement(name = "DateLastGroupGameResult", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateLastGroupGameResult;

    /**
     * Obtient la valeur de la propriété dateLastGroupGameResult.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastGroupGameResult() {
        return dateLastGroupGameResult;
    }

    /**
     * Définit la valeur de la propriété dateLastGroupGameResult.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastGroupGameResult(XMLGregorianCalendar value) {
        this.dateLastGroupGameResult = value;
    }

}
