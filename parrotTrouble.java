class parrotTrouble{
	public boolean parrotTrouble(boolean talking, int hour) {
		if (talking && (hour < 7 || hour > 20)){
			return true;
		}else {
			return false;
		}
	}

	public static void main(){
	}
}