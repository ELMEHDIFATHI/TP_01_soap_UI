
package mypackage;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour soustractionTwoNumber complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="soustractionTwoNumber">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="number1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="number2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "soustractionTwoNumber", propOrder = {
    "number1",
    "number2"
})
public class SoustractionTwoNumber {

    protected int number1;
    protected int number2;

    /**
     * Obtient la valeur de la propri�t� number1.
     * 
     */
    public int getNumber1() {
        return number1;
    }

    /**
     * D�finit la valeur de la propri�t� number1.
     * 
     */
    public void setNumber1(int value) {
        this.number1 = value;
    }

    /**
     * Obtient la valeur de la propri�t� number2.
     * 
     */
    public int getNumber2() {
        return number2;
    }

    /**
     * D�finit la valeur de la propri�t� number2.
     * 
     */
    public void setNumber2(int value) {
        this.number2 = value;
    }

}
