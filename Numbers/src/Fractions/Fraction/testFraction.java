package Fractions.Fraction;
/**
 *
 * @author michal
 */
public class testFraction {
/**
 * 
 * @param args creating test object to check methods in Fraction class 
 */
    public static void main(String[] args) {
        Fraction obj = new Fraction(3,4);
        Fraction obj1 = new Fraction(1,2);
        Fraction obj3 = obj.add(obj1);
        System.out.println("Fraction 1 = "+obj);
        System.out.println("Fraction 2 = " +obj1);
        System.out.println("Fraction 1 add Fraction 2 = "+obj3);
        Fraction obj4 = obj.sub(obj1);
        System.out.println("Fraction 1 sub Fraction 2 = "+obj4);
        Fraction obj5 = obj.deflect();
        System.out.println("Fraction 1 after deflect = "+obj5);
        Fraction obj6 = obj.multiply(obj1);
        System.out.println("Fraction 1 multiply fraction 2 = "+obj6);
        
        
    }
    
}
/**
 * 
 * @author michal parciak
 */
class Fraction {
    int numerator;
    int denumerator;

    Fraction(){
        this.numerator = 0;
        this.denumerator=0;
    }
    /**
     * 
     * @param numerator set numerator as int value
     * @param denumerator set denumerator as int value
     */
    Fraction(int numerator,int denumerator){
        this.numerator=numerator;
        this.denumerator = denumerator;
    }
    /**
     * 
     * @return value of development numerator by denumerator 
     */
    public double devOfDecimal(){
        return (float)numerator/denumerator;}
    /**
     * 
     * @param obj1 to add 1 Fraction to another
     * @return value of Fraction in new object
     */
    public Fraction add(Fraction obj1){
        Fraction tmp = new Fraction((this.numerator*obj1.denumerator)+(this.denumerator*obj1.numerator)
                    ,(this.denumerator*obj1.denumerator));
        return tmp;
    }
    /**
     * 
     * @return string method to return value of N/D 
     */
    public String toString()                                                   
   {                                                                          
      return "[numerator: "+numerator+", denumerator: "+denumerator+"]";
   }
    /**
     * 
     * @param obj1 to sub with another fraction object
     * @return result of sub in new object Fraction
     */
    public Fraction sub(Fraction obj1){
        Fraction tmp = new Fraction((this.numerator*obj1.denumerator)-(this.denumerator*obj1.numerator)
                    ,(this.denumerator*obj1.denumerator));
        return tmp;
    }
    /**
     * 
     * @return deflect Fraction 
     */
    public Fraction deflect(){
        Fraction tmp = new Fraction(denumerator,numerator);
        return tmp; 
    }
    public Fraction multiply(Fraction obj1){
        Fraction tmp = new Fraction((this.numerator*obj1.numerator),(this.denumerator*obj1.denumerator));
        return tmp;
        
    }
 }
   