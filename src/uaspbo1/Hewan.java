package uaspbo1;

public abstract class Hewan {
    private String nama;
    private int usia;
    private String jenisMakanan;
    private String kesehatan;

    public Hewan(String nama, int usia, String jenisMakanan) {
        this.nama = nama;
        this.usia = usia;
        this.jenisMakanan = jenisMakanan;
        this.kesehatan = "Sehat";
    }

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }

    public String getJenisMakanan() {
        return jenisMakanan;
    }

    public String getKesehatan() {
        return kesehatan;
    }

    public void setKesehatan(String kesehatan) {
        this.kesehatan = kesehatan;
    }

    public abstract void suara();
}
