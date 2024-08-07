package org.vaadin.spring.tutorial;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackageClasses = {TutorialApplication.class})
public class TutorialApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(TutorialApplication.class, args);
	}
}
