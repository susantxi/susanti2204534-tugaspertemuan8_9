package java_inheritance_polymorphism.no1;
import java.util.Scanner;
/**
 *
 * @author susanti
 */
public class UjiSegitiga {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan sisi1: ");
        double side1 = input.nextDouble();
        System.out.print("Masukkan sisi2: ");
        double side2 = input.nextDouble();
        System.out.print("Masukkan sisi3: ");
        double side3 = input.nextDouble();
        System.out.print("Masukkan warna: ");
        String color = input.next();
        System.out.print("Apakah segitiga terisi (true/false): ");
        boolean filled = input.nextBoolean();
        System.out.println();
        
        Segitiga segitiga = new Segitiga(side1, side2, side3);
        segitiga.setColor(color);
        segitiga.setFilled(filled);

        System.out.println("Luas        = " + segitiga.getArea());
        System.out.println("Keliling    = " + segitiga.getPerimeter());
        System.out.println("Warna       = " + segitiga.getColor());
        System.out.println("Terisi      = " + segitiga.isFilled());
        
        input.close();
    }
}
