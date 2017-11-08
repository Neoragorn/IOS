
package ios.foot;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOftCountrySelectedTopScorer complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOftCountrySelectedTopScorer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tCountrySelectedTopScorer" type="{http://footballpool.dataaccess.eu}tCountrySelectedTopScorer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOftCountrySelectedTopScorer", propOrder = {
    "tCountrySelectedTopScorer"
})
public class ArrayOftCountrySelectedTopScorer {

    @XmlElement(nillable = true)
    protected List<TCountrySelectedTopScorer> tCountrySelectedTopScorer;

    /**
     * Gets the value of the tCountrySelectedTopScorer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tCountrySelectedTopScorer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTCountrySelectedTopScorer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCountrySelectedTopScorer }
     * 
     * 
     */
    public List<TCountrySelectedTopScorer> getTCountrySelectedTopScorer() {
        if (tCountrySelectedTopScorer == null) {
            tCountrySelectedTopScorer = new ArrayList<TCountrySelectedTopScorer>();
        }
        return this.tCountrySelectedTopScorer;
    }

}
