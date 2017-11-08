
package ios.foot;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOftTopSelectedGoalScorer complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOftTopSelectedGoalScorer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tTopSelectedGoalScorer" type="{http://footballpool.dataaccess.eu}tTopSelectedGoalScorer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOftTopSelectedGoalScorer", propOrder = {
    "tTopSelectedGoalScorer"
})
public class ArrayOftTopSelectedGoalScorer {

    @XmlElement(nillable = true)
    protected List<TTopSelectedGoalScorer> tTopSelectedGoalScorer;

    /**
     * Gets the value of the tTopSelectedGoalScorer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tTopSelectedGoalScorer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTTopSelectedGoalScorer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TTopSelectedGoalScorer }
     * 
     * 
     */
    public List<TTopSelectedGoalScorer> getTTopSelectedGoalScorer() {
        if (tTopSelectedGoalScorer == null) {
            tTopSelectedGoalScorer = new ArrayList<TTopSelectedGoalScorer>();
        }
        return this.tTopSelectedGoalScorer;
    }

}
