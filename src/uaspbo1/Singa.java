package uaspbo1;

public class Singa extends Hewan {
    public Singa(String nama, int usia) {
        super(nama, usia, "Daging");
    }

    @Override
    public void suara() {
        System.out.println(getNama() + " mengaum: ROAAARRR!");
    }
}
