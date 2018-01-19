package com;

public class UserView {
    private String id;
	private Long createTime;
	private Long updateTime;
	private Long numId;
	private String name;

	public UserView() {
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getNumId() {
		return numId;
	}

	public void setNumId(Long numId) {
		this.numId = numId;
	}

	public String toString() {
		return "UserView id " + id + " name " + name + " numId " + numId;
	}
}