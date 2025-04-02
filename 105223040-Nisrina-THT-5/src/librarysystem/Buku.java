package librarysystem;

public class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean statusDipinjam;
    private static int jumlahBukuTersedia;

    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.statusDipinjam = false;
        jumlahBukuTersedia++;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public boolean getStatusDipinjam() {
        return statusDipinjam;
    }

    public void setStatusDipinjam(boolean statusDipinjam) {
        this.statusDipinjam = statusDipinjam;
    }

    public void pinjamBuku() {
        if (!statusDipinjam) {
            statusDipinjam = true;
            jumlahBukuTersedia--;
            System.out.println(judul + " telah dipinjam");
        } else {
            System.out.println(judul + " sedang dipinjam");
        }
    }

    public void kembalikanBuku() {
        if (statusDipinjam) {
            statusDipinjam = false;
            jumlahBukuTersedia++;
            System.out.println(judul + " telah dikembalikan");
        }
    }
}