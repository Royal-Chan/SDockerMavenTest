package com;

import com.alibaba.fastjson.JSONObject;

public interface TCClassRoomService {


    public TCClassRoom addClass(TCClassRoom tcClassRoom);

    public TCClassRoom getClassRoom(String id);

    public void deleteTCClassRoom(String id);

    public TCClassRoom updateTCClassRoom(String classRoomId, TCClassRoom tcClassRoom);
}
