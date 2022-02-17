public class CardValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String n="5241933970880001";
		String n="5166401640001573";
		
		/* First 6 digit : Bank Identification No.
		 * Next 9 digits : linked to account no
		 * last digit : Check digit    */
		
		int sum=0;
		
		for(int i=0;i<n.length();i++) {
			int c=Character.getNumericValue(n.charAt(i));
			//System.out.println("The number is "+c);
			if((i+1)%2==0) {
				sum+=c;
				//System.out.println("As it is even so adding "+c+ "to previous sum "+": "+sum);
			}
			else {
				int x=2*c;
				if(x<=9) {
					sum+=2*c;
				}else {
					int y=sumofdigits(x);
					sum+=y;
				}
				//System.out.println("As it is odd so adding twice of "+c+ "to previous sum "+": "+sum);
			}
		}
		//System.out.println("the sum is "+sum);
		if(sum%10==0) {
			System.out.println("The Card is Valid");
		}else {
			System.out.println("The card is not Valid");
		}

	}

	private static int sumofdigits(int x) {
		// TODO Auto-generated method stub
		int sum=0;
		while(x>0) {
			int y=x%10;
			x/=10;
			sum+=y;
		}
		return sum;
	}

}
