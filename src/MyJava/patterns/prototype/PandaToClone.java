package MyJava.patterns.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PandaToClone implements Cloneable {
	private int height,weight,age;

	public PandaToClone(int height,int weight){
		this.age = 0;
		this.height = height;
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public Object clone(){
		PandaToClone temp = new PandaToClone(height,weight);
		temp.setAge(age);
		return temp;
	}
	
	public Object deepClone() throws IOException, ClassNotFoundException{
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		ObjectOutputStream oo =  new ObjectOutputStream(bo);
		oo.writeObject(this);
		ByteArrayInputStream bi=new ByteArrayInputStream(bo.toByteArray());
		ObjectInputStream oi =new ObjectInputStream(bi);
		return oi.readObject();
	}
}
