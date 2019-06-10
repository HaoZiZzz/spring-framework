package org.springframework.aop.framework;

/**
 * TestBean
 *
 * @author baitianhao@sck2data.com.cn
 * @date 2019/02/13 15:06
 **/
public class TestBean {
	private String testStr;

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	public String getTestStr() {
		return testStr;
	}

	public void test(){
		System.out.println("test execute.");
	}

}
