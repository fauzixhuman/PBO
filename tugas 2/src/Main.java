public class Main {
    public static void main(String[] args) {
        mobil mobil1 = new mobil("Avanza", 2023, 100000, 4);
        mobil1.tampilkaninfo();
        mobil1.jadwalservis();
        System.out.println("Pajak Mobil: " + mobil1.hitungpajak());

        System.out.println("-----------------");

        motor motor1 = new motor("Vixion", 2022, 50000, "Sport");
        motor1.tampilkaninfo();
        motor1.jadwalservis();
        System.out.println("Pajak Motor: " + motor1.hitungpajak());

        System.out.println("-----------------");
        
        truk truk1 = new truk("Hino", 2021, 150000, 1000);
        truk1.tampilkaninfo();
        truk1.jadwalservis();
        System.out.println("Pajak Truk: " + truk1.hitungpajak());
    }
}

