public class Kursi extends Mebel {
    private final String jenisKursi;

    public Kursi(String nama, String material, int harga, int stok, String jenisKursi) {
        super(nama, material, harga, stok);
        this.jenisKursi = jenisKursi;
    }

    public String getJenisKursi() {
        return jenisKursi;
    }

    @Override
    public void hitungJumlah() {
    }

    @Override
    public String toString() {
        return super.toString() + ", Jenis Kursi: " + jenisKursi;
    }
}
