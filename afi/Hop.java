/**
 * File Name: Hop.java
 * Hop concrete class
 *
 *
 * To Compile: IntUtil.java RandomInt.java Hop.java HopBase.java
 *
 * 	/*
 * 	 * WRITE CODE IN alg
 * 	 *  YOU CANNOT USE ANY static variable in this function
 * 	 *  YOU can use many local variables inside the function
 * 	 *  Cannot use any loop statements like:  for, while, do, while, go to
 * 	 *  Can use if
 * 	 *  ONLY AFTER THE execution of this routine array s MUST have the same contents as you got it.
 * 	 *  YOU cannot call any subroutine inside this function except alg itself
 * 	 *
 *          */


class Hop extends HopBase{
	//You cannot have any functions or data here
	Hop() {
		//NOTHING CAN BE CHANGED HERE
		testBed();
	}

//	public static int hopNum = 0;

	@Override
  	int hopSmart(int [] s, int x) {
		//NOTHING CAN BE CHANGED HERE
    	return alg(s,x);
	}

	private int alg(int [] s, int x) {
		int hopNum = 0;
		void do_count(int [] s, int x, hopNum){
			// Base case
			if (s[x] == x || hopNum>=s.length){
				return hopNum;
			}
			else {
				return do_count(s,s[x], hopNum+1);
			}
		}
		return hopNum;
	}

	public static void main(String[] args) {
		//NOTHING CAN BE CHANGED HERE
		System.out.println("Hop problem STARTS");
		Hop m = new Hop() ;
		System.out.println("All Hop tests passed. You are great");
		System.out.println("Hop problem ENDS");
	}
}