package DSA;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,1};

        Set<Integer> set=new HashSet<>();

        for(int temp:arr){
            set.add(temp);

        }
        System.out.println(set);
    }
}
