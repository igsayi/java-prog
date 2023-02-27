import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ser {

   public static void main(String[] args) {
      Emp e = new Emp();
      e.name = "Reyan Ali";
      e.address = "Phokka Kuan, Ambehta Peer";
      e.number = 101;

      try {
         FileOutputStream fileOut = new FileOutputStream("tmp/employee.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in tmp/employee.ser");
      } catch (IOException i) {
         i.printStackTrace();
      }
   }
}
