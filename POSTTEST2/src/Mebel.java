public class Mebel {
    private static int counter = 1;
    private int id;
    protected String nama;
    private String material;
    private int harga;
    private int stok;
    

    public Mebel(String nama, String material, int harga, int stok) {
        this.id = counter++;
        this.nama = nama;
        this.material = material;
        this.harga = harga;
        this.stok = stok;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nama: " + nama +  ", Material: " + material + " , Harga: Rp" + harga + ", Stok: " + stok ;
    }
}
