class nearHundred{
	public boolean nearHundred(int n) {
		if (Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		nearHundred a = new nearHundred();
		boolean b;
		b = a.nearHundred(90);
		System.out.println(b);
	}
}