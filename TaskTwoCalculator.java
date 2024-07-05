import java.lang.annotation.AnnotationTypeMismatchException;
import java.util.*;

public class TaskTwoCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the 1st value");
		int n1=sc.nextInt();
		System.out.println("Please enter arithmetic opporetor Symbal");
		String symbal;
		while(true) {
			try {
			symbal=sc.next();
		switch(symbal){
			case"+":
				System.out.println("enter the 2nd value");
				int n2=sc.nextInt();
				int res1=n1+n2;
			System.out.println("result :"+n1+"+"+n2+"="+res1);
			break;
			case"-":
				System.out.println("enter the 2nd value");
				int n3=sc.nextInt();
				int res2=n1-n3;
			System.out.println("result :"+n1+"-"+n3+"="+res2);
			break;
			case"*":
				System.out.println("enter the 2nd value");
				int n4=sc.nextInt();
				int res3=n1*n4;
			System.out.println("result :"+n1+"*"+n4+"="+res3);	
			break;
			case"/":System.out.println("enter the 2nd value");
			int n5=sc.nextInt();
				int res4=n1/n5;
			System.out.println("result :"+n1+"/"+n5+"="+res4);
			break;
			default:
				System.err.println("please enter correct Symbal");
		}
			}
		catch (AnnotationTypeMismatchException ea) {
			sc.next();
			
		}
		
		}
	}
	