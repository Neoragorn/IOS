
package ios.foot;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOftPlayerNames complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOftPlayerNames"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tPlayerNames" type="{http://footballpool.dataaccess.eu}tPlayerNames" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOftPlayerNames", propOrder = {
    "tPlayerNames"
})
public class ArrayOftPlayerNames {

    @XmlElement(nillable = true)
    protected List<TPlayerNames> tPlayerNames;

    /**
     * Gets the value of the tPlayerNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tPlayerNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTPlayerNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TPlayerNames }
     * 
     * 
     */
    public List<TPlayerNames> getTPlayerNames() {
        if (tPlayerNames == null) {
            tPlayerNames = new ArrayList<TPlayerNames>();
        }
        return this.tPlayerNames;
    }

}
