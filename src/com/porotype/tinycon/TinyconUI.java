package com.porotype.tinycon;

import java.util.HashMap;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * Tinycon demo
 */
@SuppressWarnings("serial")
public class TinyconUI extends UI {

    // we'll update this counter
    int n = 0;

    @Override
    protected void init(VaadinRequest request) {
        final VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        setContent(layout);

        // Extend the UI
        final Tinycon t = new Tinycon();
        t.extend(this);

        Button count = new Button("Count");
        count.addClickListener(new Button.ClickListener() {
            public void buttonClick(ClickEvent event) {
                // update bubble
                t.setBubble(n++);
            }
        });
        layout.addComponent(count);

        Button reset = new Button("Reset");
        reset.addClickListener(new Button.ClickListener() {
            public void buttonClick(ClickEvent event) {
                // reset counter and bubble
                n = 0;
                t.reset();
            }
        });
        layout.addComponent(reset);

        Button change = new Button("Change style");
        change.addClickListener(new Button.ClickListener() {
            public void buttonClick(ClickEvent event) {
                // change style
                HashMap<String, String> opts = new HashMap<String, String>();
                opts.put("background", "yellow");
                opts.put("colour", "black");
                t.setOptions(opts);
                // make the bubble update style at once
                t.setBubble(n);
            }
        });
        layout.addComponent(change);

    }
}