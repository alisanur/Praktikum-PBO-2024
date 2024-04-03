public class Meja extends Mebel {
    private int jumlahKaki;

    public Meja(String nama, String material, int harga, int stok, int jumlahKaki) {
        super(nama, material, harga, stok);
        this.jumlahKaki = jumlahKaki;
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    // Fungsi overloading setStok
    public void setStok() {
        this.stok = 0;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public String toString() {
        return super.toString() + ", Jumlah Kaki: " + jumlahKaki;
    }
}
