// Using java solve the problem below:

//Create your own array of integers
// Find the maximum and minimum of this array that you just created.
// create a variable to hod the maximum
// create a variable to hold the minimum
// take in the array of numbers
// begin to loop through them
// put the lowest in its array 
// put the highest in its array
// output the highest then output the lowest


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
