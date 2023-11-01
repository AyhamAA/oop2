package CirPKJ;

public class Test {

    public static void main(String[] args) {
      Circle c = new Circle() ;
      c.setRad(2);
        System.out.println(c.getArea());
        System.out.println(c.getround());
     Circle c2 = new Circle(3) ; 
        System.out.println(c2.getArea());
        System.out.println(c2.getround());
     
    }
}
