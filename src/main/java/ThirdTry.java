import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ThirdTry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int length = sc.nextInt();
        int[] input = new int[length];
        ArrayList<Integer> dynamicArray = new ArrayList<Integer>();
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < length; i++) {
            input[i] = sc.nextInt();
        }
        for (int j : input) {
            if (j % 3 == 0) {
                dynamicArray.add(j);
            }
        }
        System.out.println(dynamicArray);
    }

}
