//Accept the marks of three students for the subject say A, B, C. Find the total scored and the average in all the subjects.
//Also Find the Total and Average scored by students in each respective Subject.

import java.util.*;

public class Assignment1Q9 {
    public static void main(String[] args) {
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("Enter Student 1 records: ");
    	int s1m1=scanner.nextInt();
    	int s1m2=scanner.nextInt();
    	int s1m3=scanner.nextInt();
    	int s1=s1m1+s1m2+s1m3;
    	System.out.println("Enter Student 2 records: ");
    	int s2m1=scanner.nextInt();
    	int s2m2=scanner.nextInt();
    	int s2m3=scanner.nextInt();
    	int s2=s2m1+s2m2+s2m3;
    	System.out.println("Enter Student 3 records: ");
    	int s3m1=scanner.nextInt();
    	int s3m2=scanner.nextInt();
    	int s3m3=scanner.nextInt();
    	int s3=s3m1+s3m2+s3m3;
    	System.out.println("Total marks of all the students in all subjects: "+(s1+s2+s3));
    	System.out.println("Average marks of all the students in all subjects: "+((s1+s2+s3)/3));
    	System.out.println("Total marks scored by students in subject A: "+(s1m1+s2m1+s3m1));
    	System.out.println("Average marks scored by students in subject A: "+((s1m1+s2m1+s3m1)/3));
    	System.out.println("Total marks scored by students in subject B: "+(s1m2+s2m2+s3m2));
    	System.out.println("Average marks scored by students in subject B: "+((s1m2+s2m2+s3m2)/3));
    	System.out.println("Total marks scored by students in subject C: "+(s1m3+s2m3+s3m3));
    	System.out.println("Average marks scored by students in subject C: "+((s1m3+s2m3+s3m3)/3));
    }
}