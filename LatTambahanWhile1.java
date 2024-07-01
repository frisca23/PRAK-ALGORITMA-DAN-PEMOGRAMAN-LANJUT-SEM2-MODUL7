import java.util.*;
import java.lang.Math;
class LatTambahan1While 
{
    public static void main(String[] args) 
    {
        int i=0;
        int hasil;
	while(i<=10)
	{
            System.out.println("Nilai i adalah " + i);
            i+=2;
            
            int j=15;
            while(j<=10)
            {
                if (i < j) 
                {
                    hasil = i * j;
                } else {
                    hasil = i + j;
                }
                System.out.println("Nilai i=" + i + "dan j=" + j);
                System.out.println("Hasil=" + hasil);
            }
            j+=3;
         }
         System.out.println("Selesai");
     }
}