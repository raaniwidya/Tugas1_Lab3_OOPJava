public class Absensi {
    public String namaSiswa;
    public String kelas;
    private int jumlahKehadiran;

    // Overloading constructor 1
    public Absensi(String namaSiswa, String kelas) {
        this.namaSiswa = namaSiswa;
        this.kelas = kelas;
        this.jumlahKehadiran = 0;
    }

    // Constructor 2
    public Absensi(String namaSiswa, String kelas, int jumlahKehadiran) {
        this.namaSiswa = namaSiswa;
        this.kelas = kelas;
        this.jumlahKehadiran = jumlahKehadiran;
    }

    // Overloading method & Method void absenMasuk() tanpa parameter
    public void absenMasuk() {
        System.out.println(namaSiswa + " hadir di kelas " + kelas);
        jumlahKehadiran++;
    }

    // Overloading method & Method void absenMasuk() dengan parameter tanggal
    public void absenMasuk(String tanggal) {
        System.out.println(namaSiswa + " hadir di kelas " + kelas + " pada tanggal " + tanggal);
        jumlahKehadiran++;
    }

    // Method non-void cetakLaporanKehadiran()
    public int cetakLaporanKehadiran() {
        System.out.println("Jumlah kehadiran: " + jumlahKehadiran);
        return jumlahKehadiran;
    }
}