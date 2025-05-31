package uap.interfaces;

/**
 * Interface untuk objek tiga dimensi.
 * Menyediakan metode untuk menghitung luas permukaan dan volume.
 */
public interface ThreeDimensional {
    /**
     * Menghitung dan mengembalikan luas permukaan objek.
     * @return Luas permukaan sebagai double.
     */
    double getSurfaceArea();

    /**
     * Menghitung dan mengembalikan volume objek.
     * @return Volume sebagai double.
     */
    double getVolume();
}