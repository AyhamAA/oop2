
package OOP2PKJ;
public class FactoryTest {
 public  A createInstance(int type )
 {
        if (type == 1) {
            return new B();
        } else if (type == 2) {
            return new C();
        }
     else
            return null ;
 }
}

