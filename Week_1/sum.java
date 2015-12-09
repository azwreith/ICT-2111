import java.io.*;
import java.util.*;

class sum{

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		System.out.println("Type values of n: ");
		int n=scan.nextInt();
		float sum=0;
		for(int i=1;i<=n;i++){
			sum+=Math.pow((float)1/i,i);	
		}		
		System.out.println("Answer is: " +sum);
	}

}