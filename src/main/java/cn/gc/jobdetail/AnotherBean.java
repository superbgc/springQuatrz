package cn.gc.jobdetail;

import org.springframework.stereotype.Component;

@Component("anotherBean")
public class AnotherBean {
	public void printHello(){
		System.out.println("Hello....");
	}
}
