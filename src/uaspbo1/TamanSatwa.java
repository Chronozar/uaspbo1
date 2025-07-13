package uaspbo1;

import java.util.Scanner;
import java.util.ArrayList;

public class TamanSatwa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Hewan> daftarHewan = new ArrayList<>();
        Petugas petugas = new Petugas("Budi");

        Singa leo = new Singa("Leo", 5);
        Gajah dino = new Gajah("Dino", 10);

        daftarHewan.add(leo);
        daftarHewan.add(dino);

        System.out.println("Daftar hewan di taman:");
        for (Hewan h : daftarHewan) {
            System.out.println(h.getNama() + " - " + h.getClass().getSimpleName());
        }

        System.out.print("\nMasukkan makanan untuk Leo: ");
        String makanan = input.nextLine();

        try {
            petugas.beriMakan(leo, makanan);
            petugas.periksaKesehatan(leo);

            System.out.println("\nTes suara semua hewan:");
            for (Hewan h : daftarHewan) {
                h.suara();
            }
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        input.close();
    }
}
