import java.util.Scanner;
public class Latihan3
{
    public static void main(String args[])
    {
        Scanner masuk = new Scanner(System.in);
        int score, sum = 0;

        System.out.print("Masukan nilai - 1 untuk keluar = ");
        score = masuk.nextInt();

        while (score != -1)
        {
            if (score != -1)
            {
                sum = sum + score;
            }
            System.out.print("Masukan nilai - 1 untuk keluar = ");
            score = masuk.nextInt();
        }

        System.out.println("hasil penjumlahan = "+sum);
     }
}