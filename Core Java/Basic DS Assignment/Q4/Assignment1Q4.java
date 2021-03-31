//Supply marks of three subject and declare the result, result declaration is based on below conditions:
//Condition 1: -All subjects marks is greater than 60 is Passed
//Condition 2: -Any two subjects marks are greater than 60 is Promoted
//Condition 3: -Any one subject mark is greater than 60 or all subjects’ marks less than 60 is failed.

import java.util.*;

class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
    	int a=0;
    	if(subject1Marks>60)
    		a++;
    	if(subject2Marks>60)
    		a++;
    	if(subject3Marks>60)
    		a++;
    	if(a==3)
    		return "Passed";
    	else if(a==2)
    		return "Promoted";
    	else
    		return "Failed";
    }
}
public class Assignment1Q4 {
    public static void main(String[] args) {
    	ResultDeclaration a= new ResultDeclaration();
    	Scanner scanner=new Scanner(System.in);
    	double n=scanner.nextDouble();
    	double n2=scanner.nextDouble();
    	double n3=scanner.nextDouble();
    	System.out.println(a.declareResults(n,n2,n3));
    }
}