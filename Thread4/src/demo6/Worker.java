package demo6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {

	
	
	private Random random= new Random();
	
	private  List<Integer> list1=new ArrayList<Integer>();
	private List<Integer>list2=new ArrayList<Integer>();
	
	
	public void stageOne(){
	try {
		Thread.sleep(1);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	list1.add(random.nextInt(100));
	}
	
	
	public void stageTwo(){
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list2.add(random.nextInt(100));
		}
	
	public void process(){
		for (int i=0;i<100;i++)
		stageOne();
		stageTwo();
	}
	
	
	
	
	public void main(String[] args) {
		System.out.println("statrting.......");
		Long start =System.currentTimeMillis();
				process();
		Long end=System.currentTimeMillis();
		System.out.println("time taken is"+(end-start));
		System.out.println("List1 "+list1.size()+list2.size());
	}

}
