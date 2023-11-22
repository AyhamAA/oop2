
package OOP2PKJ;

public class Polymorphism {
    public static void performActivity(Animal animal){
      if(animal instanceof Bird)
      {
          ((Bird) animal).Fly();
      }
      else if(animal instanceof Fish)
      {
          ((Fish) animal).Swim();
      }
      else if(animal instanceof Mammls)
      {
         ((Mammls) animal).MakeSound();
      }
    }
}
