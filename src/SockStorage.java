
public class SockStorage {
	int redSocks;
	int greenSocks;
	int blueSocks;
	int orangeSocks;
	
	private boolean empty = true;
	
	SockStorage(){
		int redSocks = 0;
		int greenSocks = 0;
		int blueSocks = 0;
		int orangeSocks = 0;
	}
	
	public synchronized void put(int amount, int colourNumber) {
		switch(colourNumber) {
		case 0:
			redSocks += amount;
			break;
		case 1:
			greenSocks += amount;
			break;
		case 2:
			blueSocks += amount;
		case 3:
			orangeSocks += amount;
		}
	}
	
	public synchronized void take() {
		while(empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			empty = true;
			
			notifyAll();
			
			
		}
	}
	
}
