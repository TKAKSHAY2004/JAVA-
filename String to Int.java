// String to Integer

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		    
		String str = "123";
		    
		Integer num = Integer.parseInt(str);
		
		//Integer num = Integer.valueOf(str);
		    
		System.out.println(num);
		System.out.println(num.getClass().getSimpleName()); // int cann't be prefered
		
	}
}
