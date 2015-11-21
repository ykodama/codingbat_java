class diff21{
	public int diff21(int n) {
		if (n > 21){
			return 2 * Math.abs(n - 21);
		}else {
			return Math.abs(n - 21);
		}
	}

	public static void main(String[] args){
		diff21 d = new diff21();
		int a;
		a = d.diff21(19);
		System.out.println(a);
	}
}