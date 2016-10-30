package MyJava.patterns.prototype;

import java.io.Serializable;

public class GoldRingedStaff implements Serializable{
	/**
	 * 
	 */
	private float height=100.0F;
	private float diameter=10.0F;
	public GoldRingedStaff(){
		
	}
	
	public void grow(){
		this.height*=2.0;
		this.diameter*=2;
	}
	
	public void shrink(){
		this.height/=2;
		this.diameter/=2;
	}
	
	public void move(){}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getDiameter() {
		return diameter;
	}

	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}
	
	
}
