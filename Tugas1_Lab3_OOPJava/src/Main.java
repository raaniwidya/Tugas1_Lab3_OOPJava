public class Main {
    public static void main(String[] args) {
        // Objek dengan constructor 1
        Absensi siswa1 = new Absensi("Rani", "X IPA 1");
        siswa1.absenMasuk();
        siswa1.absenMasuk("2023-04-21");
        int kehadiranSiswa1 = siswa1.cetakLaporanKehadiran();
        System.out.println("Jumlah kehadiran " + siswa1.namaSiswa + ": " + kehadiranSiswa1);

        // Objek dengan constructor 2
        Absensi siswa2 = new Absensi("Widya", "X IPA 2", 3);
        siswa2.absenMasuk();
        siswa2.absenMasuk("2023-04-22");
        int kehadiranSiswa2 = siswa2.cetakLaporanKehadiran();
        System.out.println("Jumlah kehadiran " + siswa2.namaSiswa + ": " + kehadiranSiswa2);
    }
}