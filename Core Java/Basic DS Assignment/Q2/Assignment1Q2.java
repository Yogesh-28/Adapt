//Find out all the Armstrong numbers falling in the range of 100-999

import java.util.*;

class ArmstrongNumBetweenRange{
    public static void armstrongNumbersInRange(int min , int max){
    	for(int i=min;i<max;i++){
    		int l=0,n=i,a=i,b=i,sum=0;
    		while(b!=0){
				l++;
				b/=10;
			}
			while(n!=0){
				int r=n%10;
				sum+=Math.pow(r,l);
				n/=10;
			}
			if(sum==a)
				System.out.println(a);
    	}
    }
}

public class Assignment1Q2 {
    public static void main (String [] args) {
       int min = 100;int max = 999;
       ArmstrongNumBetweenRange a= new ArmstrongNumBetweenRange();
       a.armstrongNumbersInRange(min,max);
    }
}