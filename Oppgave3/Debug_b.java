public class Debug_b {
     public static void main(String args[]) {
      
    int x = 10;
    int y = 25;
    
    int z = x + y;

    System.out.println("Sum of x + y = " + z);
    
    /*
    
Debug_b.java:10: error: cannot find symbol
    System.outprintln("Sum of x + y = " + z);
          ^
  symbol:   method outprintln(String)
  location: class System
1 error


*/


/*Problem:
The program gives the error cannot find symbol because System.outprintln is written without the dot (.) between out and println. The compiler thinks you are calling a method named outprintln, which does not exist.

Solution:
Add the missing dot so it becomes:

System.out.println("Sum of x + y = " + z);


Problem:
Programmet gir feilen cannot find symbol fordi System.outprintln er skrevet uten punktum (.) mellom out og println. Kompilatoren tror du prøver å kalle en metode som heter outprintln, men den finnes ikke.

Løsning:
Legg til det manglende punktumet slik at det blir:

System.out.println("Sum of x + y = " + z);
*/
     }
    
}
