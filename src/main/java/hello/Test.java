package hello;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by heyang on 16/3/27.
 */
public class Test {
    @Autowired
    @JugglerAnnotation
    private static Performer performer;
    
    public static void main(String args[]) throws PerformenceException {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("main/java/hello/applicationContext.xml");
//        Performer performer = (Performer) applicationContext.getBean("maomao");
        performer.perform();
    }
}
