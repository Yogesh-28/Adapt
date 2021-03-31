//Find out the simple as well as the compound interest of supplied value

import java.util.*;

class SiCi{
    public double simpleInterest(double principalAmount,int time,double interestRate){
    	return (principalAmount*time*interestRate)/100;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
    	return (Math.pow(principalAmount*(1+interestRate),time)-principalAmount);
    }
}

public class Assignment1Q3 {
    public static void main(String args[]){
    	Scanner scanner=new Scanner(System.in);
    	double p=scanner.nextInt();
    	int t=scanner.nextInt();
    	double r=scanner.nextInt();
    	SiCi sici=new SiCi();
    	System.out.println("S.I= "+ sici.simpleInterest(p,t,r));
    	System.out.println("C.I= "+ sici.compoundInterest(p,t,r));
    }
}