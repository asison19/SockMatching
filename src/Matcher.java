
public class Matcher extends Thread{
	
	SockStorage storage;
	int pairsOfRed = 0;
	int pairsOfGreen = 0;
	int pairsOfBlue = 0;	
	int pairsOfOrange = 0;
	
	public Matcher(SockStorage storage) {
		this.storage = storage;
	}
	
	@Override
	public void run() {
		
		pairsOfRed = storage.redSocks / 2;
		pairsOfGreen = storage.greenSocks / 2;
		pairsOfBlue = storage.blueSocks / 2;
		pairsOfOrange = storage.orangeSocks / 2;
		
		Washer washer = new Washer(pairsOfRed,pairsOfGreen,pairsOfBlue,pairsOfOrange);
		washer.start();
	}

}