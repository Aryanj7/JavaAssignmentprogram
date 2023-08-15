package forloop;

public class TasKJBK {
	public static void main(String[] args) {
		
		int countallodd = 0;
		int countalleven = 0;
		int sumallodd=0;
		int sumalleven=0;
		for (int i=1;i<=510; i++) {
			if(i%2==0) {
				countalleven++;
				sumalleven+=i;
			}
			else {
				countallodd++;
				sumallodd+=i;
				
			}
			
		}
		System.out.println("odd count : "+countallodd);
			System.out.println("even count :"+countalleven);
			System.out.println("odd sum : "+sumallodd);
			System.out.println("even sum :" +sumalleven);	
	}
	

}
