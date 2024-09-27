// 12S24052 - Indah Triyuni Siahaan
// 12S24007 - Dasmauli Sormin

import java.util.*;
import java.lang.Math;

public class T02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, penerbit, formatBukuElektronik, kategori;
        int tahunTerbit, stok;
        double hargaPembelian, minimumMargin, rating;

        iSBN = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        penerbit = input.nextLine();
        formatBukuElektronik = input.nextLine();
        tahunTerbit = Integer.parseInt(input.nextLine());
        stok = Integer.parseInt(input.nextLine());
        hargaPembelian = Double.parseDouble(input.nextLine());
        minimumMargin = Double.parseDouble(input.nextLine());
        rating = Double.parseDouble(input.nextLine());
        if (rating >= 4.7) {
            kategori = "Best Pick";
        } else {
            if (rating >= 4.5 && rating < 4.7) {
                kategori = "Must Read";
            } else {
                if (rating >= 4.0 && rating < 4.5) {
                    kategori = "Recommended";
                } else {
                    if (rating >= 3.0 && rating < 4.0) {
                        kategori = "Average";
                    } else {
                        kategori = "Low";
                    }
                }
            }
        }
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + formatBukuElektronik + "|" + hargaPembelian + "|" + minimumMargin + "|" + stok + "|" + toFixed(rating,1) + "|" + kategori);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
