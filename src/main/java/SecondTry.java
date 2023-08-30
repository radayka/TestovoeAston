import java.util.Objects;
import java.util.Scanner;

public class SecondTry {
    public static void main(String[] args) {
        String name = "Вячеслав";
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        if (Objects.equals(s1, name)) {
            System.out.println("Привет, "+name);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
