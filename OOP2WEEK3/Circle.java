
package CirPKJ;
public class Circle {
    public static final double PI=3.14 ; 
    private int rad ; 

    public Circle() {
    }

    public Circle(int rad) {
        this.rad = rad;
    }
    
    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }
    public double getArea(){
        double Area=PI*rad*rad ; 
        return Area ;
    }
   public double getround(){
       double round=PI*2*rad ; 
       return round ; 
   } 
    
}
