package Interface;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static java.util.Collections.reverseOrder;

public class Solution{
    public static void main(String[] args)  {
        Integer names [] = new Integer[]{1 , 2 , 3, 4, 5};
        Arrays.sort(names, Collections.reverseOrder());
        for(int i = 0; i <  names.length; i++) {
            System.out.print(names[i] + "  ");
        }
    }
}
