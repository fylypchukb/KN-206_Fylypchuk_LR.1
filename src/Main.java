import java.util.Scanner;

//26-ий варіант
public class Main {
    /**
     * Перевіряє вираз
     * <p>
     * Вираз - F(N+2) менше 2^N, де
     * <p>
     * F(N) - формула яка пояснює числа Фібоначчі
     * <p>
     * N - порядковий номер числа Фібоначчі
     *
     * @param fibonacciNumb екземпляр класу <code>FibonacciNumb</code>
     * @param N порядковий номер числа Фібоначчі, яке запрошує користувач
     * @return true якщо вираз вірний, false - якщо ні
     */
    public static boolean CheckExpression(FibonacciNumb fibonacciNumb, int N) {
        int first = fibonacciNumb.getNumbers(N + 2);
        System.out.println("F(N+2) = " + first);
        int second = 2 << N;
        System.out.println("2^n = " + second);
        return first < second;
    }

    public static void main(String[] args) {
        FibonacciNumb fibonacciNumb = new FibonacciNumb();
        Scanner scan = new Scanner(System.in);

        System.out.print("Номер числа Фібоначчі: ");
        int N = scan.nextInt();

        int get = fibonacciNumb.getNumbers(N);
        if(get == 0)
            return;
        System.out.println("Значення: " + get);

        if (CheckExpression(fibonacciNumb, N))
            System.out.print("Вираз вірний. F(n+2) < 2^n");
        else
            System.out.println("Вираз невірний. F(n+2) > 2^n");
    }
}