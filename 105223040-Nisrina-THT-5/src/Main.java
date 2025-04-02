import librarysystem.Buku;
import librarysystem.Perpustakaan;
import librarysystem.User;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Perpustakaan perpustakaan = new Perpustakaan(5);
        perpustakaan.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005), 0);
        perpustakaan.tambahBuku(new Buku("Bumi", "Tere Liye", 2014), 1);
        perpustakaan.tambahBuku(new Buku("Bumi Manusia", "Pramoedya Ananta Toer", 1980), 2);

        perpustakaan.tampilkanBuku();

        Scanner input = new Scanner(System.in);
        System.out.print("\nMasukkan nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan ID: ");
        String idUser = input.nextLine();
        User user = new User(nama, idUser);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Pinjam Buku");
            System.out.println("2. Kembalikan Buku");
            System.out.println("3. Tampilkan Daftar Buku");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = input.nextInt();

            if (pilihan == 1) {
                perpustakaan.tampilkanBuku();
                System.out.print("Pilih nomor buku yang ingin dipinjam: ");
                int indeks = input.nextInt() - 1;
                if (indeks >= 0 && indeks < perpustakaan.getKoleksiBuku().length && perpustakaan.getKoleksiBuku()[indeks] != null) {
                    user.pinjamBuku(perpustakaan.getKoleksiBuku()[indeks]);
                } else {
                    System.out.println("Nomor buku tidak valid");
                }
            } else if (pilihan == 2) {
                perpustakaan.tampilkanBuku();
                System.out.print("Pilih nomor buku yang ingin dikembalikan: ");
                int indeks = input.nextInt() - 1;
                if (indeks >= 0 && indeks < perpustakaan.getKoleksiBuku().length && perpustakaan.getKoleksiBuku()[indeks] != null) {
                    user.kembalikanBuku(perpustakaan.getKoleksiBuku()[indeks]);
                } else {
                    System.out.println("Nomor buku tidak valid");
                }
            } else if (pilihan == 3) {
                perpustakaan.tampilkanBuku();
            } else if (pilihan == 4) {
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan tidak valid");
            }
        }
        input.close();
    }
}