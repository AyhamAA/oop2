
package OOP2PKJ;
public class Fish extends Animal{
    String  name ; 
    String ScaleColor ; 
    public  void Swim()
    {
        System.out.println("Fish Swimming");
    }

    public Fish(String name, String ScaleColor) {
        this.name = name;
        this.ScaleColor = ScaleColor;
    }
    
    
}
