package com.huabin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author huabin
 * @DateTime 2022-06-30 15:04
 * @Desc
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person bean = ac.getBean(Person.class);
		System.out.println(bean);
	}

}
