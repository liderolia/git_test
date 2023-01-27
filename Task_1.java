/*Задание 1.
Вычислить сумму чисел от 1 до n, вычислить n! произведение чисел от 1 до n
*/


import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scan.nextInt();
        int sum = 0;
        int mult = 1;
        for(int i = 1; i < n; i++) {
          System.out.print(i + "+");
          sum += i;
          mult *= i;
        }
        sum += n;
        mult *= n;
        System.out.println(n + "=" + sum);
        System.out.print("Факториал n = " + mult);
        scan.close();
    }
}