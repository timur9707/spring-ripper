package com.epam.ripper;

public class ProfilingController implements ProfilingControllerMBean {

    private boolean isEnabled = true;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }
}
