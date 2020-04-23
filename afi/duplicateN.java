/**
 *  20.2 - Find duplicate
 *
 * 1. print all duplicates exactly once
 * 2. returns exact number of unique duplicates
 * 3. Given array should be intact at the end
 * 4. We need O(n) time and O(1) space algorithm
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

class duplicateN extends duplicateNBase{
    duplicateN(){
        //Nothing can be changed here
        testBed();
    }

    @Override
    protected int nsquare_time_constant_space(){
        // NOTHING CAN BE CHANGE: O(n^2) time O(1) space
        return alg_nsquare_time_constant_space();
    }

    @Override
    protected int ntime_n_space(){
        //NOTHING CAN BE CHANGED HERE: O(N) time O(N) space
        return alg_ntime_n_space();
    }

    @Override
    protected int ntime_constant_space(){
        // NOTHING CAN BE CHANGED HERE: O(N) time O(1) space
        return alg_ntime_constant_space();
    }

    // You can have any number of private data structures and procedures
    // You write code below. Do not cram entire code in one procedure

    // function to find and print duplicates
    private int alg_nsquare_time_constant_space() {
        int size = a.length;
        int i, j;
        Set<Integer> dups = new HashSet<Integer>();
        for (i = 0; i < size; i++)
        {
            for (j = i + 1; j < size; j++)
            {
                if (a[i] == a[j])
                    dups.add(a[i]);
            }
        }
        return dups.size();
    }

    public int alg_ntime_n_space() {
        int size = a.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<size; i++){
            map.put(a[i], map.getOrDefault(a[i], 0)+1);
            if(map.get(a[i])==2)
                list.add(a[i]);
        }
        return list.size();
    }
    
    private int alg_ntime_constant_space() {
        // Create an array b[] of same size as a[]
        int numRay[] = new int[a.length];
        // Copy elements of a[] to b[]
        for (int i=0; i<a.length; i++)
            numRay[i] = a[i];
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < numRay.length; i++) {
            numRay[numRay[i] %  numRay.length] = numRay[numRay[i] %  numRay.length] + numRay.length;
        }
        for (int i = 0; i < numRay.length; i++) {
            if (numRay[i] >= numRay.length*2) {
                ans.add(i);
            }
        }
        return ans.size();
    }

        public static void main(String[] args) {
        // Nothing can be changed here
        System.out.println("duplicate problem STARTS");
        duplicateN m = new duplicateN();
        System.out.println("You now understand why we should reduce O(n^2) algorithm to O(n) algorithm");
        System.out.println("dulicateN problem ENDS");
        }
}