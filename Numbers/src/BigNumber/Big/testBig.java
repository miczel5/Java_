package BigNumber.Big;
/**
 * 
 * @author michal
 * Test class to make new obj Big numbers to check methods
 */
 class testBig {

    public static void main(String[] args) {
            BigNumber obj = new BigNumber(13);
            boolean z =obj.divide(5);
            System.out.println(z);
            boolean y = obj.check();
            System.out.println(y);

    }
    
}
 class BigNumber {
    int liczba;
    /**
     * Constructor 
     */
    BigNumber(){
        this.liczba= 0;
    }
    BigNumber(int liczba){
        this.liczba = liczba;
    }
    /**
     * Divide method
     * @param x to check that number is divided by it
     * @return boolean value true or false
     */
    boolean divide(int x){
        if (this.liczba%x==0){
            return true;}
        else{return false;}
    }
    /**
     * 
     * @return true or false if number is prime 
     */
    boolean check(){
        if(this.liczba<2){
            return false;
        }
        for(int i=2;i*i<=this.liczba;i++){
            if(this.liczba%i==0){return false;}
        }
        return true;

}
}
    
   
