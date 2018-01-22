package com;

import java.util.List;

public interface TCClassRoomService {

    /**
     * 获取单个课程详情，
     *
     * @param
     * @return
     */

    public List<TCClassRoom> getTCClassRoomList(Integer offset, Integer limit, Integer type, Integer sortType, Boolean needTotal);

    public TCClassRoom getTCClassRoom(String id);

    public TCClassRoom addTCClassRoom(TCClassRoom classRoom);

    public void deleteTCClassRooms(List<String> roomIds);

    public void addTCCourseware(String classRoomId, String coursewareRid);

    public TCClassRoom searchById(String tcClassRoomId);


}
