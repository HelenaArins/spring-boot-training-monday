package com.wipro.training.springboottrainingmonday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import com.wipro.training.controller.GreetingController;

@SpringBootApplication
//@ComponentScan("com.wipro.training")
@ImportResource("classpath:/spring/spring-config.xml")
public class SpringBootTrainingMondayApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootTrainingMondayApplication.class, args);
		GreetingController controller = context.getBean(GreetingController.class);
//		GreetingController controller = (GreetingController)context.getBean("greetingController");
		String message = controller.greeting();
		System.out.println(message);
		
//		String teste = context.getBean(GreetingController.class).greeting();
//		System.out.println(teste);
	}

}

