public class Kursi extends Mebel {
    private String jenisKursi;

    public Kursi(String nama, String material, int harga, int stok, String jenisKursi) {
        super(nama, material, harga, stok);
        this.jenisKursi = jenisKursi;
    }

    public String getJenisKursi() {
        return jenisKursi;
    }

    public void setJenisKursi(String jenisKursi) {
        this.jenisKursi = jenisKursi;
    }

    @Override
    public String toString() {
        return super.toString() + ", Jenis Kursi: " + jenisKursi;
    }
}