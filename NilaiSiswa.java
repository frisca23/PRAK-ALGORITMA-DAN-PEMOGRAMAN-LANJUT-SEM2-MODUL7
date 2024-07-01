import java.util.Scanner;
public class NilaiSiswa {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String[] namaSiswa = new String[10];
        int[][] nilai = new int[10][3];
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nama siswa ke-" + (i + 1) + ": ");
            namaSiswa[i] = scanner.nextLine();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                String mataKuliah;
                if (j == 0) {
                    mataKuliah = "Mata kuliah 1";
                } else if (j == 1) {
                    mataKuliah = "Mata kuliah 2";
                } else {
                    mataKuliah = "Mata kuliah 3";
                }

                do {
                    System.out.print("Masukkan nilai " + mataKuliah + " untuk " + namaSiswa[i] + ": ");
                    nilai[i][j] = scanner.nextInt();
                } while (nilai[i][j] < 0 || nilai[i][j] > 100);
            }
        }
        int[] rataRata = new int[10];
        for (int i = 0; i < 10; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += nilai[i][j];
            }
            rataRata[i] = total / 3;
        }
        String[] keterangan = new String[10];
        for (int i = 0; i < 10; i++) {
            if (rataRata[i] >= 80) {
                keterangan[i] = "Sangat Baik";
            } else if (rataRata[i] >= 50) {
                keterangan[i] = "Baik";
            } else {
                keterangan[i] = "Kurang Baik";
            }
        }
        System.out.println("\n           Nilai Siswa           ");
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%-20s %5s %5s %5s %10s\n", "Nama", "MK1", "MK2", "MK3", "Rata-rata");
        System.out.println("-----------------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-20s %5d %5d %5d %10s\n", namaSiswa[i], nilai[i][0], nilai[i][1], nilai[i][2], rataRata[i] + " (" + keterangan[i] + ")");
        }
        System.out.println("-----------------------------------------------------------------");
    }
}