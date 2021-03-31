//Find out if the given number is an Armstrong number or not. 

import java.util.*;

class ArmstrongOrNot{
	public boolean armstrongCheck(int num){
		int l=0,n=num,a=num,sum=0;
		while(num!=0){
			l++;
			num/=10;
		}
		while(n!=0){
			int r=n%10;
			sum+=Math.pow(r,l);
			n/=10;
		}
		if(sum==a){
			return true;
		}
		else
			return false;
	}
}

public class Assignment1Q1{
	public static void main(String[] args){
		ArmstrongOrNot a=new ArmstrongOrNot();
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		System.out.println(a.armstrongCheck(n));
	}
}