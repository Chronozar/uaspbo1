package uaspbo1;

import java.util.ArrayList;

public class Kandang {
    private String namaKandang;
    private ArrayList<Hewan> daftarHewan;

    public Kandang(String namaKandang) {
        this.namaKandang = namaKandang;
        this.daftarHewan = new ArrayList<>();
    }

    public void tambahHewan(Hewan hewan) {
        daftarHewan.add(hewan);
    }

    public void tampilkanHewan() {
        for (Hewan h : daftarHewan) {
            System.out.println(h.getNama() + " - " + h.getClass().getSimpleName() + " - " + h.getKesehatan());
        }
    }
}
