package com.filakj.springstartup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
//@SpringBootApplication - Spring Context File identifier , enables auto configuration and autoscan of package

@SpringBootApplication
public class SpringstartupApplication {
	//SpringRun allows run of a spring context
	//run returns an applicationContext
	public static void main(String[] args) {
		ApplicationContext applicationContext =
		SpringApplication.run(SpringstartupApplication.class, args);

		for (String name : applicationContext.getBeanDefinitionNames()) {
			//autoconfiguration creates beans printed in console
			// spring book looks at frameworks available on CLASSPATH and existing beans configured for the application.
			System.out.println(name);
		}
	}
}
