package uap.models;

import uap.bases.Shape;
import uap.interfaces.*;

/**
 * Kelas Torus merepresentasikan cetakan donat berbentuk torus (dengan lubang).
 * Menghitung volume, luas permukaan, massa, konversi massa, dan biaya kirim.
 */
public class Torus extends Shape implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator {

    /**
     * Radius mayor torus (jarak dari pusat lubang ke tengah tabung torus).
     */
    private double majorRadius;

    /**
     * Radius minor torus (radius dari tabung itu sendiri).
     */
    private double minorRadius;

    /**
     * Konstruktor default untuk Torus.
     */
    public Torus() {
    }

    /**
     * Konstruktor Torus dengan parameter radius mayor dan minor.
     * @param majorRadius Radius mayor.
     * @param minorRadius Radius minor.
     */
    public Torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    /**
     * Menghitung volume Torus.
     * Rumus: 2 * PI^2 * majorRadius * minorRadius^2.
     * Memakai 4.0 agar perhitungan double
     * @return Volume Torus.
     */
    @Override
    public double getVolume() {
        return 2 * PI * PI * majorRadius * minorRadius * minorRadius;
    }

    /**
     * Menghitung luas permukaan Torus.
     * Rumus: 4 * PI^2 * majorRadius * minorRadius.
     * @return Luas permukaan Torus.
     */
    @Override
    public double getSurfaceArea() {
        return 4 * PI * PI * majorRadius * minorRadius;
    }

    /**
     * Menghitung massa Torus berdasarkan densitas, luas permukaan, dan ketebalan.
     * Massa = Densitas * Luas Permukaan * Ketebalan.
     * @return Massa Torus dalam gram.
     */
    @Override
    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    /**
     * Mencetak informasi Torus: Volume, Luas Permukaan, dan Massa.
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
     * Mengonversi massa Torus dari gram ke kilogram.
     * @return Massa Torus dalam kilogram.
     */
    @Override
    public double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }

    /**
     * Menghitung biaya pengiriman untuk Torus.
     * Biaya dihitung dengan membulatkan massa (kg) ke atas, lalu dikalikan harga per kg.
     * @return Biaya pengiriman dalam Rupiah.
     */
    @Override
    public double calculateCost() {
        return PRICE_PER_KG * Math.ceil(gramToKilogram());
    }
}