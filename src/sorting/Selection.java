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
     * @param smallToLarge boolean determining the order of the sorted array;
     *  if true, return smallest to largest, else return largest to smallest
     * @return sorted form of the parameter array
     */
    public static Comparable [] sort(Comparable [] toSort, boolean smallToLarge){
        //Initialize return variable using length of parameter
        Comparable [] temp = new Comparable [toSort.length];
        //Initialize comparison variable to first element of array
        Comparable comp = toSort[0];
        //Use nested for loops to repeatedly find min or max of data for array's length
        for(int i = 0; i<toSort.length; i++){
            for(int j = 0; j<toSort.length; j++)
                //Use XOR and boolean parameters to handle both directions of sorting
                if(comp.compareTo(toSort[j])<0^smallToLarge)
                    comp = toSort[j];
            //Set return variable to comparison variable
            temp[i]=comp;
        }
        System.out.println(temp[0]);
        return temp;
    }
}
