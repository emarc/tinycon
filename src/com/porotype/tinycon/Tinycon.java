package com.porotype.tinycon;

import java.util.Map;

import com.vaadin.annotations.JavaScript;
import com.vaadin.server.AbstractJavaScriptExtension;
import com.vaadin.server.ClientConnector;
import com.vaadin.ui.UI;

@JavaScript({ "TinyconConnector.js", "tinycon.min.js" })
public class Tinycon extends AbstractJavaScriptExtension {

    public void setBubble(int n) {
        callFunction("setBubble", n);
    }

    public void reset() {
        callFunction("reset");
    }

    public void setOptions(Map options) {
        callFunction("setOptions", options);
    }

    public void extend(UI ui) {
        super.extend(ui);
    }

    @Override
    protected Class<? extends ClientConnector> getSupportedParentType() {
        return UI.class;
    }
}
