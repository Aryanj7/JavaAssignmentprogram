package forloop;

public class twenty5 {
	public static void main(String[] args) {
		int countOdd = 0; // Counter for odd numbers

		// Loop from 1 to 25
		for (int i = 1; i <= 25; i++) {
			if (i % 2 != 0) {
				countOdd++; // Increment the counter for odd numbers
				System.out.println(i); // Print the odd number
			}
		}

		System.out.println("Count of odd numbers from 1 to 25: " + countOdd);
	}
}
// In this program, we use a similar approach as before, but we check if a
// number is odd by using the condition i % 2 != 0. If the condition is true, it
// means the number is odd, and both the count and the odd number are printed.
// The final output will include the odd numbers in the range from 1 to 25 and
// the count of odd numbers.
