
package StudentPKJ;
public class Test {
    public static void main(String[] args) {
        Student std = new Student() ;
        std.setId(10);
        std.setGpa(2.4);
        std.setName("Ayham");
        std.setEmail("ayham@gmail.com");
        //------------------------------------------
        Student std2 = new Student(20, "Ayham",3.5, "ayham@gmail.com");
        //-----------------------------------------
        Student std3 =new Student (); 
        std3.withId(23).withName("Ayham").withGpa(2.8) ; 
        std3.withEmail("ayham@outlook.com");
    }
    
}
