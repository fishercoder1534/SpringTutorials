package spring_bean_post_processor;

/**
 * This MainApp is working fine.
 */

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppDemoBeanPostProcessor {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext(
                "beansForDemoBeanPostProcessor.xml");

        common.HelloWorld helloWorld = (common.HelloWorld) context.getBean("helloWorld");
        helloWorld.getMessage();

        common.HelloChina helloChina = (common.HelloChina) context.getBean("helloChina");
        helloChina.setMessage("China is saying hello to the rest of the world!");
        helloChina.getMessage();

        context.registerShutdownHook();

        System.out.println("The program ended! Cool!");
    }
}