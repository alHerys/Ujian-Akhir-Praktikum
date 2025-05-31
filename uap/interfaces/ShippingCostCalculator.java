package uap.interfaces;

/**
 * Interface untuk menghitung biaya pengiriman.
 */
public interface ShippingCostCalculator {
    /**
     * Harga pengiriman per kilogram.
     */
    int PRICE_PER_KG = 2000;

    /**
     * Menghitung dan mengembalikan total biaya pengiriman.
     * @return Biaya pengiriman sebagai double dalam Rupiah.
     */
    double calculateCost();
}