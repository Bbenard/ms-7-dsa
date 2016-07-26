// Using java solve the problem below:

//Create your own array of integers
// Find the maximum and minimum of this array that you just created.
// create a variable to hold the maximum
// create a variable to hold the minimum
// take in the array of numbers
// begin to loop through them
// put the lowest in its array 
// put the highest in its array
// output the highest then output the lowest
<<<<<<< HEAD


//solution for maximum
```java
import java.util.Arrays;
public class sortt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] x = {45, 12, 9, 89,100 };
        Arrays.sort(x);
        System.out.println("maximu number " +x[x.length-1]);
         System.out.println("minimum number " +x[0]);
}
}
=======
public static void main(String[] args){
		int[] arrayIn = {56,9,21,78,91,64,84,53,25};
		Arrays.sort(arrayIn);
		int min = arrayIn[0];
		int max = arrayIn[arrayIn.length-1];
                
                int[] minA = new int[1];
                int[] maxA = new int[1];
                
                for(int i = 0; i <= arrayIn.length - 1; i++){
                    if (arrayIn[i] <= max){
                        maxA[0] = arrayIn[i];
                    }
                    if (arrayIn[i] <= min){
                        minA[0] = arrayIn[i];
                    }
                }
                System.out.println(Arrays.toString(arrayIn));
                System.out.println("Max integer is " + Arrays.toString(maxA));
                System.out.println("Min integer is " + Arrays.toString(minA));
	}
>>>>>>> bb4ce76288aa4737d502e618ef747e1bc5b6aca5
