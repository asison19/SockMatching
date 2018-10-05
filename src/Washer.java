
public class Washer extends Thread{
	int reds;
	int greens;
	int blues;
	int oranges;
	
	public Washer(int reds, int greens, int blues, int oranges) {
		this.reds = reds;
		this.greens = greens;
		this.blues = blues;
		this.oranges = oranges;
		
	}
	
	public void run() {
		System.out.println("Thread: "+ Thread.currentThread().getName() + " has "
				+ "\nDestroyed " + reds + " pairs of red socks"
				+ "\nDestroyed " + greens + " pairs of green socks"
				+ "\nDestroyed " + blues + " pairs of blue socks"
				+ "\nDestroyed " + oranges + " pairs of orange socks");
	}

}
