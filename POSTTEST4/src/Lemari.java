public class Lemari extends Mebel {
    private int jumlahPintu;

    public Lemari(String nama, String material, int harga, int stok, int jumlahPintu) {
        super(nama, material, harga, stok);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public String toString() {
        return super.toString() + ", Jumlah Pintu: " + jumlahPintu;
    }
}