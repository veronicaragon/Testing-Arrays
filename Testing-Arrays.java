import java.util.Scanner;

public class MiniLab3 {
	
	public static void main (String[] args) {

		//test case method 1
        int[] q = {2,5,6};
        boolean p = method1(q);
        System.out.println("\nTesting method 1: Expecting true Got : " + p );

		//test case method 2
    	int[] a = {1,4,5};
        int[] b = {3,4,5,6};
        int[] c = method2(a,b);
        System.out.println("Testing method 2: Expecting 1,3. Got : " + c[0]  +" "+ c[1]);

		//test case method 3
    	int[] s = {9,5,6};
    	int[] o = method3(s);
   		System.out.println("\nTesting method 3: Expecting 9,9,9 Got : " + o[0]  + " " + o[1] + " " + o[2]);
    
		//test case method 4
    	int[] addNumbers = {1,2,6,4,5,7,9};
    	int total = method4(addNumbers);
    	System.out.println("\nTesting method 1: Expecting 19 Got : " + total );

	}

	public static boolean method1(int[] check6) {
        if(check6[0] == 6 || check6[check6.length-1] == 6){
            return true;
        }
        else {
            return false;
        }
    }

	public static int[] method2(int[] a, int[] b) {
        int[] newArray = new int[1];
        int[] newerArray = new int[2];

        if (a.length == 0 && b.length == 0) {   //case for when both equal 0 
            int[] emptyArray = new int [0];
            return emptyArray;              //return a new array, which is empty
        }
        
        if (a.length == 0 || b.length == 0) {   //case for when one equals 0
            if (a.length == 0 ) {           //case for when a length equals 0
                newArray[0] = b[0];        //create new array with first element of b
            }   
            else if (b.length == 0 ) {      //case for when b length equals 0
                newArray[0] = a[0];        //create new array with first element of a
            }
        }

        if (a.length > 0 && b.length > 0) { // when both lengths have an element
            newerArray[0] = a[0];  			// set first index to first element of a
            newerArray[1] = b[0];		// set second index to first element of b
            return newerArray;

        }
        return newArray;
    }

	public static int[] method3(int[] array3) {
        
        if (array3[0] >= array3[array3.length-1]) { //if 1st element is greater than last
            array3[1] = array3[0]; //change 2nd number to the first
            array3[2] = array3[0]; //change 3rd number to the first
        } 
        else if (array3[0] < array3[array3.length-1]) { //if last element is greater than 1st
            array3[0] = array3[array3.length-1]; // change 1st number to last
            array3[1] = array3[array3.length-1]; //change 2nd number to first
        }
        return array3;
    }

	public static int method4(int[] sumArray) {
    int sum = 0;
    boolean add = true; //means add

    for (int i = 0; i < sumArray.length; i++){

        if (sumArray[i] == 6){
            add = false;
        }
        if (sumArray[i] == 7){
            add = true;
        }

        if (add == true) {
            sum = sumArray[i] + sum;
        } 
    }
    return sum;
    }
}
