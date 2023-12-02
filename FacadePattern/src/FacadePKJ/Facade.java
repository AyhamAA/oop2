package FacadePKJ;


public class Facade {
    private SubSystem1 subsystem1 ; 
    private SubSystem2 subsystem2 ; 

    public Facade() {
        this.subsystem1= new SubSystem1(); 
        this.subsystem2= new SubSystem2(); 
    }
    public void opreation(){
        System.out.println("Facade is coordinating the subsystems");
        subsystem1.opreation1();
        subsystem2.opreation2();
    }
 
}
