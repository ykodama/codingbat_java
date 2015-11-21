class sleepIn{

	public boolean sleepIn(boolean weekday, boolean vacation) {
		if (!weekday || vacation){
			return true;
		}

		return false;
	}

	public static void main(String args[]){
		sleepIn s = new sleepIn();
		boolean a;
		a = s.sleepIn(true, false);
		System.out.println(a);
	}

}