// Given a number, find the next higher number using only the digits in the given number. 
//For example if the given number is 1508, the next higher number with same digits is 8510.
solution
~~~java
public class NewMain2 {

    /**
     * @param args the command line arguments
     */
    public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int swap=0;
           int num=100;
        int i=String.valueOf(num).length();
        int k=0;
        int[]numbers=new int[i];
        while (k< i) {
            
   numbers[k] = num % 10;
    num = num / 10;
    k++;
}
   Arrays.sort(numbers); 
   swap=numbers[numbers.length-1];
   
   numbers[numbers.length-1]=numbers[0];
   numbers[0]=swap;
     for (int digit :numbers ) {
   System.out.print(digit );
   } 
    }
}
