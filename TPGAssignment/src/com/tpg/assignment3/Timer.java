package com.tpg.assignment3;

import org.joda.time.DateTime;

public class Timer {

	public String methodName;
	public DateTime startTime;
	public DateTime endTime;
	
	public Timer(String methodName){
		this.methodName=methodName;
		long startTimeMillis = System.currentTimeMillis();
		DateTime startTime = new DateTime(startTimeMillis);
		this.startTime=startTime;
	}
	
	public String getMethodName() {
		return methodName;
	}

	public DateTime getStartTime() {
		return startTime;
	}

	public DateTime getEndTime() {
		return endTime;
	}

	public void setEndTime() {
		long endTimeMillis = System.currentTimeMillis();
		DateTime endTime = new DateTime(endTimeMillis);
		this.endTime=endTime;
	}
	
}
