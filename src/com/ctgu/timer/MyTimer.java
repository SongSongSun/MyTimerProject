package com.ctgu.timer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;

public class MyTimer {
	
	public static void main(String[] args) {
		//1.ʵ����Timer
		Timer timer = new Timer();
		//2.ʵ����TimerTask�� MyTimerTask;
		MyTimerTask myTimerTask = new MyTimerTask();
		myTimerTask.setName("No.1");
		//3.ʹ��timer��ʱ��Ƶ�ʵص���MyTimerTask
		//timer.scheduleAtFixedRate(myTimerTask, 2000L, 1000L);
		
		//-------------schedule�������÷�-----------------
		
		//��һ���÷�
		/*Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(calendar.getTime()));
		calendar.add(calendar.SECOND, 3);
		myTimerTask.setName("schedule1");
		timer.schedule(myTimerTask, calendar.getTime());*/
		
		//�ڶ����÷�
		/*Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(calendar.getTime()));
		calendar.add(calendar.SECOND, 3);
		myTimerTask.setName("schedule2");
		timer.scheduleAtFixedRate(myTimerTask, calendar.getTime(), 2000);*/
		
		//�������÷�
		/*Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(calendar.getTime()));
		myTimerTask.setName("schedule3");
		timer.schedule(myTimerTask, 1000);*/
		
		//�������÷�
		/*Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(calendar.getTime()));
		myTimerTask.setName("schedule4");
		timer.schedule(myTimerTask, 3000,2000);*/
		
		
		//-------------scheduleAtFixedRate���÷�-----------------
		//��һ���÷�
		/*Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(calendar.getTime()));
		calendar.add(calendar.SECOND, 3);
		myTimerTask.setName("scheduleAtFixedRate1");
		timer.scheduleAtFixedRate(myTimerTask, calendar.getTime(), 2000);*/
		
		//�ڶ����÷�
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(calendar.getTime()));
		myTimerTask.setName("scheduleAtFixedRate2");
		timer.scheduleAtFixedRate(myTimerTask, 3000, 2000);
	}
	
	
}
