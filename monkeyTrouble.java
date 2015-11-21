class monkeyTrouble{

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if (aSmile && bSmile){
			return true;
		}else if (!aSmile && !bSmile){
			return true;
		}else{
			return false;
		}
	}

	public static void main(String args[]){
		monkeyTrouble a = new monkeyTrouble();
		boolean b;
		b = a.monkeyTrouble(true, false);
		System.out.println(a);
	}

}