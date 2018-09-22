public class PrimeNumberChecker{
	    public static int isPrime(int num){

        int input = num;

        if (input == 1 ) {

            return 0;
        }

        input -= 1;

        while (input != 1) {

            if (num % input == 0) {

                return 0;
            }

            input = input - 1;

        }
        return 1;
    }
}
