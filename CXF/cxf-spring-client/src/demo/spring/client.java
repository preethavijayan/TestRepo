package demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {

	public static void main(String[] args) {

		client c = new client();
		c.exec();

	}

	public void exec() {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		HelloWorld hello = (HelloWorld) context.getBean("helloClient");
		System.out.println("************inside exec**********");
		hello.sayHi("antony");

	}

}
