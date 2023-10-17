import java.util.Scanner;
public class modifHargaBayar23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga, jumlah, jmlHalBuku;
        double dis=0.1, total, bayar, jmlDis, bsrDis;
        String merkBuku;

        System.out.println("Masukkan jumlah halaman buku");
        jmlHalBuku=input.nextInt();
        System.out.println("Masukkan merk buku");
        merkBuku=input.next();
        System.out.println("Masukkan harga barang yang dibeli");
        harga=input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli");
        jumlah=input.nextInt();
        System.out.println("Masukkan besaran diskon");
        dis=input.nextDouble();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("Jumlah halaman buku" +jmlHalBuku);
        System.out.println("Merk buku" +merkBuku);
        System.out.println("Diskon yang anda dapatkan adalah" +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah" +bayar);        
    }
}