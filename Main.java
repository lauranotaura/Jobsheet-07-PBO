public class Main {
    public static void main(String[] args) {
        System.out.println("=== PEMBUATAN OBJEK MOBIL 1 (Constructor Tanpa Parameter) ===");
        Mobil mobil1 = new Mobil();
        mobil1.merk = "Toyota Avanza";
        mobil1.platNomor = "B 1234 CD";
        mobil1.jumlahPintu = 5;
        System.out.println(mobil1.getInfo());

        System.out.println("=== PEMBUATAN OBJEK MOBIL 2 (Constructor Berparameter) ===");
        Mobil mobil2 = new Mobil("Honda Civic", "N 5678 EF", 4);
        System.out.println(mobil2.getInfo());
    }
}