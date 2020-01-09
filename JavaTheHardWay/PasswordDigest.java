import java.security.MessageDigest;
import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;
/*this last library has been deprecated and does not work,
  solution goes above me right now but from my research I see it is
  possible to include as a dependency in the framework or POM as XML file.
  from https://www.jesperdj.com/2018/09/30/jaxb-on-java-9-10-11-and-beyond/
  "In Java SE 11, the module java.se.ee has been removed.
  To use JAX-WS and JAXB you need to add them to your project
  as separate libraries. */


public class PasswordDigest {
    public static void main(String[] args) throws Exception {
          Scanner keyboard = new Scanner(System.in);
          String pw, hash;

          MessageDigest digest = MessageDigest.getInstance("SHA-256");

          System.out.print("Password: ");
          pw = keyboard.nextLine();

          digest.update(pw.getBytes("UTF-8"));
          hash = DatatypeConverter.printHexBinary(digest.digest());

          System.out.println(hash);
    }
}
