public class Lemari extends Mebel {
    private final int jumlahPintu;

    public Lemari(String nama, String material, int harga, int stok, int jumlahPintu) {
        super(nama, material, harga, stok);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    @Override
    public void hitungJumlah() {
      
    }

    @Override
    public String toString() {
        return super.toString() + ", Jumlah Pintu: " + jumlahPintu;
    }
}
