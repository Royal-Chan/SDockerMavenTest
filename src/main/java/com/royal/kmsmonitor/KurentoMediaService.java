package com.royal.kmsmonitor;


import com.royal.kmsmonitor.options.GetKMSOption;

import java.util.List;

interface KurentoMediaService {
    String SERVICE = "tckmsmonitor";

    /**
     * 获取KMS
     * @param ip 用户的IP
     * @param option 见OPTION对象
     * @return [service: Object@KurentoMediaServer, location: Object@ServerLocation]
     */
    public Object getKurentoMediaServer(String ip, GetKMSOption option);

    /**
     * 确认KMS的状态
     * @param kmses KMS IP 列表
     * @return [available: List<KurentoMediaServer>]
     */
    public Object checkKurentoMediaServerStatus(List<String> kmses);
}
