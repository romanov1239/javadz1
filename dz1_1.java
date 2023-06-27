// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class dz1_1 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Введите число n: ");
int n = scanner.nextInt();

    // Вычисление n-ого треугольного числа
    int triangleNumber = ((n*(n+1))/2);
    
    System.out.println("n-ое треугольное число = " + triangleNumber);

    // Вычисление факториала числа n
    long factorial = 1;
    for (int i = 1; i <= n; i++) {
        factorial *= i;
    }
    System.out.println("Факториал n!=" + factorial);
}
}



