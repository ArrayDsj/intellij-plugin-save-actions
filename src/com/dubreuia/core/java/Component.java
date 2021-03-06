package com.dubreuia.core.java;

import com.dubreuia.core.SaveActionManager;
import org.jetbrains.annotations.NotNull;

public class Component extends com.dubreuia.core.Component {

    private static final String COMPONENT_NAME = "Save Actions Java";

    @NotNull
    public String getComponentName() {
        return COMPONENT_NAME;
    }

    @NotNull
    @Override
    protected SaveActionManager getSaveActionManager() {
        return new com.dubreuia.core.java.SaveActionManager();
    }

}
