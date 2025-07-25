
public class BubbleSort {

    public static void main(String[] args) {
        String[] Words = {"blue", "six", "hello", "game", "unorthodox", "referee", "ask", "zebra", "run", "flex"};
        bubbleSort(Words);
        System.out.print("Sorted: ");
        for (String word : Words) {
            System.out.print(word + " ");
        }
    }

    static void bubbleSort(String[] ar) {
        for (int i = ar.length - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (ar[j - 1].compareTo(ar[j]) > 0) {
                    String temp = ar[j - 1];
                    ar[j - 1] = ar[j];
                    ar[j] = temp;
                }
            }
        }
    }
}
