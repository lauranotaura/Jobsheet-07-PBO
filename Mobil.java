public class Mobil extends Kendaraan {
    public int jumlahPintu;

    // 1. Constructor
    public Mobil() {
        super();
        this.jumlahPintu = 4;
    }

   
    public Mobil(String merk, String platNomor, int jumlahPintu) {
        super(merk, platNomor); 
        this.jumlahPintu = jumlahPintu;
    }

    // Method
    @Override
    public String getInfo() {
        
        return super.getInfo() + "Jml Pintu  : " + jumlahPintu + "\n";
    }
}