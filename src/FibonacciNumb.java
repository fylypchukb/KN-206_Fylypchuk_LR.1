import java.util.ArrayList;

/**
 * Клас для представлення чисел Фібоначчі.
 * Це функція, у котрій кожне наступне число є сумою двох попередніх.
 *
 * @author Богдан Филипчук
 */
public class FibonacciNumb {
    /**
     * Масив чисел Фібоначчі
     */
    private ArrayList<Integer> numbers = new ArrayList<Integer>();

    public FibonacciNumb() {
        numbers.add(1);
    }

    /**
     * Метод шукає N-е число Фібоначчі, де N - натуральне число
     * <p>
     *<strong>Увага:</strong> N - повинна бути більше нуля.
     *
     * @param N порядковий номер числа Фібоначчі
     * @return N-е число Фібоначчі
     */
    public int getNumbers(int N) {
        if(N < 1) {
            System.out.println("Неправильно введений порядковий номер");
            return 0;
        }
        if (N > numbers.size())
            FillArray(N);
        return numbers.get(N-1);
    }

    /**
     * Заповнює поле класу <code>FibonacciNumb</code> числами Фібоначчі.
     *<p>
     * Так як поле класу <code>FibonacciNumb</code> це екземпляр класу <code>ArrayList</code>,
     * то доцільно заповнювати масив кількістю чисел, до числа, яке запрошує користувач.
     * Це є обов'язковим для розрахунку всі чисел Фібоначчі, оскільки кожен наступний член масиву
     * є сумою двох попередніх.
     *
     * @param N порядковий номер числа Фібонначі, до якого слід заповнити масив
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
