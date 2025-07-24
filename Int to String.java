// Integer to String

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		Integer num = 123;
		
		String str = Integer.toString(num);
		
		//String str = String.valueOf(num);
	    //String str = num + "";
		    
		System.out.println(str);
		System.out.println(str.getClass().getSimpleName()); // int cann't be prefered
		
	}
}
