
public class Elemento {
	boolean[] paredes;
	
	public Elemento(boolean top, boolean right, boolean bottom, boolean left) {
		paredes = new boolean[] {top, right, bottom, left};
	}
	
	public boolean hasTopParede() {
		return paredes[0];
	}
	
	public boolean hasRightParede() {
		return paredes[1];
	}
	
	public boolean hasBottomParede() {
		return paredes[2];
	}
	
	public boolean hasLeftParede() {
		return paredes[3];
	}
}
