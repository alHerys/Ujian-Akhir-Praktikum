package uap.interfaces;

/**
 * Interface untuk konversi satuan massa.
 * Digunakan untuk mengubah gram ke kilogram.
 */
public interface MassConverter {
    /**
     * Denominator untuk konversi gram ke kilogram.
     */
    int DENOMINATOR = 1000;

    /**
     * Mengonversi massa dari gram ke kilogram.
     * @return Massa dalam kilogram sebagai double.
     */
    double gramToKilogram();
}