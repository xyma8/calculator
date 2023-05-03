import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(new InputStreamReader(System.in));
    public static void main(String[] args) {
        int menu = -1;

        System.out.println("Меню:");
        while(menu != 0) {
            System.out.println();
            System.out.println("1 - Решить выражение (+ - * /)");
            System.out.println("2 - Возвести в степень");
            System.out.println("3 - Вычислить квадратный корень");
            System.out.println("4 - Перевести в систему счисления");
            System.out.println("5 - Добавить запись");
            System.out.println("6 - Информация о словаре");
            System.out.println("0 - Выход");
            String str = scanner.next();
            try {
                menu = Integer.parseInt(str);
            } catch (Exception e) {
                System.out.println("Введено неправильное значение");
            }
            if(menu==1) v1();
            if(menu==2) pow();
            if(menu==3) sqrt();
            if(menu==4) numSys();
        }

    }

    private static void v1() {
        System.out.println("Введите выражение, допустимые знаки(+ - * / ,)");
        String str = scanner.next();

    }

    private static void pow() {

    }

    private static void sqrt() {

    }

    private static void numSys() {

    }

}