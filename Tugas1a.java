public class Tugas1a {
    public static void main(String[] args) 
    {
        int rows = 5;
        int counter = 1; 
        boolean directionUp = true;

        while (counter <= 2 * rows - 1) {
            int currentRow = directionUp ? counter : 2 * rows - counter - 1;
            int start = currentRow;
            int end = directionUp ? 1 : currentRow;

            while (start <= end) {
                System.out.print(start + " ");
                start++;
            }

            System.out.println();
            counter++;

            if (currentRow == 1 || currentRow == rows) {
                directionUp = !directionUp;
            }
        }
    }
}
