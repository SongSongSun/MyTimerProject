package com.ctgu.timer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimerTask;

import sun.java2d.pipe.SpanShapeRenderer.Simple;

public class MyTimerTask extends TimerTask{
	private String name;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(calendar.getTime()));
		System.out.println("current exec name " + name);
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
