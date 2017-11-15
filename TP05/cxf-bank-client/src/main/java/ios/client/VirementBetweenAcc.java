
package ios.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour virementBetweenAcc complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="virementBetweenAcc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="client1" type="{http://bankInterface/}client" minOccurs="0"/&gt;
 *         &lt;element name="compte1" type="{http://bankInterface/}account" minOccurs="0"/&gt;
 *         &lt;element name="client2" type="{http://bankInterface/}client" minOccurs="0"/&gt;
 *         &lt;element name="compte2" type="{http://bankInterface/}account" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "virementBetweenAcc", propOrder = {
    "client1",
    "compte1",
    "client2",
    "compte2",
    "amount"
})
public class VirementBetweenAcc {

    protected Client client1;
    protected Account compte1;
    protected Client client2;
    protected Account compte2;
    protected int amount;

    /**
     * Obtient la valeur de la propriété client1.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getClient1() {
        return client1;
    }

    /**
     * Définit la valeur de la propriété client1.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setClient1(Client value) {
        this.client1 = value;
    }

    /**
     * Obtient la valeur de la propriété compte1.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getCompte1() {
        return compte1;
    }

    /**
     * Définit la valeur de la propriété compte1.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setCompte1(Account value) {
        this.compte1 = value;
    }

    /**
     * Obtient la valeur de la propriété client2.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getClient2() {
        return client2;
    }

    /**
     * Définit la valeur de la propriété client2.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setClient2(Client value) {
        this.client2 = value;
    }

    /**
     * Obtient la valeur de la propriété compte2.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getCompte2() {
        return compte2;
    }

    /**
     * Définit la valeur de la propriété compte2.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setCompte2(Account value) {
        this.compte2 = value;
    }

    /**
     * Obtient la valeur de la propriété amount.
     * 
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Définit la valeur de la propriété amount.
     * 
     */
    public void setAmount(int value) {
        this.amount = value;
    }

}
