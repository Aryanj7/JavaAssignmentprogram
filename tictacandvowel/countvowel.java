package tictacandvowel;
import java.util.Scanner;

public class countvowel {


	

	    public static void main(String[] args) {
	    	
	    	System.out.print("Welcome to Aryan's program Series\n");
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a word: ");
	        String word = scanner.nextLine().toLowerCase();
	        scanner.close();

	        boolean containsA = false;
	        boolean containsE = false;
	        boolean containsI = false;
	        boolean containsO = false;
	        boolean containsU = false;

	        for (int i = 0; i < word.length(); i++) {
	            char c = word.charAt(i);
	            if (c == 'a') {
	                containsA = true;
	            } else if (c == 'e') {
	                containsE = true;
	            } else if (c == 'i') {
	                containsI = true;
	            } else if (c == 'o') {
	                containsO = true;
	            } else if (c == 'u') {
	                containsU = true;
	            }
	        }

	        if (containsA && containsE && containsI && containsO && containsU) {
	            System.out.println("The word \"" + word + "\" contains all the vowels.");
	        } else {
	            System.out.println("The word \"" + word + "\" does not contain all the vowels.");
	        }
	    }
	}

