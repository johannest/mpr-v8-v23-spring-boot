package org.vaadin.spring.tutorial;

import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;

public class MainMenu extends HorizontalLayout{
	public MainMenu() {
        Button home = new Button("UI Scoped View",
                event -> getUI().getNavigator().navigateTo("ui"));
        Button away = new Button("View Scoped View",
                event -> getUI().getNavigator().navigateTo("view"));

        addComponents(home, away);
    }
}
