package spring_java_annotation_based_di;

import common.Gospel1;
import common.HelloWorld;
import common.TextEditor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * This is to demo java-annotation-based Spring configuration/dependency
 * Injection.
 */
public class MainAppForDemoJavaAnnotationBasedDI {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();

        annotationConfigApplicationContext.register(Gospel1Config.class, TextEditorConfig.class,
                HelloWorldConfig.class);
        annotationConfigApplicationContext.refresh();

        Gospel1 luke = annotationConfigApplicationContext.getBean(Gospel1.class);
        luke.setReflection("Gospel 1 is the book of Luke!");
        System.out.println(luke.getReflection());

        TextEditor te = annotationConfigApplicationContext.getBean(TextEditor.class);
        te.spellCheck();

        HelloWorld helloWorld = annotationConfigApplicationContext.getBean(HelloWorld.class);
        helloWorld.setMessage("Hello World!");
        helloWorld.getMessage();

        System.out.println("The program ends!");
    }

}
