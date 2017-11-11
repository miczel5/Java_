
package Vectors.Vector;
/**
 * Test class to create object Vectors
 * @author michal
 */
 class TestVector {
    public static void main(String[] args) {
       Vector obj = new Vector(3.0,4.0,3.0);
       System.out.println(obj);
       Vector obj1= new Vector(5.0,1.0,2.0);
       Vector tmp =obj1.add(obj);
       System.out.println("Value of added Vector = "+tmp);
       Vector tmp1 = obj1.sub(obj);
       System.out.println(tmp1);                          
    }   
}

 class Vector {

   double x1;
   double x2;
   double x3;
   Vector(){
       this.x1 = 0.0;
       this.x2 = 0.0;
       this.x3 = 0.0;
   }
   /**
    * 
    * @param x1 to set first param of Vector
    * @param x2 to set second param of Vector
    * @param x3 to set third param of Vector
    */
   Vector(double x1,double x2,double x3){
       this.x1 = x1;
       this.x2 = x2;
       this.x3= x3;
   }
/**
 * 
 * @return String value of Vector object
 */
   public String toString(){
       return "Value of Vector X  "+" x1 ="+x1 + " x2= "+x2 + " x3 ="+ x3;
   }
/**
 * 
 * @param obj to add params with another Vector
 * @return Value of new Vector
 */
   public Vector add(Vector obj){
       Vector tmp = new Vector(this.x1+obj.x1,this.x2+obj.x2,this.x3+obj.x3);
       return tmp;
   }
   /**
    * 
    * @param obj to sub params with another vector
    * @return Value of new Vector
    */
   public Vector sub(Vector obj){
       Vector tmp = new Vector(this.x1 -obj.x1,this.x2 -obj.x2,this.x3-obj.x3);
       return tmp;
   }

    
}

