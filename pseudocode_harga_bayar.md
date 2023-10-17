Algoritma: Harga_Bayar_NoAbsen
{dibaca harga barang dan jumlah barang dari piranti masukan. Hitunglah jumlah diskon dan
harga barang}
Deklarasi:
harga, jumlah, jmlHalBuku : int
dis=0.1, total, bayar, jmlDis : double
merkBuku : string
Deskripsi:
1. print "Masukkan Jumlah hal buku”
2. read jmlHalBuku
3. print "Masukkan merk buku”
4. read merkBuku
5. print "Masukkan harga barang yang dibeli”
6. read harga
7. print "Masukkan jumlah barang yang dibeli”
8. read jumlah
9. print "Masukkan besaran diskon”
10. read dis
11. total = harga *jumlah
12. jmlDis=total*dis
13. bayar=total-jmlDis
14. print “Diskon yang anda dapatkan adalah”
15. print jmlDiskon
16. print "Jumlah yang harus dibayar adalah”
17. print bayar