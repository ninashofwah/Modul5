package librarysystem;

public class Perpustakaan {
    private Buku[] koleksiBuku;

    public Perpustakaan(int kapasitas) {
        koleksiBuku = new Buku[kapasitas];
    }

    public void tambahBuku(Buku buku, int indeks) {
        if (indeks >= 0 && indeks < koleksiBuku.length) {
            if (koleksiBuku[indeks] == null) {
                koleksiBuku[indeks] = buku;
                System.out.println("Buku " + buku.getJudul() + " telah ditambahkan");
            } else {
                System.out.println("Indeks sudah terisi");
            }
        } else {
            System.out.println("Indeks tidak valid");
        }
    }

    public void tampilkanBuku() {
        System.out.println("\nDaftar Buku di Perpustakaan:");
        for (int i = 0; i < koleksiBuku.length; i++) {
            if (koleksiBuku[i] != null) {
                Buku buku = koleksiBuku[i];
                System.out.println((i + 1) + ". " + buku.getJudul() + " - " + buku.getPenulis() +
                        " (" + buku.getTahunTerbit() + ") " +
                        (buku.getStatusDipinjam() ? "[Dipinjam]" : "[Tersedia]"));
            }
        }
    }

    public Buku[] getKoleksiBuku() {
        return koleksiBuku;
    }
}