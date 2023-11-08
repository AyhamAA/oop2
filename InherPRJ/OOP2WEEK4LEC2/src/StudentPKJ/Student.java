
package StudentPKJ;
public class Student {
    private int id ; 
    private String name ; 
    private double gpa ; 
    private String email ;

    public Student() {
    }

    public Student(int id, String name, double gpa, String email) {
        setId(id); 
        setName(name);
        setGpa(gpa); 
        setEmail(email);
    }
    public Student withId()
    {
        setId(id) ;
      return this ;  
    }
      public Student withName()
    {
        setName(name);
        return this ; 
        
    }
        public Student withGpa()
    {
        setGpa(gpa);
        return this; 
    }
          public Student withEmail()
    {
       setEmail(email);
       return this ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
