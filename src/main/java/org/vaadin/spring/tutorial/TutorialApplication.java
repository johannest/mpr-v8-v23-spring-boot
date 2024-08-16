package org.vaadin.spring.tutorial;


import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.shared.communication.PushMode;
import com.vaadin.mpr.core.MprTheme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackageClasses = {TutorialApplication.class})
@Push(value = PushMode.DISABLED)
@MprTheme("mytheme")
public class TutorialApplication extends SpringBootServletInitializer implements AppShellConfigurator {

	public static void main(String[] args) {
		SpringApplication.run(TutorialApplication.class, args);
	}
}
