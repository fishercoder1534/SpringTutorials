package spring_JSR_250_annotations;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld {
	@Setter @Getter
    private String message;

//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    public String getMessage() {
//        System.out.println("Your Message : " + message);
//        return message;
//    }

    @PostConstruct
    public void init() {
        System.out.println("Bean is going through init.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean will destroy now.");
    }
}