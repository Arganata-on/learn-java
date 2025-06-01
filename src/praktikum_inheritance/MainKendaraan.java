package praktikum_inheritance;

public class MainKendaraan extends Kendaraan {
    @Override
    public void jalankan() {
        System.out.println("Matic");
    }

    public void setMesin(String mesin) {
        System.out.println("Besar mesin: " + mesin);
    }

    public String getMesin() {
        return super.getMesin();
    }

    public static void main(String[] args) {
        MainKendaraan mainKendaraan = new MainKendaraan();
        mainKendaraan.setMesin("150 cc");
        System.out.println(mainKendaraan.getMesin());
    }

}