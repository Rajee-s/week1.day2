package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String text = "Change me";
		String uppercase = " ";
		
		char[] charArray = text.toCharArray();
		
		for(int i = 0; i<charArray.length; i++) {
			
			
			if (i%2==1) {
				uppercase = uppercase+text.charAt(i);
				String c = uppercase.toUpperCase();
				System.out.print(c);
				
				}
			}
			
				
		}


}
