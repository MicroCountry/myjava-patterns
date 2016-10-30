package MyJava.patterns.simple.factory;

import MyJava.patterns.common.log.Logger;

public class StrawBerry implements Fruit {

	@Override
	public void grow() {
		Logger.log("StrawBerry is growing!");
	}

	@Override
	public void harvest() {
		Logger.log("StrawBerry has been harvested!");
	}

	@Override
	public void plant() {
		Logger.log("StrawBerry has been planted!");
	}

}
