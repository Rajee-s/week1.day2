package week1.day2;

import java.lang.reflect.Array;

public class FindIntersection {

	public static void main(String[] args) {
		int [] array1= {3,2,11,4,6,7};
		int [] array2 = {1,2,8,4,9,7};
		int length = array1.length;
		 int length2 = array2.length;
		 
		 for(int i=0;i<array1.length;i++) {
			 for(int j=0; j<array2.length; j++) {
				 if (array1[i] == array2[j]) {
					 System.out.println("The intersection is " + array1[i]);
				 }
			 }
		 }
			 

	}

}
