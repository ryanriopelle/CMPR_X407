/**
 * File Name: LookAndSay.java 
 * LookAndSay concrete class
 */

class LookAndSay extends LookAndSayBase{
	LookAndSay() {
	 //NOTHING CAN BE CHANGED HERE
		testBed() ;
	}
	
	@Override
	protected String lookAndSay(String s) {
		//NOTHING CAN BE CHANGED HERE
		return alg(s) ;
	}

	@Override
	protected String lookAndSay(int n) {
		//NOTHING CAN BE CHANGED HERE
		return alg(n) ;
	}
	
	private String alg(String s) {
		String s1 = getNextFromS(s);
		return s1;
	}

	private String alg(int n) {
		String s1 = new String("1");
		for (int i = 1 ; i < n; ++i) {
			s1 = getNextFromS(s1);
		}
		return s1;
	}

	private String getNextFromS(String s){
		StringBuffer n = new StringBuffer();
		int l = s.length() ;
		if (l>0){
			// at least one
			char pc = s.charAt(0);//previous char
			int pk = 1 ; //Prev kount
			for (int i=1; i<l; ++i){
				char nc = s.charAt(i);
				if (pc == nc){
					++pk;
				}else{
					append(n, pk , pc);
					pc = nc;
					pk=1;
				}
			}
			append(n,pk, pc);
			String ns = new String(n);
			return ns;
		}
		return("");
	}

	private void append(StringBuffer n, int k, char c){
		n.append(k); //append kount
		n.append(c); //current char
	}

	public static void main(String[] args) {
		//NOTHING CAN BE CHANGED HERE
		System.out.println("LookAndSay problem STARTS");
		LookAndSay m = new LookAndSay() ;
		System.out.println("All LookAndSay tests passed. You are genius");
		System.out.println("LookAndSay problem ENDS");
	}
}
