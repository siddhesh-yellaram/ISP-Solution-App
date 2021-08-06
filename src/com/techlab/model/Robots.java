package com.techlab.model;

public class Robots implements IWorking{

	@Override
	public void startWork() {
		System.out.println("Robots have started working.");
	}

	@Override
	public void stopWork() {
		System.out.println("Robots have finished working.");
	}
	
}
