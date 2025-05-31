package uap.interfaces;

/**
 * Interface untuk objek yang massanya dapat dihitung.
 * Menyediakan konstanta untuk densitas dan ketebalan bahan.
 */
public interface MassCalculable {
    /**
     * Densitas bahan (stainless steel 304).
     */
    int DENSITY = 8;
    /**
     * Ketebalan bahan cetakan.
     */
    double THICKNESS = 0.5;

    /**
     * Menghitung dan mengembalikan massa objek.
     * @return Massa objek dalam gram sebagai double.
     */
    double getMass();
}