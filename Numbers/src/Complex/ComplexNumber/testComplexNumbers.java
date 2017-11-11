
package Complex.ComplexNumber;

 class TestComplexNumbers {

    public static void main(String[] args) {
        ComplexNumbers liczba = new ComplexNumbers(0,-5);
        System.out.println("ComplexNumber 1 value ="+liczba);
        ComplexNumbers liczba2 = new ComplexNumbers(1,0);
        ComplexNumbers liczba1 = liczba2.add(liczba);
        System.out.println("ComplexNB 1 + 2 ="+liczba1);
        ComplexNumbers liczba3 = liczba2.sub(liczba);
        System.out.println("ComplexNB 1- 2 = "+liczba3);
    }
    
}

 class ComplexNumbers {
    double real_part;
    double imaginary_part;
    
    ComplexNumbers(){
        this.real_part=0.0;
        this.imaginary_part=0.0;
    }
    
    ComplexNumbers(double real_part,double imaginary_part){
        this.real_part =real_part;
        this.imaginary_part =imaginary_part;
    }
    
    public String toString(){
        if(imaginary_part==0){
            return "ComplexNumber has value = "+real_part + "";}
        if(real_part==0){
            return "ComplexNumber has value ="+imaginary_part +" i";}
        if (imaginary_part<0){
            return "ComplexNumber has value ="+real_part + " - "+(-imaginary_part)+ " i ";}
        return real_part + " + "+ imaginary_part + " i ";
        }
    public ComplexNumbers add(ComplexNumbers liczba){
        ComplexNumbers tmp = new ComplexNumbers(real_part+liczba.real_part,imaginary_part+liczba.imaginary_part);
        return tmp;
    }
    
    public ComplexNumbers sub(ComplexNumbers liczba){
        ComplexNumbers tmp = new ComplexNumbers(real_part-liczba.real_part,imaginary_part-liczba.imaginary_part);
        return tmp;
    }
    
    
}
