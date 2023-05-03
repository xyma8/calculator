import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(new InputStreamReader(System.in));
    public static void main(String[] args) {
        int menu = -1;

        System.out.println("Меню: ");
        while(menu != 0) {
            System.out.println();
            System.out.println("1 - Сложение");
            System.out.println("2 - Вычитание");
            System.out.println("3 - Умножение");
            System.out.println("4 - Деление");
            System.out.println("5 - Возвести в степень");
            System.out.println("6 - Вычислить квадратный корень");
            System.out.println("7 - Перевести в другую систему счисления");
            System.out.println("0 - Выход");
            String str = scanner.next();
            try {
                menu = Integer.parseInt(str);
            } catch (Exception e) {
                System.out.println("Введено неправильное значение");
            }
            if(menu==1) sOperation(1);
            if(menu==2) sOperation(2);
            if(menu==3) sOperation(3);
            if(menu==4) sOperation(4);
            if(menu==5) pow();
            if(menu==6) sqrt();
            if(menu==7) numSys();
        }

    }

    private static void sOperation(int op) {
        double result = 0;
        double num1, num2;
        System.out.println("Введите первое число: ");
        num1 = setNum();

        System.out.println("Введите второе число: ");
        num2 = setNum();

        switch (op) {
            case 1: result = num1+num2; break;
            case 2: result = num1-num2; break;
            case 3: result = num1*num2; break;
            case 4: result = num1/num2; break;
        }

        if(result-(int)result==0)
            System.out.println("Результат: "+(int)result);
        else System.out.println("Результат: "+result);
    }

    private static void pow() {
        double result = 0;
        double num, power;
        System.out.println("Введите число: ");
        num = setNum();
        System.out.println("Введите степень: ");
        power = setNum();
        result = Math.pow(num, power);
        if(Double.isNaN(result) || Double.isFinite(result) || Double.isInfinite(result)) {
            System.out.println("Это нельзя возвести в степень");
            return;
        }
        if(result-(int)result==0)
            System.out.println("Результат: "+(int)result);
        else System.out.println("Результат: "+result);
    }

    private static void sqrt() {

    }

    private static void numSys() {

    }

    private static double setNum() {
        String str;
        while(true) {
            str = scanner.next();
            try {
                return Double.parseDouble(str);
            } catch (Exception e) {
                System.out.println("Введено неправильное значение");
            }
        }
    }

}