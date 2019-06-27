package com.ctgu.timer;

import java.util.Timer;
import java.util.TimerTask;

public class WaterRobot extends TimerTask{
	//最大容量为5L
	private Integer bucket = 0;
	private Timer timer;
	public WaterRobot(Timer timer) {
		this.timer = timer;
	}
	
	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		if(bucket < 5) {
			System.out.println("Add 1L water into bucket");
			bucket++;
		}else {
			System.out.println("The number of canceled task is :"+ timer.purge());
			System.out.println("bucket capacity is:"+bucket+"L");
			cancel();
			System.out.println("Water robot has been aborted!");
			System.out.println("The number of canceled task is :"+ timer.purge());
			//灌水机器人停止两秒后，跳舞机器人停止ֹ
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			timer.cancel();
			System.out.println("Dancing robot has been aborted!");
		}
	}

}
