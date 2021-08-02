package Frames;
import java.util.EventObject;

public class ColorEvent extends EventObject {

	private int redVal;
	private int greenVal;
	private int blueVal;
	
	public ColorEvent(Object source, int redVal, int greenVal, int blueVal) {
		super(source);
		
		this.redVal = redVal;
		this.greenVal = greenVal;
		this.blueVal = blueVal;
	}

	public int getRedVal() {
		return redVal;
	}

	public int getGreenVal() {
		return greenVal;
	}

	public int getBlueVal() {
		return blueVal;
	}
	
}
