package manajemenhewan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Hewan> daftarHewan = new ArrayList<>();

        while (true) {
            System.out.println("\n App Manajemen Hewan Peliharaan ");
            System.out.println("1. Tambah data hewan");
            System.out.println("2. Tampilkan daftar hewan");
            System.out.println("3. Pilih hewan untuk aksi");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.println("\nPilih jenis hewan:");
                    System.out.println("1. Kucing");
                    System.out.println("2. Anjing");
                    System.out.println("3. Burung");
                    System.out.print("Pilihan: ");
                    int jenis = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Masukkan nama hewan: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan umur hewan: ");
                    int umur = sc.nextInt();

                    Hewan h = null;
                    if (jenis == 1) h = new Kucing(nama, umur);
                    else if (jenis == 2) h = new Anjing(nama, umur);
                    else if (jenis == 3) h = new Burung(nama, umur);

                    if (h != null) {
                        daftarHewan.add(h);
                        System.out.println("Hewan berhasil ditambahkan!");
                    }
                    break;

                case 2:
                    System.out.println("\n Daftar Hewan ");
                    if (daftarHewan.isEmpty()) {
                        System.out.println("Belum ada data hewan.");
                    } else {
                        for (int i = 0; i < daftarHewan.size(); i++) {
                            Hewan hw = daftarHewan.get(i);
                            System.out.println((i+1) + ". " + hw.getNama() + " (Umur: " + hw.getUmur() + ")");
                        }
                    }
                    break;

                case 3:
                    if (daftarHewan.isEmpty()) {
                        System.out.println("Belum ada hewan. Tambahkan dulu.");
                        break;
                    }

                    System.out.println("\nPilih hewan:");
                    for (int i = 0; i < daftarHewan.size(); i++) {
                        System.out.println((i+1) + ". " + daftarHewan.get(i).getNama());
                    }
                    System.out.print("Pilihan: ");
                    int idx = sc.nextInt() - 1;

                    if (idx >= 0 && idx < daftarHewan.size()) {
                        Hewan pilihHewan = daftarHewan.get(idx);
                        System.out.println("\nAksi:");
                        System.out.println("1. Makan");
                        System.out.println("2. Tidur");
                        System.out.println("3. Bermain");
                        System.out.println("4. Bersuara");
                        System.out.print("Pilih: ");
                        int aksi = sc.nextInt();

                        switch (aksi) {
                            case 1 -> pilihHewan.makan();
                            case 2 -> pilihHewan.tidur();
                            case 3 -> {
                            	 if (pilihHewan instanceof Bermain) {
                                     ((Bermain) pilihHewan).bermain();
                                     }
                            }
                            case 4 -> 
                            {
                                if (pilihHewan instanceof SuaraHewan) {
                                    ((SuaraHewan) pilihHewan).bersuara();
                                }
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                    sc.close();
                    return;

                default:
                    System.out.println("Menu tidak valid!");
            }
        }
    }
}
