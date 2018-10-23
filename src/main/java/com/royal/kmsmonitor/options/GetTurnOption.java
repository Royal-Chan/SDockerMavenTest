package com.royal.kmsmonitor.options;

public class GetTurnOption extends GetterBaseOption {
    /**
     * 被连接的KMS ip
     */
    private String kmsIp;

    String getKmsIp() {
        return kmsIp;
    }

    void setKmsIp(String kmsIp) {
        this.kmsIp = kmsIp;
    }
}
