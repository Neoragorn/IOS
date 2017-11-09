
package ios.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour virementInternAcc complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="virementInternAcc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="client" type="{http://bankInterface/}client" minOccurs="0"/&gt;
 *         &lt;element name="typecompte1" type="{http://bankInterface/}accountType" minOccurs="0"/&gt;
 *         &lt;element name="typecompte2" type="{http://bankInterface/}accountType" minOccurs="0"/&gt;
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
@XmlType(name = "virementInternAcc", propOrder = {
    "client",
    "typecompte1",
    "typecompte2",
    "amount"
})
public class VirementInternAcc {

    protected Client client;
    @XmlSchemaType(name = "string")
    protected AccountType typecompte1;
    @XmlSchemaType(name = "string")
    protected AccountType typecompte2;
    protected int amount;

    /**
     * Obtient la valeur de la propriété client.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getClient() {
        return client;
    }

    /**
     * Définit la valeur de la propriété client.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setClient(Client value) {
        this.client = value;
    }

    /**
     * Obtient la valeur de la propriété typecompte1.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getTypecompte1() {
        return typecompte1;
    }

    /**
     * Définit la valeur de la propriété typecompte1.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setTypecompte1(AccountType value) {
        this.typecompte1 = value;
    }

    /**
     * Obtient la valeur de la propriété typecompte2.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getTypecompte2() {
        return typecompte2;
    }

    /**
     * Définit la valeur de la propriété typecompte2.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setTypecompte2(AccountType value) {
        this.typecompte2 = value;
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
