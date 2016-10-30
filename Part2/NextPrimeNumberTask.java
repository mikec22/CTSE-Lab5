public class NextPrimeNumberTask implements Task {
	private int nextPrimeNumber = 2;
	boolean isPrime;

	public void performTask() {
		while (true) {
			isPrime = true;
			for (int i = 2; i <= nextPrimeNumber/2; i++) {
				if (nextPrimeNumber % i == 0)
					isPrime = false;
			}

			if (isPrime) {
				System.out.println("Next prime number is : " + nextPrimeNumber);
				nextPrimeNumber++;
				break;
			}
			nextPrimeNumber++;
		}
	}
}