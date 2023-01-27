/*
Задание 3.
Реализовать простой калькулятор (операции + - / * )
Пример работы программы:

Введите число 1: 2
Введите число 2: 3
Введите операцию: +
Ответ: 5
Введите число 1: 2
Введите число 2: 3
Введите операцию: а
Ответ: Такой операции нет */


import java.util.Scanner;

public class Task_3 {
public static void main(String[] args) {
    double num1;
    double num2;
    double res;
    char oper;
    Scanner scan = new Scanner(System.in);
    System.out.println("Введите два числа через пробел: ");
    num1 = scan.nextDouble();
    num2 = scan.nextDouble();
    System.out.println("Выберите оператор(+, -, *, /): ");
    oper = scan.next().charAt(0);
    switch(oper) {
        case '+': res = num1 + num2;
            break;
        case '-': res = num1 - num2;
            break;
        case '*': res = num1 * num2;
            break;
        case '/': res = num1 / num2;
            break;
        default: System.out.println("Введите корректный оператор(+, -, *, /): ");
            return;
        
    } 
    scan.close();
    System.out.println("Результат выбранной операции равен " + res);
}
    
}