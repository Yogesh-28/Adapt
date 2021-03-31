//There is an Array which is of the size 15, which may or may not be sorted. You should write a program to accept a number and search if it in contained in the array

import java.util.*;

class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue){
        int a=0;
    	for(int i=0;i<15;i++){
    		if(arr[i]==toCheckValue)
    			a=1;
    	}
        if(a==1)
            return true;
        else 
            return false;
    }
}

public class Assignment1Q7 {
    public static void main(String[] args) {
        int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int valueToCheck = 19;
        SearchArray a=new SearchArray();
        System.out.println(a.searchArray(arr,valueToCheck));
    }
}
   