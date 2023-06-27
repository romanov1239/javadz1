
//  Вывести все простые числа от 1 до 1000

 public class dz1_2 {
public static void main(String[] args) {
for (int i = 2; i <= 1000; i++) {
if (isPrime(i)) {
System.out.print(i + " ");
}
}
}

public static boolean isPrime(int n) {
    if (n == 2 || n == 3) {
        return true;
    }
    if (n == 1 || n % 2 == 0) {
        return false;
    }
    for (int i = 3; i <= Math.sqrt(n); i += 2) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}
 }
