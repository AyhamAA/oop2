
package OOP2PKJ;
public class Bird  extends Animal{
      String name ; 
      String color ; 
    public  void Fly()
    {
        System.out.println("Bird Flying");
    }

    public Bird(String name, String color) {
        this.name = name;
        this.color = color;
    }
    
    
}
