class sumDouble{
	public int sumDouble(int a, int b) {
		if (a == b){
			return 2 * (a + b);
		}else{
			return a + b;
		}
	}

	public static void main(String[] args) {
		sumDouble s = new sumDouble();
		int a;
		a = s.sumDouble(2, 2);
		System.out.println(a);
	}
}