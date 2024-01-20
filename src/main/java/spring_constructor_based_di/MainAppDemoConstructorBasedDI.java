package spring_constructor_based_di;

/**
 * This one is also working fine.
 * But in order to make this one work, I'll have to enable
 * constructor-based DI in beans.xml and comment out other two DI methods in the TextEditor
 * and SpellChecker beans.
 */

import common.TextEditor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppDemoConstructorBasedDI {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beansForDemoConstructorBasedDI.xml");

        TextEditor textEditor = (TextEditor) context.getBean("textEditor");

        textEditor.spellCheck();
        context.registerShutdownHook();

        System.out.println("Program ends.");
    }
}