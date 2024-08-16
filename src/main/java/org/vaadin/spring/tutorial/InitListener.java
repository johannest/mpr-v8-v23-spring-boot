package org.vaadin.spring.tutorial;

import com.vaadin.flow.server.ServiceInitEvent;
import com.vaadin.flow.server.VaadinServiceInitListener;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class InitListener implements VaadinServiceInitListener {

    @Override
    public void serviceInit(ServiceInitEvent event) {

        event.getSource().addSessionInitListener(initEvent -> {
            LoggerFactory.getLogger(getClass()).info("A new Session has been initialized!");
            initEvent.getSession().setErrorHandler(new CustomErrorHandler());
        });
    }
}