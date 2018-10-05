import java.util.Random;

public class SockMaker extends Thread{
	SockStorage storage;
	
	int totalNumberOfSocks;
	int socksLeft;
	
	int redSocks;
	int greenSocks;
	int blueSocks;
	int orangeSocks;
	
	public SockMaker(SockStorage storage){
		this.storage = storage;
	}

	@Override
	public void run() {
		Random rand = new Random();
		totalNumberOfSocks = rand.nextInt(100);
		socksLeft = totalNumberOfSocks;
		redSocks = rand.nextInt(socksLeft);
		socksLeft -= redSocks;
		greenSocks = rand.nextInt(socksLeft);
		socksLeft -= greenSocks;
		blueSocks = rand.nextInt(socksLeft);
		socksLeft -= blueSocks;
		orangeSocks = socksLeft;
		
		storage.put(redSocks, 0);
		storage.put(greenSocks, 1);
		storage.put(blueSocks, 2);
		storage.put(orangeSocks, 3);
		
		System.out.println("Thread: "+ Thread.currentThread().getName() + " made a total of " + totalNumberOfSocks + " socks"
				+ "; blue socks: " + blueSocks
				+ "; red socks: " + redSocks
				+ "; green socks: " + greenSocks
				+ "; orange socks: " + orangeSocks);
		try {
			this.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int getRedSocks() { 
		return redSocks;
	}
	public int getGreenSocks() { 
		return greenSocks;
	}
	public int getBlueSocks() { 
		return blueSocks;
	}
	public int getOrangeSocks() { 
		return orangeSocks;
	}

}
