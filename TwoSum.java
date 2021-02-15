import java.util.*;

public class TwoSum{

    public static int [] twoSum(int[] sum, int targ)
    {
        //Create a Hashmap to store the integers in.
        Map<Integer, Integer> numMap = new HashMap<>();
        
        //Loop through all the indices in the array
        for (int i = 0; i < sum.length; i++) {
        
            /*
            Define the complement- the value that would 
            pair with the int at index i in order to sum to the 
            parameter target*/
            int valNeeded = targ - sum[i];
            
            //Check if the hashmap contains the value that matches.
            //This is the hashmap that stores the ints already put in.
            //If it does, we return that value's index along with index i.
            if (numMap.containsKey(valNeeded)) {
                return new int[] { numMap.get(valNeeded), i };
            } else {
            //Here we put in the ints from the array. 
            //We will compare to other ints in search of a match.
                numMap.put(sum[i], i);
            }
        }
        return new int[] {-1};
    }
    public static void main(String []args){
        //Here is a test case.
        int[] ji= new int[] {4,2,6,1,2,3,5,6,8,4,6,};
        System.out.println(Arrays.toString(twoSum(ji, 5)));
        //Here is another test case.
        int[] oijoj = new int[] {3};
        System.out.println(Arrays.toString(twoSum(oijoj, 1000)));
     }
}
