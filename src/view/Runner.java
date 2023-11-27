package view;
import logic.ServiceArrays;
import java.util.Arrays;

public class Runner {

	public static void main(String[] args) {
		
		 ServiceArrays serviceArrays=new ServiceArrays(5,15,30);
	     // System.out.println(Arrays.toString(serviceArrays.getNumbers()));
	      int [] numbers=serviceArrays.getNumbers();
	     // System.out.println(Arrays.toString(numbers));
	      
	      System.out.println(Arrays.toString(numbers));
	      serviceArrays.addElement(567);
	     // System.out.println(Arrays.toString(serviceArrays.getNumbers()));
	      
	      System.out.println(serviceArrays.getMax(numbers));
	      System.out.println(serviceArrays.getMin(numbers));
	      System.out.println(serviceArrays.getAverage(numbers));
	      System.out.print(serviceArrays.showNumber(numbers));
		
		
		
		
		
		
		
	}

}
