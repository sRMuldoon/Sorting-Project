/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author Danny
 */
public class bubble {

    public static int[] sort(int[] n) {
        int a;
        boolean flag = true;  
        int temp;   
        while (flag) {
            flag = false;    
            for (a = 0; a < n.length - 1; a++) {
                if (n[a] < n[a + 1]) {
                    temp = n[a];                
                    n[a] = n[a + 1];
                    n[a + 1] = temp;
                    flag = true;                
                }
            }
        }
        return n;
    }
}
