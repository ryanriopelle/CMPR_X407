/**
 *  20.2 - Find duplicate
 *
 * 1. print all duplicates exactly once
 * 2. returns exact number of unique duplicates
 * 3. Given array should be intact at the end
 * 4. We need O(n) time and O(1) space algorythm
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

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
        // Basic
        int size = a.length;
        int i, j;
//        List<Integer> dups = new ArrayList<Integer>();
        Set<Integer> dups = new HashSet<Integer>();
        System.out.println("Repeated Elements are :");
        for (i = 0; i < size; i++)
        {
            for (j = i + 1; j < size; j++)
            {
                if (a[i] == a[j])
                    dups.add(a[i]);
                // use a linked list here and loop through the link list
            }
        }
//        int len = 0;
//        for (i = 0; i < size; i++)
        return dups.size();
    }

    public int alg_ntime_n_space() {
        // Use count array
        //Time: O(n) Space: O(n)
        //traverse through array, fill HashMap(array[i],frequency of array[i]) , where i = index;
        //traverse through array again:
        // if HashMap value==2, add to list
        // else do nothing

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
        // Use count array
        //Time: O(n) Space: O(n)
        //traverse through array, fill HashMap(array[i],frequency of array[i]) , where i = index;
        //traverse through array again:
        // if HashMap value==2, add to list
        // else do nothing

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

    public static void main(String[] args) {
        // Nothing can be changed here
        System.out.println("duplicate problem STARTS");
        duplicateN m = new duplicateN();
        System.out.println("You now understand why we should reduce O(n^2) algorithm to O(n) algorithm");
        System.out.println("dulicateN problem ENDS");
        }
}