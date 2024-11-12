# UTS-di-github.pdfimport java.util.Scanner;

public class BMI {

    // Metode untuk menghitung BMI
    public static double hitungBMI(double berat, double tinggi) {
        return berat / (tinggi * tinggi); // Rumus BMI
    }

    // Metode untuk menentukan kategori BMI
    public static String kategoriBMI(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        } else if (bmi >= 30 && bmi < 35) {
            return "Obese Class I";
        } else if (bmi >= 35 && bmi < 40) {
            return "Obese Class II";
        } else {
            return "Obese Class III";
        }
    }

    public static void main(String[] args) {
        // Membaca input berat badan dan tinggi badan dari pengguna
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan berat badan (kg): ");
        double berat = scanner.nextDouble();

        System.out.print("Masukkan tinggi badan (m): ");
        double tinggi = scanner.nextDouble();

        // Menghitung BMI
        double bmi = hitungBMI(berat, tinggi);
        
        // Menentukan kategori berdasarkan BMI
        String kategori = kategoriBMI(bmi);

        // Menampilkan hasil BMI dan kategori
        System.out.println("BMI Anda: " + String.format("%.2f", bmi));
        System.out.println("Kategori: " + kategori);
    }
}
