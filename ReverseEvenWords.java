package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String text = "I am a software tester";
		String[] split = text.split(" ");
		String rev = " ";
		for(int i=0; i<split.length; i++) {
				if(i%2 == 0) {
				char[] charArray = split[i].toCharArray();
				}
				
				if(i%2==1) {
					char[] charArray2 = split[i].toCharArray();
				for (int j=charArray2.length-1; j>=0; j--) 	
						rev = rev +charArray2[j];
				split[i] = rev;
				}
			System.out.print(split[i]+ " ");
		}
		
	}					
}

