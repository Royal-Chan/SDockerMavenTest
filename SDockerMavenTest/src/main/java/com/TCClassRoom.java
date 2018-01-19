package com;

import java.util.List;

public class TCClassRoom {


    private String id;
    private Long numberId;
    private String name;
    private Integer type;
    private Long startTime;
    private Long endTime;
    private String teacherPwd;
    private String assitantPwd;
    private String studentPwd;
    private String observerPwd;
    private Integer pwdType;
    private Integer property;
    private Integer videoResolution;
    private String videoFps;
    private String teacherUrl;
    private String studentUrl;


    public List<String> numbers;
    /**;
     * 课件对象待定;
     */
    public List<String> coursewares;
//    User user


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getNumberId() {
        return numberId;
    }

    public void setNumberId(Long numberId) {
        this.numberId = numberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public String getTeacherPwd() {
        return teacherPwd;
    }

    public void setTeacherPwd(String teacherPwd) {
        this.teacherPwd = teacherPwd;
    }

    public String getAssitantPwd() {
        return assitantPwd;
    }

    public void setAssitantPwd(String assitantPwd) {
        this.assitantPwd = assitantPwd;
    }

    public String getStudentPwd() {
        return studentPwd;
    }

    public void setStudentPwd(String studentPwd) {
        this.studentPwd = studentPwd;
    }

    public String getObserverPwd() {
        return observerPwd;
    }

    public void setObserverPwd(String observerPwd) {
        this.observerPwd = observerPwd;
    }

    public Integer getPwdType() {
        return pwdType;
    }

    public void setPwdType(Integer pwdType) {
        this.pwdType = pwdType;
    }

    public Integer getProperty() {
        return property;
    }

    public void setProperty(Integer property) {
        this.property = property;
    }

    public Integer getVideoResolution() {
        return videoResolution;
    }

    public void setVideoResolution(Integer videoResolution) {
        this.videoResolution = videoResolution;
    }

    public String getVideoFps() {
        return videoFps;
    }

    public void setVideoFps(String videoFps) {
        this.videoFps = videoFps;
    }

    public String getTeacherUrl() {
        return teacherUrl;
    }

    public void setTeacherUrl(String teacherUrl) {
        this.teacherUrl = teacherUrl;
    }

    public String getStudentUrl() {
        return studentUrl;
    }

    public void setStudentUrl(String studentUrl) {
        this.studentUrl = studentUrl;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    public List<String> getCoursewares() {
        return coursewares;
    }

    public void setCoursewares(List<String> coursewares) {
        this.coursewares = coursewares;
    }
}
