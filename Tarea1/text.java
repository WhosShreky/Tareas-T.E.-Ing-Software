import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class text {   
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.println("Ingrese el número de nombres:");
        int Names = Scan.nextInt();

        Scan.nextLine(); // Consume the newline character left by nextInt

        String[] Names_array = new String[Names];
        for (int i = 0; i<Names; i++) {
            String Name = Scan.nextLine();
            Names_array[i] = Name;
        }
        
        try(PrintWriter writer = new PrintWriter("test.txt")){
            for (String name : Names_array) {
                writer.println(name);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: No se pudo crear el archivo.");
            e.printStackTrace();
        }
    }
}
