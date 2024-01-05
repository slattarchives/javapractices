package praccccc;

public class Main {
    // task 6
    private static void isPrime(int number) {
        isPrime(number, 2);
    }

    private static void isPrime(int number, int div) {
        if (number == 2) {
            System.out.println("YES");
            return;
        }
        if (number % div == 0) {
            System.out.println("NO");
            return;
        }
        if (div > Math.sqrt(number)) {
            System.out.println("YES");
            return;
        }
        isPrime(number, div + 1);
    }

    // task 7

    private static boolean isNumPrime(int number) {
        return isNumPrime(number, 2);
    }

    private static boolean isNumPrime(int number, int div) {
        if (number == 2) return true;
        if (number % div == 0) {
            return false;
        }
        if (div > Math.sqrt(number)) {
            return true;
        }
        return isNumPrime(number, div + 1);
    }

    private static void factorization(int number) {
        factorization(number, 2);
    }

    private static void factorization(int number, int div) {
        if (number == 2) {
            System.out.println("2");
            return;
        }
        if (number <= 1) return;
        if (!isNumPrime(div)) {
            factorization(number, div + 1);
            return;
        }
        if (number % div == 0) {
            System.out.print(div + ", ");
            factorization(number / div, div);
        } else factorization(number, div + 1);
    }

    //task 8
    private static void Palindrome(String s) {
        if (s.length() == 1) {
            System.out.println("YES");
            return;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            System.out.println("NO");
            return;
        }
        if (s.length() == 2) {
            System.out.println("YES");
            return;
        }
        Palindrome(s.substring(1, s.length() - 1));
    }

    // task 9
    private static int count(int a, int b) {
        if (a == 0) return 1;
        if (a == 1) return b + 1;
        if (a > 1 && b == 0) return 0;
        return count(a - 1, b - 1) + count(a, b - 1);
    }

    //task 10

    private static int reversing(int num, int rev) {
        if (num == 0) return rev;
        return reversing(num / 10, 10 * rev + num % 10);
    }


    public static void main(String[] args) {
//ex6
        System.out.println("Primes");
        isPrime(2);
        isPrime(18756);
        isPrime(3571); // prime
//ex7
        System.out.println("\nFactorization");
        factorization(225);
        System.out.println();
        factorization(999);
        System.out.println();
        factorization(180);
        System.out.println();
        factorization(7);
//ex8
        System.out.println("\nPalindrome:");
        Palindrome("nonono");
        Palindrome("dadaada");
        Palindrome("h");

//ex9
        System.out.println("\nZero");
        System.out.println(count(0, 0));
        System.out.println(count(1, 3));
        System.out.println(count(14, 15));
//ex10
        System.out.println("\nReverse");
        System.out.println(reversing(876, 0));
        System.out.println(reversing(32, 0));
        System.out.println(reversing(786432, 0));
    }
}