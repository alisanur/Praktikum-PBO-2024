import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Mebel> daftarMebel = new ArrayList<>();

    public static void main(String[] args) {
        boolean sedangBerjalan = true;

        while (sedangBerjalan) {
            System.out.println("***========= MEBEL KREATIF =========***");
            System.out.println("|| >> [1] Tampilkan Data Furnitur << ||");
            System.out.println("|| >> [2] Tambah Furnitur Baru    << ||");
            System.out.println("|| >> [3] Ubah Data Furnitur      << ||");
            System.out.println("|| >> [4] Hapus Furnitur          << ||");
            System.out.println("|| >> [5] Keluar                  << ||");
            System.out.println("=======================================");
            System.out.print("Pilih Menu (1-5): ");
            try {
                int pilihan = scanner.nextInt();
                scanner.nextLine();

                switch (pilihan) {
                    case 1:
                        tampilkanDataFurnitur();
                        break;
                    case 2:
                        tambahFurniturBaru();
                        break;
                    case 3:
                        ubahDataFurnitur();
                        break;
                    case 4:
                        hapusFurnitur();
                        break;
                    case 5:
                        System.out.println("================");
                        System.out.println("  TERIMA KASIH  ");
                        System.out.println("================");
                        sedangBerjalan = false;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                scanner.nextLine();
            }
        }
    }

    private static void tampilkanDataFurnitur() {
        if (daftarMebel.isEmpty()) {
            System.out.println();
            System.out.println("Data furnitur masih kosong!");
            return;
        }

        System.out.println("***===== Pilih Furnitur =====***");
        System.out.println("|| >>     [1] Meja         << ||");
        System.out.println("|| >>     [2] Kursi        << ||");
        System.out.println("|| >>     [3] Lemari       << ||");
        System.out.println("|| >>     [4] Kasur        << ||");
        System.out.println("|| >>     [5] Kembali      << ||");
        System.out.println("================================");
        System.out.print("Pilih Menu (1-5): ");

        int pilihanKelas = scanner.nextInt();
        scanner.nextLine();

        switch (pilihanKelas) {
            case 1:
                tampilkanDataKelas(Meja.class);
                break;
            case 2:
                tampilkanDataKelas(Kursi.class);
                break;
            case 3:
                tampilkanDataKelas(Lemari.class);
                break;
            case 4:
                tampilkanDataKelas(Kasur.class);
                break;
            case 5:
                System.out.println();
                break;
            default:
                System.out.println("Pilihan kelas tidak valid!");
                break;
        }
    }

    private static void tampilkanDataKelas(Class<? extends Mebel> kelas) {
        System.out.println("**Data " + kelas.getSimpleName() + "**");

        System.out.println("===========================================================");
        System.out.printf("%-5s%-10s%-15s%-10s%-15s%-15s\n", "ID", "Nama", "Material", "Harga", "Stok", "Kelas");
        System.out.println("===========================================================");

        for (Mebel mebel : daftarMebel) {
            if (kelas.isInstance(mebel)) {
                System.out.printf("%-5d%-10s%-15s%-10d%-15d%-15s\n", mebel.getId(), mebel.getNama(),
                        mebel.getMaterial(), mebel.getHarga(),
                        mebel.getStok(), kelas.getSimpleName());
                System.out.println("-----------------------------------------------------------");
            }
        }
    }

    private static void tambahFurniturBaru() {
        System.out.println("***===== Tambah Furnitur =====***");
        System.out.println("|| >>      [1] Meja         << ||");
        System.out.println("|| >>      [2] Kursi        << ||");
        System.out.println("|| >>      [3] Lemari       << ||");
        System.out.println("|| >>      [4] Kasur        << ||");
        System.out.println("|| >>      [5] Kembali      << ||");
        System.out.println("================================");
        System.out.print("Pilih Menu (1-5): ");

        int pilihan = scanner.nextInt();
        scanner.nextLine();

        String nama, material;
        int harga, stok;

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan Nama Meja: ");
                nama = scanner.nextLine();
                System.out.print("Masukkan Material Meja: ");
                material = scanner.nextLine();
                System.out.print("Masukkan Harga Meja: ");
                harga = scanner.nextInt();
                System.out.print("Masukkan Stok Meja: ");
                stok = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Masukkan Jumlah Kaki Meja: "); 
                int jumlahKakiMeja = scanner.nextInt();
                scanner.nextLine();
                daftarMebel.add(new Meja(nama, material, harga, stok, jumlahKakiMeja));
                System.out.println("Meja berhasil ditambahkan!");
                break;
            case 2:
                System.out.print("Masukkan Nama Kursi: ");
                nama = scanner.nextLine();
                System.out.print("Masukkan Material Kursi: ");
                material = scanner.nextLine();
                System.out.print("Masukkan Harga Kursi: ");
                harga = scanner.nextInt();
                System.out.print("Masukkan Stok Kursi: ");
                stok = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Masukkan Jenis Kursi: "); 
                String jenisKursi = scanner.nextLine();
                daftarMebel.add(new Kursi(nama, material, harga, stok, jenisKursi));
                System.out.println("Kursi berhasil ditambahkan!");
                break;
            case 3:
                System.out.print("Masukkan Nama Lemari: ");
                nama = scanner.nextLine();
                System.out.print("Masukkan Material Lemari: ");
                material = scanner.nextLine();
                System.out.print("Masukkan Harga Lemari: ");
                harga = scanner.nextInt();
                System.out.print("Masukkan Stok Lemari: ");
                stok = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Masukkan Jumlah Pintu Lemari: ");
                int jumlahPintu = scanner.nextInt();
                scanner.nextLine(); 
                daftarMebel.add(new Lemari(nama, material, harga, stok, jumlahPintu));
                System.out.println("Lemari berhasil ditambahkan!");
                break;
            case 4:
                System.out.print("Masukkan Nama Kasur: ");
                nama = scanner.nextLine();
                System.out.print("Masukkan Material Kasur: ");
                material = scanner.nextLine();
                System.out.print("Masukkan Harga Kasur: ");
                harga = scanner.nextInt();
                System.out.print("Masukkan Stok Kasur: ");
                stok = scanner.nextInt();
                daftarMebel.add(new Kasur(nama, material, harga, stok));
                System.out.println("Kasur berhasil ditambahkan!");
                break;
            case 5:
                System.out.println();
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }

    private static void ubahDataFurnitur() {
        if (daftarMebel.isEmpty()) {
            System.out.println("Data furnitur masih kosong!");
            return;
        }

        tampilkanDataFurnitur();

        System.out.print("Masukkan nomor furnitur yang ingin diubah (1-" + daftarMebel.size() + "): ");
        int pilihan = scanner.nextInt() - 1;

        if (pilihan >= 0 && pilihan < daftarMebel.size()) {
            Mebel furnitur = daftarMebel.get(pilihan);

            System.out.println("**Ubah Data " + furnitur.getNama() + "**");
            System.out.print("Nama baru (" + furnitur.getNama() + "): ");
            String namaBaru = scanner.next();
            if (!namaBaru.isEmpty()) {
                furnitur.setNama(namaBaru);
            }

            System.out.print("Material baru (" + furnitur.getMaterial() + "): ");
            String materialBaru = scanner.next();
            if (!materialBaru.isEmpty()) {
                furnitur.setMaterial(materialBaru);
            }

            System.out.print("Harga baru (Rp" + furnitur.getHarga() + "): ");
            int hargaBaru = scanner.nextInt();
            if (hargaBaru > 0) {
                furnitur.setHarga(hargaBaru);
            }

            System.out.print("Stok baru (" + furnitur.getStok() + "): ");
            int stokBaru = scanner.nextInt();
            if (stokBaru >= 0) {
                furnitur.setStok(stokBaru);
            }

            System.out.println("Data furnitur berhasil diubah!");
        } else {
            System.out.println("Nomor furnitur tidak valid!");
        }
    }

    private static void hapusFurnitur() {
        if (daftarMebel.isEmpty()) {
            System.out.println("Data furnitur masih kosong!");
            return;
        }

        tampilkanDataFurnitur();

        System.out.print("Masukkan nomor furnitur yang ingin dihapus (1-" + daftarMebel.size() + "): ");
        int pilihan = scanner.nextInt() - 1;

        if (pilihan >= 0 && pilihan < daftarMebel.size()) {
            daftarMebel.remove(pilihan);
            System.out.println("Furnitur berhasil dihapus!");
        } else {
            System.out.println("Nomor furnitur tidak valid!");
        }
    }
}

