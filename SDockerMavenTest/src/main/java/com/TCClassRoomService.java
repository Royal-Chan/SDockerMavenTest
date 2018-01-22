package com;

import com.alibaba.fastjson.JSONObject;

public interface TCClassRoomService {


    public TCClassRoom addTCClass(TCClassRoom tcClassRoom);

    public TCClassRoom getTCClassRoom(String id);

    public void deleteTCClassRoom(String id);

    public TCClassRoom updateTCClassRoom(String classRoomId, TCClassRoom tcClassRoom);

}
