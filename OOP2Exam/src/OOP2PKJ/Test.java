
package OOP2PKJ;

public class Test {
    
    public static void main(String[] args) {
        Cat cat1 = new Cat("y1" ,"Orange");
        Dog dog1 = new Dog("h1", "Black"); 
        Eagle eagle1 = new Eagle ("t1", "White and Black") ;
        Penguin penguin1 = new Penguin("j1" ,"Black and White") ;
        Shark shark1 =new Shark("k1", "Silver") ; 
        GoldFish gf = new GoldFish("n1" , "Gold"); 
        Polymorphism.performActivity(cat1);
        Polymorphism.performActivity(dog1);
        Polymorphism.performActivity(eagle1);
        Polymorphism.performActivity(penguin1);
        Polymorphism.performActivity(shark1);
        Polymorphism.performActivity(gf);
        
    }
    
}
