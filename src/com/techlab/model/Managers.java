package com.techlab.model;

public class Managers implements IWorking,IEating{

	@Override
	public void startWork() {
		System.out.println("Managers have started working.");
	}

	@Override
	public void stopWork() {
		System.out.println("Managers have finished working.");
	}

	@Override
	public void startEat() {
		System.out.println("Managers have started eating.");
	}

	@Override
	public void stopEat() {
		System.out.println("Managers have finished eating.");
	}
	
}
