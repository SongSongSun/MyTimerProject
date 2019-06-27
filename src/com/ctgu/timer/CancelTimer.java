package com.ctgu.timer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class CancelTimer {
	public static void main(String[] args) throws InterruptedException {
		Timer timer = new Timer();
		MyTimerTask task1 = new MyTimerTask();
		MyTimerTask task2 = new MyTimerTask();
		task1.setName("task1");
		task2.setName("task2");
		Date startTime = new Date();
		SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("start Time is : "+ sFormat.format(startTime));
		timer.schedule(task1, 3000, 1000);
		timer.schedule(task2, 1000, 2000);
		Thread.sleep(5000);
		Date calcelTime = new Date();
		System.out.println("cancel Time is :"+sFormat.format(calcelTime));
		timer.cancel();
		System.out.println("Tasks all canceled!");
	}
}
