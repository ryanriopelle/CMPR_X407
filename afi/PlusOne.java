import java.util.ArrayList;

/**
 * File Name: PlusOne.java PlusOne concrete class
 * Problem 20.4
 * a={1,2,3)
 * return b = {1,2,4}
 * a= {9,9}
 * return b= {1,0,0}
 */

class PlusOne extends PlusOneBase {
	PlusOne() {
		// NOTHING CAN BE CHANGED HERE
		testBench();
	}

	@Override
	protected void plusOne(ArrayList<Integer> a){
		// NOTHING CAN BE CHANGED HERE
		Integer[] digits = a.toArray(new Integer[0]);
		System.out.println("Digits: "+ digits);
		if(digits[digits.length-1]<9){
			digits[digits.length-1]++;
		}

		ArrayList<Integer> li = new ArrayList<Integer>();
		for(int i=digits.length-1; i>=0; i--){
			li.add(digits[i]);
		}

		addOne(li, 0);
		int[] r = new int[li.size()];
		for(int i=0; i<r.length; i++){
			r[i] = li.get(r.length-1-i);
		}
//		return r;
	}

	@Override
	int[] plusOne(int[] digits){
//		return alg(a)
		if(digits[digits.length-1]<9){
			digits[digits.length-1]++;
			return digits;
		}
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i=digits.length-1; i>=0; i--){
			l.add(digits[i]);
		}
		addOne(l,0);
		int[] r = new int[l.size()];
		for(int i=0; i<r.length; i++){
			r[i] = l.get(r.length-1-i);
		}

		return r;
	}

	private void addOne(ArrayList<Integer> l, int idx){
		if(l.size()==idx){
			l.add(1);
			return;
		}

		int t = l.get(idx);
		if(t<9){
			l.set(idx, t+1);
		}else{
			l.set(idx, 0);
			addOne(l, idx+1);
		}
	}


	public static void main(String[] args) {
		// NOTHING CAN BE CHANGED HERE
		System.out.println("PlusOne problem STARTS");
		PlusOne m = new PlusOne();
		System.out.println("All PlusOne tests passed. Bring me a gift");
		System.out.println("PlusOne problem ENDS");
	}
}
