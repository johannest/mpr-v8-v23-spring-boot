package org.vaadin.spring.tutorial;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.mpr.LegacyWrapper;

@Route("")
public class Mainlayout extends VerticalLayout  {

	public Mainlayout() {
        setSizeFull();
        add(new LegacyWrapper(new MainMenu()));
    }
}
