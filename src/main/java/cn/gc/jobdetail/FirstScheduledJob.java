package cn.gc.jobdetail;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class FirstScheduledJob extends QuartzJobBean{
	//这个是需要用到的自定义参数
	private AnotherBean  anotherBean;
	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		// TODO Auto-generated method stub
		System.out.println("66666666666666666666");
		anotherBean.printHello();
	}

	public void setAnotherBean(AnotherBean anotherBean) {
		this.anotherBean = anotherBean;
	}

}
