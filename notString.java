class notString{
	public String notString(String str) {
		if (str.length() < 3) {
			return "not " + str;
		}

		if (str.substring(0,3).equals("not")) {
			return str;
		}else {
			return "not " + str;
		}
	}

	public static void main(String[] args) {
		notString a = new notString();
		String b = a.notString("not bad");
		String c = a.notString("candy");
		System.out.println(b);
		System.out.println(c);
	}
}