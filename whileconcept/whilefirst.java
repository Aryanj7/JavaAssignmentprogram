package whileconcept;

public class whilefirst{

	    public static void main(String[] args) { 
	    	
	    	
	    	System.out.print("Welcome to Aryan's program Series\n");
	        // 1) Print 1 to 25 numbers
	        int num1 = 1;
	        while (num1 <= 25) {
	            System.out.print(num1 + " ");
	            num1++;
	        }
	        System.out.println("\n");

	        // 2) Print 25 to 1 numbers
	        int num2 = 25;
	        while (num2 >= 1) {
	            System.out.print(num2 + " ");
	            num2--;
	        }
	        System.out.println("\n");

	        // 3) Print 1 to 100 odd numbers
	        int num3 = 1;
	        while (num3 <= 100) {
	            if (num3 % 2 != 0) {
	                System.out.print(num3 + " ");
	            }
	            num3++;
	        }
	        System.out.println("\n");

	        // 4) Print 1 to 100 even numbers
	        int num4 = 2;
	        while (num4 <= 100) {
	            System.out.print(num4 + " ");
	            num4 += 2;
	        }
	        System.out.println("\n");

	        // 5) Calculate sum of 1 to 50 odd numbers
	        int sumOdd = 0;
	        int num5 = 1;
	        while (num5 <= 50) {
	            if (num5 % 2 != 0) {
	                sumOdd += num5;
	            }
	            num5++;
	        }
	        System.out.println("Sum of odd numbers from 1 to 50: " + sumOdd +"\n");

	        // 6) Calculate sum of 1 to 50 even numbers
	        int sumEven = 0;
	        int num6 = 2;
	        while (num6 <= 50) {
	            sumEven += num6;
	            num6 += 2;
	        }
	        System.out.println("Sum of even numbers from 1 to 50: " + sumEven +"\n");

	        // 7) Print -45 to +45 numbers
	        int num7 = -45;
	        while (num7 <= 45) {
	            System.out.print(num7 + " ");
	            num7++;
	        }
	        System.out.println("\n");

	        // 8) Print 50 to 100 numbers
	        int num8 = 50;
	        while (num8 <= 100) {
	            System.out.print(num8 + " ");
	            num8++;
	        }
	        System.out.println("\n");

	        // 9) Calculate sum of odd and even numbers from 1 to 100
	        int sumOdd2 = 0;
	        int sumEven2 = 0;
	        int num9 = 1;
	        while (num9 <= 100) {
	            if (num9 % 2 != 0) {
	                sumOdd2 += num9;
	            } else {
	                sumEven2 += num9;
	            }
	            num9++;
	        }
	        System.out.println("Sum of odd numbers from 1 to 100: " + sumOdd2 +"\n");
	        System.out.println("Sum of even numbers from 1 to 100: " + sumEven2 +"\n");

	        // 10) Print even and odd numbers from 1 to 25
	        int num10 = 1;
	        while (num10 <= 25) {
	            if (num10 % 2 != 0) {
	                System.out.println(num10 + " is odd");
	            } else {
	                System.out.println(num10 + " is even");
	            }
	            num10++;
	        }

	        // 11) Print 1 to 100 numbers
	        int num11 = 1;
	        while (num11 <= 100) {
	            System.out.print(num11 + " ");
	            num11++;
	        }
	        System.out.println("\n");

	        // 12) Print 100 to 1 numbers
	        int num12 = 100;
	        while (num12 >= 1) {
	            System.out.print(num12 + " ");
	            num12--;
	        }
	        System.out.println("\n");

	        // 13) Print 30 to 50 numbers
	        int num13 = 30;
	        while (num13 <= 50) {
	            System.out.print(num13 + " ");
	            num13++;
	        }
	        System.out.println("\n");

	        // 14) Count of even numbers from 1 to 25
	        int countEven = 0;
	        int num14 = 1;
	        while (num14 <= 25) {
	            if (num14 % 2 == 0) {
	                countEven++;
	            }
	            num14++;
	        }
	        System.out.println("Count of even numbers from 1 to 25: " + countEven +"\n");

	        // 15) Count of odd numbers from 1 to 25
	        int countOdd = 0;
	        int num15 = 1;
	        while (num15 <= 25) {
	            if (num15 % 2 != 0) {
	                countOdd++;
	            }
	            num15++;
	        }
	        System.out.println("Count of odd numbers from 1 to 25: " + countOdd +"\n");
	    }
	}


