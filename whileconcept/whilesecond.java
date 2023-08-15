package whileconcept;

public class whilesecond{

	    public static void main(String[] args) {
	    	
	    	System.out.print("Welcome to Aryan's program Series\n");
	        int i = 2;
	        System.out.print("Generate the Series... ");
	        while (i <= 20) {
	            System.out.print(i + " ");
	            i += 2;
	        }
	        System.out.println();

	        i = 9;
	        System.out.print("Generate the Series... ");
	        while (i <= 90) {
	            System.out.print(i + " ");
	            i += 9;
	        }
	        System.out.println();

	        i = 1;
	        int sign = 1;
	        System.out.print("Generate the Series... ");
	        while (i <= 10) {
	            System.out.print(sign * i + " ");
	            sign *= -1;
	            i++;
	        }
	        System.out.println();

	        i = 5;
	        System.out.print("Generate the Series... ");
	        while (i <= 50) {
	            System.out.print(i + " ");
	            i += 5;
	        }
	        System.out.println();

	        i = 1;
	        System.out.print("Generate the Series... ");
	        int power = 0;
	        while (i <= 1000) {
	            System.out.print(i + " ");
	            i = (int) Math.pow(10, power++);
	        }
	        System.out.println();

	        i = 1;
	        int sum = 0;
	        System.out.print("Generate the Series... ");
	        while (i <= 45) {
	            sum += i;
	            System.out.print(sum + " ");
	            i++;
	        }
	        System.out.println();

	        i = 8;
	        System.out.print("Generate the Series... ");
	        while (i <= 80) {
	            System.out.print(i + " ");
	            i += 8;
	        }
	        System.out.println();

	        int prev = 0;
	        int current = 1;
	        System.out.print("Generate the Series... ");
	        while (current <= 21) {
	            System.out.print(prev + " ");
	            int temp = current;
	            current = prev + current;
	            prev = temp;
	        }
	        System.out.println();

	        i = 1;
	        System.out.print("Generate the Series... ");
	        while (i <= 10) {
	            System.out.print(i * i + " ");
	            i++;
	        }
	        System.out.println();

	        i = 3;
	        System.out.print("Generate the Series... ");
	        while (i <= 30) {
	            System.out.print(i + " ");
	            i += 3;
	        }
	        System.out.println();

	        i = 7;
	        System.out.print("Generate the Series... ");
	        while (i <= 70) {
	            System.out.print(i + " ");
	            i += 7;
	        }
	        System.out.println();

	        i = 4;
	        System.out.print("Generate the Series... ");
	        while (i <= 40) {
	            System.out.print(i + " ");
	            i += 4;
	        }
	        System.out.println();

	        i = 10;
	        System.out.print("Generate the Series... ");
	        while (i <= 100) {
	            System.out.print(i + " ");
	            i += 10;
	        }
	        System.out.println();

	        i = 1;
	        int maxCount = 5;
	        System.out.print("Generate the Series... ");
	        while (i <= maxCount) {
	            System.out.print(i + " ");
	            if (i == maxCount) {
	                maxCount = 4;
	            }
	            i++;
	        }
	        System.out.println();

	        i = 6;
	        System.out.print("Generate the Series... ");
	        while (i <= 60) {
	            System.out.print(i + " ");
	            i += 6;
	        }
	    }
	}


