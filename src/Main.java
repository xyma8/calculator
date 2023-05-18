import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(new InputStreamReader(System.in));
    private static int numSys = 10;
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10);
        int menu = -1;
        System.out.println("Меню: ");
        while(true) {
            System.out.println();
            System.out.println("1 - Сложение");
            System.out.println("2 - Вычитание");
            System.out.println("3 - Умножение");
            System.out.println("4 - Деление");
            System.out.println("5 - Изменить систему счисления");
            System.out.println("0 - Выход");
            String str = scanner.next();
            try {
                menu = Integer.parseInt(str);
            } catch (Exception e) {
                System.out.println("Введено неправильное значение");
            }
            if(menu==1) calculator.sOperation(1);
            if(menu==2) calculator.sOperation(2);
            if(menu==3) calculator.sOperation(3);
            if(menu==4) calculator.sOperation(4);
            if(menu==5) calculator.changeSys();
            menu = -1;
        }
    }
}