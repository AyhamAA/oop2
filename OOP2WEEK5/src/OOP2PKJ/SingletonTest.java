
package OOP2PKJ;
public class SingletonTest { 
    private static SingletonTest instance ; 

    private SingletonTest() {
        System.out.println("new object has been created");
    }
    public static SingletonTest getInstance(){
        if(instance==null){
            instance = new SingletonTest()  ;
        }
        return instance ; 
    }
    public void Hello()
    {
        System.out.println("Hello from Singleton");   
    }
    
    
}
