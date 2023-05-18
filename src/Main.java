import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(new InputStreamReader(System.in));
    private static int numSys = 10;
    public static void main(String[] args) {
        int menu = -1;

        System.out.println("Меню: ");
        while(menu != 0) {
            System.out.println();
            System.out.println("1 - Сложение");
            System.out.println("2 - Вычитание");
            System.out.println("3 - Умножение");
            System.out.println("4 - Деление");
            //System.out.println("5 - Возвести в степень");
            //System.out.println("6 - Вычислить квадратный корень");
            System.out.println("7 - Изменить систему счисления");
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
            //if(menu==5) pow();
            //if(menu==6) sqrt();
            if(menu==7) changeSys();
            menu = -1;
        }

    }

    private static void sOperation(int op) {
        double result = 0;
        String num1, num2;
        System.out.println("Введите первое число: ");
        num1 = setNumString();

        System.out.println("Введите второе число: ");
        num2 = setNumString();

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
        num = setNumDouble();
        System.out.println("Введите степень: ");
        power = setNumDouble();
        result = Math.pow(num, power);
        if(Double.isNaN(result) || Double.isFinite(result) || Double.isInfinite(result)) {
            System.out.println(num + " нельзя возвести в "+power+" степень");
            return;
        }
        if(result-(int)result==0)
            System.out.println("Результат: "+(int)result);
        else System.out.println("Результат: "+result);
    }

    private static void sqrt() {
        double result = 0;
        double num;
        System.out.println("Введите число: ");
        num = setNumDouble();
        result = Math.sqrt(num);
        if(Double.isNaN(result) || Double.isFinite(result) || Double.isInfinite(result)) {
            System.out.println("Из "+num+" нельзя вычислить корень");
            return;
        }

        if(result-(int)result==0)
            System.out.println("Результат: "+(int)result);
        else System.out.println("Результат: "+result);
    }

    private static void numSys() {
        String result = "";
        long num;
        int numSys = 0;
        System.out.println("В какой системе счисления число?(2,8,10,16): ");
        do{
            numSys = setNumInt();
        }while(numSys != 2 && numSys != 8 && numSys != 10 && numSys != 16);

        System.out.println("Введите число в "+numSys+" системе счисления: ");
        num = Long.parseLong(scanner.next(), numSys);
        System.out.println("В двоичной системе счисления: "+ Long.toString(num, 2));
        System.out.println("В восьмеричной системе счисления: "+ Long.toString(num, 8));
        System.out.println("В десятичной системе счисления: "+ Long.toString(num, 10));
        System.out.println("В шестнадцатеричной системе счисления: "+ Long.toString(num, 16));
    }


    private static void changeSys() {
        System.out.println("Текущая система счисления - " + numSys);
        int num = 0;
        System.out.println("Выберите систему счисления (2,8,10,16): ");
        do{
            num = setNumInt();
        }while(num != 2 && num != 8 && num != 10 && num != 16);
        numSys = num;
        System.out.println("Система счисления изменена на " + numSys);
    }

    private static int setNumString() {
        String str;
        int num = 0;
        Long check = 0L;
        Boolean f = false;
        while(!f) {
            str = scanner.next();
            try {
                num = Integer.parseInt(str);
                check = Long.parseLong(str, numSys);
                //if(num != check) {
                //    System.out.println("Число не в "+numSys+" системе счисления");
               // }else
                f = true;
            } catch (Exception e) {
                System.out.println("Введено неправильное значение");
            }
        }
        return num;
    }

    private static int setNumInt() {
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