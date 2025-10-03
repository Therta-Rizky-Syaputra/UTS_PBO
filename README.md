# UTS_PBO
Aplikasi Pengelola Hewan Peliharaan Sederhana

Aplikasi ini adalah sebuah sistem manajemen data hewan peliharaan dasar yang dirancang khusus untuk mempraktikkan dan memperkuat pemahaman tentang konsep kunci dalam Pemrograman Berorientasi Objek (PBO) menggunakan bahasa pemrograman Java.

Inti Fitur

Sistem ini menawarkan interaksi sederhana melalui konsol (menu) yang memungkinkan pengguna untuk:
1.Mendaftarkan Hewan Baru untuk menambahkan data peliharaan, yang saat ini terbatas pada Kucing, Anjing, dan Burung.
2.Melihat Semua Peliharaan untuk menampilkan daftar lengkap semua hewan yang telah terdaftar.
3.Memilih Aksi untuk memungkinkan pengguna memilih salah satu hewan yang ada untuk menjalankan aksi spesifik seperti makan, tidur, bermain dan bersuara.

Struktur Kode

Class & Object= Setiap hewan peliharaan yang ditambahkan (misalnya, seekor 'Kucing' bernama 'ahmad') adalah sebuah objek yang dibuat dari class-nya (misalnya, Kucing).

Encapsulation= Data esensial setiap hewan (nama dan umur) dipertahankan keamanannya dan hanya bisa diakses atau diubah melalui method getter dan setter yang terkontrol.

Inheritance= Terdapat sebuah Superclass (Hewan) yang mendefinisikan karakteristik dan perilaku dasar. Subclass-nya (Kucing, Anjing, Burung) mewarisi semua ini, memastikan kode yang rapi dan dapat digunakan kembali.

Polymorphism= Aksi bersuara(), walau dipanggil dengan nama method yang sama, hasilnya akan berbeda total seperti Kucing akan "Meong", Anjing akan "Guk Guk", dsb. tergantung pada jenis objek yang memanggilnya.

Interface= Digunakan SuaraHewan (atau sejenisnya) sebagai kontrak yang menjamin bahwa setiap hewan yang mengimplementasikannya pasti memiliki method bersuara(). Ini adalah cara efektif untuk menerapkan batasan perilaku.

Interaksi Dasar= Pengelolaan interaksi dengan pengguna menggunakan Input dan struktur Percabangan (Branching) seperti if-else atau switch untuk memproses pilihan menu.
