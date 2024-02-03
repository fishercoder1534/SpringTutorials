package spring_JSR_250_annotations;

/**Following is the content of the MainApp.java file. Here you 
 * need to register a shutdown hook registerShutdownHook() method that 
 * is declared on the AbstractApplicationContext class. 
 * This will ensure a graceful shutdown and call the relevant destroy methods.*/

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		context.registerShutdownHook();

		System.out.print("\nThe end!\n");
	}
}
