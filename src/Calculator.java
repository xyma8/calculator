import java.io.InputStreamReader;
import java.util.Scanner;

public class Calculator {
    private Scanner scanner;
    private int numSys;
    public Calculator(int sys) {
        scanner = new Scanner(new InputStreamReader(System.in));
        numSys = sys;
    }

    public void sOperation(int op) {
        int result = 0;
        String s1, s2;
        System.out.println("Введите первое число: ");
        s1 = setNumString();
        System.out.println("Введите второе число: ");
        s2 = setNumString();
        int num1, num2;
        num1 = Integer.parseInt(s1,10);
        num2 = Integer.parseInt(s2, 10);

        switch (op) {
            case 1 -> result = num1 + num2;
            case 2 -> result = num1 - num2;
            case 3 -> result = num1 * num2;
            case 4 -> result = num1 / num2;
        }

        System.out.println("Результат: ");
        numSys(result);
    }

    private void numSys(int res) {
        System.out.println("В двоичной системе счисления: "+ Long.toString(res, 2));
        System.out.println("В восьмеричной системе счисления: "+ Long.toString(res, 8));
        System.out.println("В десятичной системе счисления: "+ Long.toString(res, 10));
        System.out.println("В шестнадцатеричной системе счисления: "+ Long.toString(res, 16));
    }

    private String setNumString() {
        String str;
        int num = 0;
        while(true) {
            str = scanner.next();
            try {
                num = Integer.parseInt(str, numSys);
                return Integer.toString(num);
            } catch (Exception e) {
                System.out.println("Введено неправильное значение");
            }
        }
    }

    public void changeSys() {
        System.out.println("Текущая система счисления - " + numSys);
        int num = 0;
        do{
            System.out.println("Выберите систему счисления (2,8,10,16): ");
            num = setNumInt();
        }while(num != 2 && num != 8 && num != 10 && num != 16);
        numSys = num;
        System.out.println("Система счисления изменена на " + numSys);
    }

    private int setNumInt() {
        String str;
        int num = 0;
        while(true) {
            str = scanner.next();
            try {
                num = Integer.parseInt(str);
                return num;
            } catch (Exception e) {
                System.out.println("Введено неправильное значение");
            }
        }
    }
}
