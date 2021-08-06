package com.techlab.test;

import com.techlab.model.IEating;
import com.techlab.model.IWorking;
import com.techlab.model.Managers;
import com.techlab.model.Robots;

public class InterfaceTest {

	public static void main(String[] args) {
		doAllWorkingJobs(new Managers());
		doAllEatingJobs(new Managers());
		doAllWorkingJobs(new Robots());
	}
	public static void doAllWorkingJobs(IWorking i) {
		i.startWork();
		i.stopWork();
	}
	public static void doAllEatingJobs(IEating e) {
		e.startEat();
		e.stopEat();
	}
}
