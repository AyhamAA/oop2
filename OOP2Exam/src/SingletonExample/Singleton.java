
package SingletonExample;

public class Singleton {
    //---->>the singleton design pattern he forced the compiler to make one object just
      private static Singleton instance ;

     private Singleton() {
            System.out.println("new object has been created");
    }
      public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton()  ;
        }
        return instance ; 
    }
      public void Hello(){
          System.out.println("Hello from Singleton ");
      }
      
    
}
