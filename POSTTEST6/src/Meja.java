public class Meja extends Mebel {
    private final int jumlahKaki;

    public Meja(String nama, String material, int harga, int stok, int jumlahKaki) {
        super(nama, material, harga, stok);
        this.jumlahKaki = jumlahKaki;
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    @Override
    public void hitungJumlah() {
  
    }

    
    @Override
    public final void setStok() {
        this.stok = 0;
    }

    @Override
    public final void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public String toString() {
        return super.toString() + ", Jumlah Kaki: " + jumlahKaki;
    }
}
