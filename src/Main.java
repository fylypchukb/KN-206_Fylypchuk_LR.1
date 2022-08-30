import java.util.Scanner;

//26-�� ������
public class Main {
    /**
     * �������� �����
     * <p>
     * ����� - F(N+2) ����� 2^N, ��
     * <p>
     * F(N) - ������� ��� ������� ����� Գ�������
     * <p>
     * N - ���������� ����� ����� Գ�������
     *
     * @param fibonacciNumb ��������� ����� <code>FibonacciNumb</code>
     * @param N ���������� ����� ����� Գ�������, ��� ������� ����������
     * @return true ���� ����� �����, false - ���� �
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

        System.out.print("����� ����� Գ�������: ");
        int N = scan.nextInt();

        int get = fibonacciNumb.getNumbers(N);
        if(get == 0)
            return;
        System.out.println("��������: " + get);

        if (CheckExpression(fibonacciNumb, N))
            System.out.print("����� �����. F(n+2) < 2^n");
        else
            System.out.println("����� �������. F(n+2) > 2^n");
    }
}