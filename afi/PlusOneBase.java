import java.util.ArrayList;

/**
 * File Name: PlusOneBase.java Java11 To Compile: IntUtil.java RandomInt.java
 * PlusOneBase.java
 * 
 * @author Jagadeesh Vasudevamurthy
 * @year 2019
 */

/*
 * YOU CANNOT CHANGE ANYTHING IN THIS FILE. READ ONLY
 */

abstract class PlusOneBase {
	protected IntUtil u = new IntUtil();

	// I don't know how to write it
	// Override by the concrete class
	abstract void plusOne(ArrayList<Integer> a);

	abstract int[] plusOne(int[] a);

	// abstract String PlusOne(String s) ;

	protected void testBench() {
		simpleTests();
	}

	private ArrayList<Integer> buildArrayList(int[] b) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i : b) {
			a.add(i);
		}
		return a;
	}

	private ArrayList<Integer> buildArrayList(int n) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		if (n < 10) {
			a.add(n);
		} else {
			while (n != 0) {
				a.add(n % 10);
				n = n / 10;
			}
			int j = a.size() - 1;
			int i = 0;
			while (i < j) {
				int t = a.get(i);
				a.set(i, a.get(j));
				a.set(j, t);
				i++;
				j--;
			}
		}
		return a;
	}

	/*
	 * Time: THETA(n) Space: THETA(1)
	 */

	private void check(ArrayList<Integer> a, int[] b) {
		u.myassert(a.size() == b.length);
		int j = 0;
		for (int i : b) {
			u.myassert(a.get(j++) == i);
		}
	}

	private void check(ArrayList<Integer> a, ArrayList<Integer> b) {
		u.myassert(a.size() == b.size());
		int j = 0;
		for (int i : b) {
			u.myassert(a.get(j++) == i);
		}
	}

	private void check(int[] a, int[] b) {
		u.myassert(a.length == b.length);
		int j = 0;
		for (int i : b) {
			u.myassert(a[j++] == i);
		}
	}

	private void testOne(int b[], int e[]) {
		ArrayList<Integer> a = buildArrayList(b);
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.print(" + 1 = ");
		plusOne(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		check(a, e);
	}

	private void testOne(int n) {
		ArrayList<Integer> a = buildArrayList(n);
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.print(" + 1 = ");
		plusOne(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		ArrayList<Integer> e = buildArrayList(n + 1);
		check(a, e);
	}

	private void testOneArray(int n) {
		ArrayList<Integer> a = buildArrayList(n);
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.print(" + 1 = ");

		int[] b = new int[a.size()];
		int j = 0;
		for (int i : a) {
			b[j++] = i;
		}
		int[] ans = plusOne(b);
		for (int i : ans) {
			System.out.print(i + " ");
		}
		System.out.println();

		ArrayList<Integer> e = buildArrayList(n + 1);
		int[] expected = new int[e.size()];
		int k = 0;
		for (int i : e) {
			expected[k++] = i;
		}
		check(ans, expected);
	}

	private void simpleTests() {
		{
			int a[] = { 1, 2, 3 };
			int e[] = { 1, 2, 4 };
			testOne(a, e);
		}

		{
			int a[] = { 1, 7, 8, 9 };
			int e[] = { 1, 7, 9, 0 };
			testOne(a, e);
		}

		{
			int a[] = { 9, 9 };
			int e[] = { 1, 0, 0 };
			testOne(a, e);
		}
		{
			int n = 999;
			testOne(n);
		}
		{
			System.out.println("Testing ArrayList version starts");
			int N = 1000;
			for (int i = 0; i < N; ++i) {
				testOne(i);
			}
			System.out.println("Testing ArrayList version ends");
		}
		{
			System.out.println("Testing array version starts");
			int N = 1000;
			for (int i = 0; i < N; ++i) {
				testOneArray(i);
			}
			System.out.println("Testing array version ends");
		}
	}

	public static void main(String[] args) {
		System.out.println("PlusOneBase.java STARTS");
		String version = System.getProperty("java.version");
		System.out.println("Java version used for this program is " + version);
		System.out.println("You cannot instantiate PlusOneBase class: PlusOneBase p = new PlusOneBase() ; ");
		// PlusOneBase p = new PlusOneBase() ;
		System.out.println("PlusOneBase.java ENDS");
	}
}