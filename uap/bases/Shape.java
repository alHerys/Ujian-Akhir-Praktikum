package uap.bases;

/**
 * Kelas abstrak dasar untuk semua bentuk geometris.
 * Menyimpan nama bentuk dan metode abstrak untuk mencetak informasi.
 */
public abstract class Shape {
    /**
     * Nama dari bentuk.
     */
    private String name;

    /**
     * Konstruktor default.
     */
    public Shape() {

    }


    /**
     * Mengatur nama bentuk.
     * @param inputName Nama baru untuk bentuk.
     */
    public void setName(String inputName) {
        this.name = inputName;
    }

    /**
     * Mengambil nama bentuk.
     * @return Nama bentuk sebagai String.
     */
    public String getName() {
        return name;
    }

    /**
     * Metode abstrak untuk mencetak informasi detail mengenai bentuk.
     * Informasi yang dicetak meliputi volume, luas permukaan, dan massa.
     */
    public abstract void printInfo();
}