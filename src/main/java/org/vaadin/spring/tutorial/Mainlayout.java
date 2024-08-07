package org.vaadin.spring.tutorial;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.shared.communication.PushMode;
import com.vaadin.mpr.LegacyWrapper;
import com.vaadin.mpr.core.MprTheme;

@Route("")
@Push(value = PushMode.DISABLED)
@MprTheme("mytheme")
public class Mainlayout extends VerticalLayout implements RouterLayout, AppShellConfigurator {

	public Mainlayout() {
        setSizeFull();
        add(new LegacyWrapper(new MainMenu()));
    }
}
