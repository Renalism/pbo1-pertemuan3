import java.util.Scanner;

public class HitungBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = scanner.nextInt();

        // Menggunakan percabangan if untuk menentukan ganjil atau genap
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap.");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil.");
        }

        // Menggunakan percabangan switch untuk menampilkan keterangan bilangan ganjil atau genap
        switch (bilangan % 2) {
            case 0:
                System.out.println("Bilangan " + bilangan + " adalah genap.");
                break;
            case 1:
            case -1: // Kondisi untuk bilangan negatif ganjil
                System.out.println("Bilangan " + bilangan + " adalah ganjil.");
                break;
            default:
                System.out.println("Bilangan tidak valid.");
                break;
        }

        scanner.close();
    }

    @Override
    public String toString() {
        return "HitungBilangan []";
    }
}

