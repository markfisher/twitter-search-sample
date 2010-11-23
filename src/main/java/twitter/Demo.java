package twitter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("twitter/context.xml");
	}

}
