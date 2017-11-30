/**
 * Selection Sort
 * Author: Sean Muldoon
 */
package sorting;

/**
 *
 * @author 069986115
 */
public class Selection {
    
    /**
     * Method to sort a set of data by finding the minimum value in the set repeatedly
     * (selection sort)
     * @param toSort array of Comparable objects to be sorted
     * @param smallToLarge Boolean object determining the order of the sorted array;
     *  if true, return smallest to largest, else return largest to smallest
     * @return sorted form of the parameter array
     */
    public static Comparable [] sort(Comparable [] toSort, Boolean smallToLarge){
        //Initialize variable to store index of min/max
        int temp = 0;
        //Initialize comparison variable to first element of array
        Comparable comp = toSort[0];
        //Convert Boolean to positive/negative int modifier
        int mod = smallToLarge.compareTo(!smallToLarge);
        //Use nested for loops to repeatedly find min or max of data for array's length
        for(int i=(toSort.length-1)*-smallToLarge.compareTo(true); (smallToLarge && i<toSort.length) || (!smallToLarge && i>0); i+=mod){
            for(int j = i; (smallToLarge && j<toSort.length) || (!smallToLarge && j>0); j+=mod)
                //Use XOR and boolean parameters to handle both directions of sorting
                if(comp.compareTo(toSort[j])<0^smallToLarge){
                    comp = toSort[j];
                    temp=j;
                }
            //Set return variable to comparison variable
            toSort[temp]=toSort[i];
            toSort[i]=comp;
        }
        System.out.println(toSort[0]);
        return toSort;
    }
}
