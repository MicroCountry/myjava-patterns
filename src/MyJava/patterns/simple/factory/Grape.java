package MyJava.patterns.simple.factory;

import MyJava.patterns.common.log.Logger;

public class Grape implements Fruit{
	private boolean seedless;
	
	@Override
	public void grow() {
		Logger.log("Grape is growing!");
	}

	@Override
	public void harvest() {
		Logger.log("Grape has harvest!");
	}

	@Override
	public void plant() {
		Logger.log("Grape has planted!");
	}

	public boolean isSeedless() {
		return seedless;
	}

	public void setSeedless(boolean seedless) {
		this.seedless = seedless;
	}
	
}
