import java.util.Scanner;

public class Gaji23 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int jmlMasuk, jmlTdkMasuk, totalGaji;
        int gaji=40000, potGaji=25000;
        System.out.println("Masukkan jumlah hari masuk kerja");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan jumlah hari tidak masuk kerja");
        jmlTdkMasuk=input.nextInt();
        totalGaji=(jmlMasuk*gaji)-(jmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima");
    }
}