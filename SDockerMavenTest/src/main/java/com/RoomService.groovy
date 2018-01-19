package com

import com.docker.rpc.remote.annotations.RemoteService
import script.groovy.annotation.Bean

public interface RoomService {

    public Object getRunningGameRoom(String gameRoomId)

    public Object getRunningGameRoomByNum(String roomNum)
}
