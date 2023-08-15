package dowhileconcept;

public class dowhileloop{
	

	    public static void main(String[] args) {
	    	
	    	System.out.print("Welcome to Aryan's program Series\n");
	        // 1) Print 1 to 25 numbers
	        int num1 = 1;
	        do {
	            System.out.print(num1 + " ");
	            num1++;
	        } while (num1 <= 25);
	        System.out.println();

	        // 2) Print 25 to 1 numbers
	        int num2 = 25;
	        do {
	            System.out.print(num2 + " ");
	            num2--;
	        } while (num2 >= 1);
	        System.out.println();

	        // 3) Print 1 to 100 odd numbers
	        int num3 = 1;
	        do {
	            if (num3 % 2 != 0) {
	                System.out.print(num3 + " ");
	            }
	            num3++;
	        } while (num3 <= 100);
	        System.out.println();

	        // 4) Print 1 to 100 even numbers
	        int num4 = 1;
	        do {
	            if (num4 % 2 == 0) {
	                System.out.print(num4 + " ");
	            }
	            num4++;
	        } while (num4 <= 100);
	        System.out.println();

	        // 5) Print sum of 1 to 50 odd numbers
	        int num5 = 1;
	        int sumOdd = 0;
	        do {
	            if (num5 % 2 != 0) {
	                sumOdd += num5;
	            }
	            num5++;
	        } while (num5 <= 50);
	        System.out.println("Sum of odd numbers: " + sumOdd);

	        // 6) Print sum of 1 to 50 even numbers
	        int num6 = 1;
	        int sumEven = 0;
	        do {
	            if (num6 % 2 == 0) {
	                sumEven += num6;
	            }
	            num6++;
	        } while (num6 <= 50);
	        System.out.println("Sum of even numbers: " + sumEven);

	        // 7) Print -45 to +45 numbers
	        int num7 = -45;
	        do {
	            System.out.print(num7 + " ");
	            num7++;
	        } while (num7 <= 45);
	        System.out.println();

	        // 8) Print 50 to 100 numbers
	        int num8 = 50;
	        do {
	            System.out.print(num8 + " ");
	            num8++;
	        } while (num8 <= 100);
	        System.out.println();

	        // 9) Print sum of odd and even numbers from 1 to 100
	        int num9 = 1;
	        int sumOdd2 = 0;
	        int sumEven2 = 0;
	        do {
	            if (num9 % 2 != 0) {
	                sumOdd2 += num9;
	            } else {
	                sumEven2 += num9;
	            }
	            num9++;
	        } while (num9 <= 100);
	        System.out.println("Sum of odd numbers: " + sumOdd2);
	        System.out.println("Sum of even numbers: " + sumEven2);

	        // 10) Print even and odd numbers from 1 to 100
	        int num10 = 1;
	        System.out.println("Odd numbers:");
	        do {
	            if (num10 % 2 != 0) {
	                System.out.print(num10 + " ");
	            }
	            num10++;
	        } while (num10 <= 100);

	        System.out.println("\nEven numbers:");
	        int num11 = 1;
	        do {
	            if (num11 % 2 == 0) {
	                System.out.print(num11 + " ");
	            }
	            num11++;
	        } while (num11 <= 100);
	        System.out.println();

	        // 11) Print 1 to 100 numbers
	        int num12 = 1;
	        do {
	            System.out.print(num12 + " ");
	            num12++;
	        } while (num12 <= 100);
	        System.out.println();

	        // 12) Print 100 to 1 numbers
	        int num13 = 100;
	        do {
	            System.out.print(num13 + " ");
	            num13--;
	        } while (num13 >= 1);
	        System.out.println();

	        // 13) Print 30 to 50 numbers
	        int num14 = 30;
	        do {
	            System.out.print(num14 + " ");
	            num14++;
	        } while (num14 <= 50);
	        System.out.println();

	        // 14) Print count of even numbers from 1 to 25
	        int num15 = 1;
	        int evenCount = 0;
	        do {
	            if (num15 % 2 == 0) {
	                evenCount++;
	            }
	            num15++;
	        } while (num15 <= 25);
	        System.out.println("Count of even numbers: " + evenCount);

	        // 15) Print count of odd numbers from 1 to 25
	        int num16 = 1;
	        int oddCount = 0;
	        do {
	            if (num16 % 2 != 0) {
	                oddCount++;
	            }
	            num16++;
	        } while (num16 <= 25);
	        System.out.println("Count of odd numbers: " + oddCount);
	    }
	}

