package com.antra.console;

import com.antra.config.AppConfig;
import com.antra.MessageGenerator;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j //the log will be generated by lombok with the annotation @Slf4j
public class Main {

    //generated by lombok!
//    private static final Logger log = LoggerFactory.getLogger(Main.class);

    //record the beans.xml file with a variable
//    private static final String CONFIG_LOCATION = "beans.xml";

    public static void main(String[] args) {
        //create context(or container) through the beans.xml file
        //ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
        //create context(or container) through the java configure file
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
//        //get number generator from the context(container)
//        NumberGenerator numberGenerator = context.getBean("generator", NumberGenerator.class);
//        //call method next() to get a random number
//        int number = numberGenerator.next();
//        log.info("number = {}" , number);
//
//        //get game from the context(container)
//        Game game = context.getBean(GameImpl.class);
//        //reset the game, we can put this initializing method in the beans.xml file with "init-method"
//        //game.reset();

        //get the message generator from the context
//        MessageGenerator messageGenerator = context.getBean(MessageGenerator.class);
//        log.info(messageGenerator.getMainMessage());
//        log.info(messageGenerator.getResultMessage());

        //close context (container)
        context.close();
    }
}
