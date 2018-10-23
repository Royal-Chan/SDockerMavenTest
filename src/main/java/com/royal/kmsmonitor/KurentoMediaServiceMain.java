/**
 * Created by Royal Chan (cn.royalchan@gmail.com) on 10/16/2018.
 */
package com.royal.kmsmonitor;

import com.docker.rpc.remote.stub.ServiceStubManager;

class KurentoMediaServiceMain {
    public static void main(String[] args) {
        /* Code here*/
        ServiceStubManager serviceStubManager = new ServiceStubManager();
//        serviceStubManager.setHost("192.168.31.189:10055");
        serviceStubManager.setHost("192.168.1.113");
//        serviceStubManager.setUsePublicDomain(false);
        serviceStubManager.init();
        KurentoMediaService service = serviceStubManager.getService("tckmsmonitor", KurentoMediaService.class);
        checkKurentoMediaServerStatus(service);
    }

    static void checkKurentoMediaServerStatus(KurentoMediaService service) {

    }
}
