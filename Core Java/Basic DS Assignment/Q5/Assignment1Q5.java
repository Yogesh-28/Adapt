//Calculate the income tax on the basis of following table.

import java.util.*;

class TaxAmount{
    public double calculateTaxAmount(int ctc){
    	if(ctc<=180000)
    		return ctc;

    	else if(ctc>=181001 && ctc<=300000)
    		return ctc*.1;

    	else if(ctc>=300001 && ctc<=500000)
    		return ctc*.2;

    	else if(ctc>=500001 && ctc<=1000000)
    		return ctc*.03;
    	else
    		return 0;
    }
}
public class Assignment1Q5 {
    public static void main(String args[]) {
    	TaxAmount a= new TaxAmount();
    	Scanner scanner=new Scanner(System.in);
    	int ctc=scanner.nextInt();
    	System.out.println(a.calculateTaxAmount(ctc));
    }
}