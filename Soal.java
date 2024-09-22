import java.util.Scanner;

public class Soal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Beberapa perhitungan yang tersedia:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.print("Masukkan pilihan anda: ");

        int pilih = scanner.nextInt();

        switch (pilih){
            case 1:
                System.out.print("Masukkan sisi: ");
                double sisi = scanner.nextInt();

                double totalLuasPersegi = luasPersegi(sisi);
                double totalKelilingPersegi = kelilingPersegi(sisi);

                System.out.println("Luas Persegi = " + totalLuasPersegi);
                System.out.println("Keliling Persegi = " + totalKelilingPersegi);
                break;

            case 2:
                System.out.print("Masukkan panjang: ");
                double panjang = scanner.nextInt();

                System.out.print("Masukkan Lebar: ");
                double lebar = scanner.nextInt();

                double totalLuasPersegiPanjang = luasPersegiPanjang(panjang,lebar);
                double totalKelilingPersegiPanjang = kelilingPersegiPanjang(panjang,lebar);

                System.out.println("Luas Persegi Panjang = " + totalLuasPersegiPanjang);
                System.out.println("Keliling Persegi Panjang = " + totalKelilingPersegiPanjang);
                break;

            case 3:
                System.out.print("Masukkan jari-jari: ");
                double jari = scanner.nextInt();

                double totalLuasLingkaran = luasLingkaran(jari);
                double totalKelilingLingkaran = kelilingLingkaran(jari);

                System.out.println("Luas Lingkaran = " + totalLuasLingkaran);
                System.out.println("Keliling Lingkaran = " + totalKelilingLingkaran);
                break;
        }
    }

    public static double luasPersegi(double sisi){
        return sisi * sisi;
    }
    public static double kelilingPersegi(double sisi){
        return sisi * 4;
    }
    public static double luasPersegiPanjang(double panjang,double lebar){
        return panjang * lebar;
    }
    public static double kelilingPersegiPanjang(double panjang,double lebar){
        return (panjang + lebar) * 2;
    }
    public static double luasLingkaran(double jari){
        return Math.PI * jari * jari;
    }
    public static double kelilingLingkaran(double jari){
        return 2 * Math.PI * jari;
    }
}
