package com.royal.kmsmonitor.options;

import java.util.List;

public class GetterBaseOption {
    /**
     * tried server
     */
    private List<String> suspect;
    /**
     * if true, will contain location by return
     */
    private Boolean needLocation;

    List<String> getSuspect() {
        return suspect;
    }

    void setSuspect(List<String> suspect) {
        this.suspect = suspect;
    }

    Boolean getNeedLocation() {
        return needLocation;
    }

    void setNeedLocation(Boolean needLocation) {
        this.needLocation = needLocation;
    }
}
