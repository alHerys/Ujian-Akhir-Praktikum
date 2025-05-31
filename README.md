# Kalkulator Pabrik Cetakan Donat Rumahan

Program Java sederhana yang berfungsi sebagai kalkulator untuk pabrik cetakan donat rumahan. Program ini dapat menghitung berbagai properti geometris dan fisik untuk dua jenis bentuk cetakan: Torus (donat dengan lubang) dan Sphere (donat tanpa lubang).

## Fitur Utama

* Menghitung volume cetakan.
* Menghitung luas permukaan cetakan.
* Menghitung massa cetakan (dalam gram), dengan asumsi bahan stainless steel 304 (densitas 8 g/cm³) dan ketebalan 0.5 cm.
* Mengonversi massa dari gram ke kilogram.
* Menghitung estimasi biaya pengiriman berdasarkan massa (dengan pembulatan ke atas per kilogram).

## Bentuk yang Didukung

1.  **Torus**: Untuk cetakan donat dengan lubang di tengah.
    * Input: Radius mayor dan radius minor.
2.  **Sphere**: Untuk cetakan donat padat tanpa lubang.
    * Input: Radius.

## Output Program

Untuk setiap bentuk, program akan menampilkan:
* Volume
* Luas Permukaan
* Massa (dalam gram)
* Massa dalam kilogram
* Biaya Kirim (dalam Rupiah)

## Struktur Proyek

Proyek ini diorganisir dalam beberapa package:
* `uap.mains`: Berisi kelas utama aplikasi (`KalkulatorPabrik.java`).
* `uap.models`: Berisi kelas-kelas model untuk bentuk geometris (`Torus.java`, `Sphere.java`).
* `uap.bases`: Berisi kelas dasar abstrak (`Shape.java`).
* `uap.interfaces`: Berisi berbagai interface yang mendefinisikan kontrak untuk kalkulasi dan fungsionalitas (`ThreeDimensional.java`, `PiRequired.java`, `MassCalculable.java`, `MassConverter.java`, `ShippingCostCalculator.java`).

* **Nama**: ALVIANTO HERY SARBORN
* **NIM**: 245150700111022
