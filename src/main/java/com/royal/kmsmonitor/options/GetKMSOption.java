package com.royal.kmsmonitor.options;

public class GetKMSOption extends GetterBaseOption{
    /**
     * get KMS with region
     */
    private String region;
    private Short type;

    String getRegion() {
        return region;
    }

    void setRegion(String region) {
        this.region = region;
    }

    Short getType() {
        return type;
    }

    void setType(Short type) {
        this.type = type;
    }
}
