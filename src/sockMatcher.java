

public class sockMatcher{
	
	SockStorage storage = new SockStorage();
	
	public static void main(String[] args) {
		
		SockStorage storage = new SockStorage();
		
		Matcher matcher = new Matcher(storage);
		
		SockMaker sockMaker0 = new SockMaker(storage);
		SockMaker sockMaker1 = new SockMaker(storage);
		SockMaker sockMaker2 = new SockMaker(storage);
		SockMaker sockMaker3 = new SockMaker(storage);
		
		sockMaker0.start();
		sockMaker1.start();
		sockMaker2.start();
		sockMaker3.start();
		
		
		while(sockMaker0.isAlive() && sockMaker1.isAlive() && sockMaker2.isAlive() && sockMaker3.isAlive()) {
			try {
			sockMaker0.join();
			sockMaker1.join();
			sockMaker2.join();
			sockMaker3.join();
			
			matcher.start();
			} catch(InterruptedException ie) {
				
			}
		}
	}

}
