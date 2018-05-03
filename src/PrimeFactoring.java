import java.util.ArrayList;

public class PrimeFactoring {

    public ArrayList<Integer> generate (int n) {
        int counter = 2;
        int result = n;
        ArrayList<Integer> primeFactorNumbers = new ArrayList<>();

        while(counter <= n) {

            if(isPrime(result, counter)) {
                result = result / counter;
                primeFactorNumbers.add(counter);
            } else {
                counter++;
            }
        }

        return primeFactorNumbers;
    }

    public boolean isPrime (int n, int divisor ){
        return  n % divisor == 0;
    }

    public void printFactors(int n){
        ArrayList<Integer> primeNumbers = generate(n);
        for (int i = 0; i < primeNumbers.size(); i++) {
            System.out.println(primeNumbers.get(i));
        }
    }
}
