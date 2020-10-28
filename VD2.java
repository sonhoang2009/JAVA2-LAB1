package Array.LAB1;

import java.util.ArrayList;
import java.util.List;

public class VD2 {
    public static void main(String[] args) {
        List<Integer> firstFivePrimeNumber = new ArrayList<>();

        firstFivePrimeNumber.add(2);
        firstFivePrimeNumber.add(3);
        firstFivePrimeNumber.add(5);
        firstFivePrimeNumber.add(7);
        firstFivePrimeNumber.add(11);

        List<Integer> firstTenPrimeNumber = new ArrayList<>(firstFivePrimeNumber);

        List<Integer> nextFivePrimeNumber = new ArrayList<>();
        nextFivePrimeNumber.add(13);
        nextFivePrimeNumber.add(17);
        nextFivePrimeNumber.add(19);
        nextFivePrimeNumber.add(23);
        nextFivePrimeNumber.add(29);

        firstTenPrimeNumber.addAll(nextFivePrimeNumber);

        System.out.println(firstTenPrimeNumber);

    }
}
