package org.vaadin.spring.tutorial;

import com.vaadin.flow.router.Route;
import com.vaadin.mpr.MprRouteAdapter;

@Route(value = "ui", layout = Mainlayout.class)
public class UIScopedRoute extends MprRouteAdapter<UIScopedView> {

}
