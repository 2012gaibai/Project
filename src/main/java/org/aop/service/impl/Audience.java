package org.aop.service.impl;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {

	public void takeSeats(){
		System.out.println("take seats!");
	}
	
	public void turnOffCellPhones(){
		System.out.println("turn off your phone!");
	}
	
	public void applaud(){
		System.out.println("欢呼欢呼！");
	}
	
	public void leave(){
		System.out.println("离开！");
	}
	
	public void demandRefund(){
		System.out.println("有异常抛出！");
	}
	
	public void waitTime(ProceedingJoinPoint joinPoint){
		try {
			System.out.println("take seats!");
			System.out.println("turn off your phone!");
			
			long start=System.currentTimeMillis();
			joinPoint.proceed();
			long end=System.currentTimeMillis();
			
			System.out.println("欢呼欢呼！");
			System.out.println("演出花费多长时间"+(end-start)+"milliSeconds");
		
		} catch (Throwable e) {
			System.out.println("演出失败！");
		}
	}
}
