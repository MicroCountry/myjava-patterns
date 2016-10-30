package MyJava.patterns.simple.factory;

import MyJava.patterns.common.log.Logger;

public class Apple implements Fruit {

	private int treeAge;
	
	@Override
	public void grow() {
		Logger.log("Apple is growing!");
	}

	@Override
	public void harvest() {
		Logger.log("Apple has harvested!");
	}

	@Override
	public void plant() {
		Logger.log("Apple has planted!");
	}

	public int getTreeAge() {
		return treeAge;
	}

	public void setTreeAge(int treeAge) {
		this.treeAge = treeAge;
	}
}
