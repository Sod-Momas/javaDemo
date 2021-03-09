package cc.momas.javase.thread.test1;

import cc.momas.javase.thread.test1.pojo.MyThread;

public class PriortityTest {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread(),"线程A");//通过构造方法指定线程名
		Thread t2 = new Thread(new MyThread(),"线程B");
		//设置线程的优先级（对比演示设置前后设置后的结果）
//		t2.setPriority(Thread.MAX_PRIORITY);
//		t1.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println("****线程的优先级****");
		System.out.println("线程A的优先级："+t1.getPriority());
		System.out.println("线程B的优先级："+t2.getPriority());
		System.out.println("****************");
		t1.start();	
		t2.start();	
	}
}
