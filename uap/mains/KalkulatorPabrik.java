package uap.mains;

// Ini pemanis aja kak, hehehe
/* Alvianto Hery Sarborn - 245150700111022
##     ## ######## ########  ##    ##
##     ## ##       ##     ##  ##  ##
##     ## ##       ##     ##   ####
######### ######   ########     ##
##     ## ##       ##   ##      ##
##     ## ##       ##    ##     ##
##     ## ######## ##     ##    ##
 */

import uap.bases.Shape;
import uap.interfaces.MassConverter;
import uap.interfaces.ShippingCostCalculator;
import uap.models.Sphere;
import uap.models.Torus;

import java.util.Scanner;

/**
 * Kelas utama untuk aplikasi Kalkulator Pabrik Cetakan Donat.
 */
public class KalkulatorPabrik {

    /**
     * Metode utama aplikasi.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Pewarna biar cantik (nambah aja kak hehehe)
        String green = "\u001B[32m";
        String white = "\u001B[0m";
        String yellow = "\u001B[33m";
        String blue = "\u001B[94m";

        // Menampilkan header aplikasi
        System.out.printf("""
                %s=============================================%s
                Kalkulator Pabrik Cetakan Donat Rumahan
                ALVIANTO HERY SARBORN
                245150700111022
                %s=============================================%s
                Donat dengan lubang
                %s=============================================%s
                """, green, yellow, green, blue, green, white);

        // Input untuk Torus
        System.out.print("Isikan Radius   : ");
        double Radius = scan.nextDouble();
        System.out.print("Isikan radius   : ");
        double radius = scan.nextDouble();

        System.out.printf("%s=============================================%s\n", green, white);

        // Membuat objek Torus
        Shape torus = new Torus(Radius, radius);
        MassConverter torusMassConverter = new Torus(Radius, radius); // Digunakan untuk gramToKilogram()
        ShippingCostCalculator costTorus = new Torus(Radius, radius); // Digunakan untuk calculateCost()

        // Menampilkan informasi dan hasil kalkulasi Torus
        torus.printInfo(); // Mencetak Volume, Luas Permukaan, Massa
        System.out.printf("""
                Massa dalam kg  : %.2f
                Biaya kirim     : Rp %.2f
                """, torusMassConverter.gramToKilogram(), costTorus.calculateCost());

        // Header untuk Sphere
        System.out.printf("""
                %s=============================================%s
                Donat tanpa lubang
                %s=============================================%s
                """, green, blue, green, white);

        // Input untuk Sphere
        System.out.print("Isikan radius   : ");
        double sphereRadius = scan.nextDouble();

        System.out.printf("%s=============================================%s\n", green, white);

        // Membuat objek Sphere
        Shape sphere = new Sphere(sphereRadius);
        MassConverter sphereMassConverter = new Sphere(sphereRadius); // Digunakan untuk gramToKilogram()
        ShippingCostCalculator costSphere = new Sphere(sphereRadius); // Digunakan untuk calculateCost()

        // Menampilkan informasi dan hasil kalkulasi Sphere
        sphere.printInfo(); // Mencetak Volume, Luas Permukaan, Massa
        System.out.printf("""
                Massa dalam kg  : %.2f
                Biaya kirim     : Rp %.2f
                """, sphereMassConverter.gramToKilogram(), costSphere.calculateCost());

        System.out.printf("%s=============================================%s\n", green, white);

        scan.close(); // Menutup scanner setelah selesai digunakan
    }
}