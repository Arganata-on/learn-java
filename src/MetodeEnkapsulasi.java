public class MetodeEnkapsulasi {
    public static void main(String[] args) {

        // Enkapsulasi = adalah prinsip OOP yang menyembunyikan atribut
        // privat dalam kelas dan mengizinkan akses terkontrol melalui method seperti
        // getter dan setter.

        Mahasiswa mhs = new Mahasiswa();

        mhs.setNam("Handika Rado Arganata");
        mhs.setNIM("24104410051");
        mhs.setJur("Teknik Informatika");

        System.out.println("Nama Mahasiswa: " + mhs.getNam());
        System.out.println("NIM: " + mhs.getNIM());
        System.out.println("Jurusan: " + mhs.getJur());

    }
}
