package com.ctgu.timer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimerTask;

public class DancingRobot extends TimerTask{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//获取第一次被安排跳舞的时间
		SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("Schedule exec time is :"+sFormat.format(scheduledExecutionTime()));
		System.out.println("Dancing Happily");
	}
	
}
