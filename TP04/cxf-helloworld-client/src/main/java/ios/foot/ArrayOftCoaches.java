
package ios.foot;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOftCoaches complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOftCoaches"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tCoaches" type="{http://footballpool.dataaccess.eu}tCoaches" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOftCoaches", propOrder = {
    "tCoaches"
})
public class ArrayOftCoaches {

    @XmlElement(nillable = true)
    protected List<TCoaches> tCoaches;

    /**
     * Gets the value of the tCoaches property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tCoaches property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTCoaches().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCoaches }
     * 
     * 
     */
    public List<TCoaches> getTCoaches() {
        if (tCoaches == null) {
            tCoaches = new ArrayList<TCoaches>();
        }
        return this.tCoaches;
    }

}
