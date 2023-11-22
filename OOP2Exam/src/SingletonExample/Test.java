
package SingletonExample;

public class Test {
    public static void main(String[] args) {
         Singleton singleton = Singleton.getInstance();

      
        singleton.Hello();
        for (int i = 0 ; i<20 ;i++){
              Singleton test = Singleton.getInstance() ; 
            test.Hello(); 
        }
      
            
  
    
}}
