public abstract class Mebel {
        private static int counter = 1;
        protected final int id;
        protected String nama;
        protected String material;
        protected int harga;
        protected int stok;
    
        public Mebel(String nama, String material, int harga, int stok) {
            this.id = counter++;
            this.nama = nama;
            this.material = material;
            this.harga = harga;
            this.stok = stok;
        }

    public Mebel(String nama, String material, int harga) {
        this(nama, material, harga, 0); 
    }

    public void setStok() {
        this.stok = 0;
    }

    public void setStok(int stok) {
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

    public abstract void hitungJumlah();

    @Override
    public String toString() {
        return "ID: " + id + ", Nama: " + nama + ", Material: " + material + " , Harga: Rp" + harga + ", Stok: " + stok;
    }
}
