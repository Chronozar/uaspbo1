package uaspbo1;

public class Petugas {
    private String nama;

    public Petugas(String nama) {
        this.nama = nama;
    }

    public void beriMakan(Hewan hewan, String makanan) {
        if (makanan.equalsIgnoreCase(hewan.getJenisMakanan())) {
            System.out.println("Makanan cocok. " + hewan.getNama() + " makan dengan lahap.");
        } else {
            System.out.println("Makanan tidak cocok! " + hewan.getNama() + " menolak makan.");
            hewan.setKesehatan("Sakit");
        }
    }

    public void periksaKesehatan(Hewan hewan) {
        if (hewan.getKesehatan().equalsIgnoreCase("Sakit")) {
            System.out.println(hewan.getNama() + " sedang sakit. Segera beri perawatan!");
        } else {
            System.out.println(hewan.getNama() + " dalam kondisi sehat.");
        }
    }
}
