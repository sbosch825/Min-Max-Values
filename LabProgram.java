import java.util.Scanner; 

public class LabProgram {
   
   /* Define your method here */
   
   public static void main(String[] args) {
      /* Type your code here. */
	   Scanner scan = new Scanner(System.in);
	   int num1;
	   int num2;
	   int num3;
	   int num4;
	   int maxValue = 0;
	   int minValue = 0;
	   num1 = scan.nextInt();
	   num2 = scan.nextInt();
	   num3 = scan.nextInt();
	   num4 = scan.nextInt();
	   
	   maxValue = maxNumber(num1, num2, num3, num4);
	   minValue = minNumber(num1, num2, num3, num4);
	   System.out.println("Maximum is " + maxValue);
	   System.out.println("Minimum is " + minValue);
	   
   }
   public static int maxNumber(int num1, int num2, int num3, int num4)
   {
	  int max1 = Math.max(num1, num2);
	  int max2 = Math.max(num3, num4);
	  if(max2 > max1)
		  return max2;
	  else
		  return max1;
	  
   }
   
   public static int minNumber(int num1, int num2, int num3, int num4)
   {
	   int min1 = Math.min(num1, num2);
		  int min2 = Math.min(num3, num4);
		  if(min2 < min1)
			  return min2;
		  else 
			  return min1;
	  
   }
}
