package com.ctgu.timer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;

public class Test {
	public static void main(String[] args) {
		Timer timer = new Timer();
		
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("current exec time is:"+sFormat.format(calendar.getTime()));
		DancingRobot dancingRobot = new DancingRobot();
		WaterRobot waterRobot = new WaterRobot(timer);
		
		timer.schedule(waterRobot, calendar.getTime(),1000);
		timer.scheduleAtFixedRate(dancingRobot, calendar.getTime(),2000);
	}
}
