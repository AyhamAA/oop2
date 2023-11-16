
package OOP2PKJ;

public class Test {
    public static void main(String[] args) {
        FactoryTest f = new FactoryTest(); 
        A a1= f.createInstance(1) ;
        A a2 =f.createInstance(2) ;
        a1.m1();
        a1.m1();
    }
    
}
