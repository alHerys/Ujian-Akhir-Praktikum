package uap.models;

import uap.bases.Shape;
import uap.interfaces.*;

/**
 * Kelas Sphere merepresentasikan cetakan donat berbentuk bola (tanpa lubang).
 * Menghitung volume, luas permukaan, massa, konversi massa, dan biaya kirim.
 */
public class Sphere extends Shape implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator {

    /**
     * Radius bola.
     */
    private double radius;

    /**
     * Konstruktor default untuk Sphere.
     */
    public Sphere() {
    }

    /**
     * Konstruktor Sphere dengan parameter radius.
     * @param radius Radius bola.
     */
    public Sphere(double radius) {
        this.radius = radius;
    }

    /**
     * Menghitung volume Sphere.
     * Rumus: (4/3) * PI * radius^3.
     * Memakai 4.0 agar perhitungan double
     * @return Volume Sphere.
     */
    @Override
    public double getVolume() {
        return (4.0/3) * PI * Math.pow(radius, 3);
    }

    /**
     * Menghitung luas permukaan Sphere.
     * Rumus: 4 * PI * radius^2.
     * @return Luas permukaan Sphere.
     */
    @Override
    public double getSurfaceArea() {
        return 4 * PI * radius * radius;
    }

    /**
     * Menghitung massa Sphere berdasarkan densitas, luas permukaan, dan ketebalan.
     * Massa = Densitas * Luas Permukaan * Ketebalan.
     * @return Massa Sphere dalam gram.
     */
    @Override
    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    /**
     * Mencetak informasi Sphere: Volume, Luas Permukaan, dan Massa.
     * Format output menggunakan printf dengan 6 angka desimal untuk nilai double.
     */
    @Override
    public void printInfo() {
        System.out.printf("""
                Volume          : %.3f
                Luas permukaan  : %.3f
                Massa           : %.3f
                """, getVolume(), getSurfaceArea(), getMass());
    }

    /**
     * Mengonversi massa Sphere dari gram ke kilogram.
     * @return Massa Sphere dalam kilogram.
     */
    @Override
    public double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }

    /**
     * Menghitung biaya pengiriman untuk Sphere.
     * Biaya dihitung dengan membulatkan massa (kg) ke atas, lalu dikalikan harga per kg.
     * @return Biaya pengiriman dalam Rupiah.
     */
    @Override
    public double calculateCost() {
        return PRICE_PER_KG * Math.ceil(gramToKilogram());
    }
}