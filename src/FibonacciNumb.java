import java.util.ArrayList;

/**
 * ���� ��� ������������� ����� Գ�������.
 * �� �������, � ����� ����� �������� ����� � ����� ���� ���������.
 *
 * @author ������ ��������
 */
public class FibonacciNumb {
    /**
     * ����� ����� Գ�������
     */
    private ArrayList<Integer> numbers = new ArrayList<Integer>();

    public FibonacciNumb() {
        numbers.add(1);
    }

    /**
     * ����� ���� N-� ����� Գ�������, �� N - ���������� �����
     * <p>
     *<strong>�����:</strong> N - ������� ���� ����� ����.
     *
     * @param N ���������� ����� ����� Գ�������
     * @return N-� ����� Գ�������
     */
    public int getNumbers(int N) {
        if(N < 1) {
            System.out.println("����������� �������� ���������� �����");
            return 0;
        }
        if (N > numbers.size())
            FillArray(N);
        return numbers.get(N-1);
    }

    /**
     * �������� ���� ����� <code>FibonacciNumb</code> ������� Գ�������.
     *<p>
     * ��� �� ���� ����� <code>FibonacciNumb</code> �� ��������� ����� <code>ArrayList</code>,
     * �� �������� ����������� ����� ������� �����, �� �����, ��� ������� ����������.
     * �� � ����'������� ��� ���������� �� ����� Գ�������, ������� ����� ��������� ���� ������
     * � ����� ���� ���������.
     *
     * @param N ���������� ����� ����� Գ�������, �� ����� ��� ��������� �����
     * @see ArrayList
     */
    public void FillArray(int N) {
        while (numbers.size() < N) {
            int secNumber;
            if (numbers.size() == 1)
                secNumber = 0;
            else
                secNumber = numbers.get(numbers.size() - 2);

            int toAdd = numbers.get(numbers.size() - 1) + secNumber;
            numbers.add(toAdd);
        }
    }

}
