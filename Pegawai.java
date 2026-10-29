public class Pegawai {
    public String nip;
    public String nama;
    public double gaji;

    // Constructor 
    public Pegawai() {
        System.out.println("Ini constructor class Pegawai");
    }

    // Constructor 
    public Pegawai(String nip, String nama, double gaji) {
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
    }

    // Method 
    public String getInfo() {
        String info = "";
        info += "NIP     : " + nip + "\n";
        info += "Nama    : " + nama + "\n";
        info += "Gaji    : " + gaji + "\n";
        return info;
    }
}