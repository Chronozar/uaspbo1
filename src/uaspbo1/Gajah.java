package uaspbo1;

public class Gajah extends Hewan {
    public Gajah(String nama, int usia) {
        super(nama, usia, "Rumput");
    }

    @Override
    public void suara() {
        System.out.println(getNama() + " bersuara: PRUUUUUU!");
    }
}
