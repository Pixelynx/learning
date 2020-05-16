import java.util.ArrayList;

class PrimeDirective {

    static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return number > 1;

    }

    static ArrayList<Integer> onlyPrimes(int[] numbers) {
        ArrayList<Integer> primes = new ArrayList<Integer>();

        for (Integer number : numbers) {
            if (isPrime(number))
                primes.add(number);
        }
        return primes;
    }

    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = { 6, 29, 28, 33, 11, 100, 101, 43, 89 };

        System.out.println(onlyPrimes(numbers));
    }

}