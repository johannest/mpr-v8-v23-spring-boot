package org.vaadin.spring.tutorial;

import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.themes.ValoTheme;

public class MainMenu extends HorizontalLayout{
	public MainMenu() {
        setSizeFull();
        setMargin(true);
        setSpacing(true);
        Button ui = new Button("Button",
                event -> getUI().showNotification("Test"));
        ui.addStyleName(ValoTheme.BUTTON_PRIMARY);
        addComponents(ui);
    }
}
