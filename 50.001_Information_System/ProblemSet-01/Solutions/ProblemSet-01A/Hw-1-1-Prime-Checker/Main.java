public class Main {

  public static void main(String[] args) {
    int[] test = {4, 7, 14, 23, 99};

    PrimeNumberChecker checker = new PrimeNumberChecker();

    for (int i : test) {

      System.out.println(checker.isPrime(i));

    }
  }
}
