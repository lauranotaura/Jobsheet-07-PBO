public class Kendaraan {
    public String merk;
    public String platNomor;

    // 1. Constructor 
    public Kendaraan() {
        this.merk = "Belum Diatur";
        this.platNomor = "Belum Diatur";
    }

   
    public Kendaraan(String merk, String platNomor) {
        this.merk = merk;
        this.platNomor = platNomor;
    }

    // Method 
    public String getInfo() {
        return "Merk       : " + merk + "\nPlat Nomor : " + platNomor + "\n";
    }
}