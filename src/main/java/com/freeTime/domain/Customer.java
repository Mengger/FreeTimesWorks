package com.freeTime.domain;

import java.util.Date;

public class Customer {
	/**
	 * 身份证号码
	 */
    private String idCardNo;

    /**
	 * 姓名
	 */
    private String name;

    /**
	 * 民族
	 */
    private String nation;

    /**
	 * 出生日期
	 */
    private Date birthday;

    /**
	 * 家庭地址
	 */
    private String address;

    /**
	 * 手机号码
	 */
    private String phoneNum;

    /**
	 * 备用手机号
	 */
    private String secondPhoneNum;

    /**
	 * 家庭电话号码
	 */
    private String homeNum;

    /**
	 * 紧急联系电话
	 */
    private String emergencyNum;

    /**
	 * 性别 1代表男    0代表女
	 */
    private String gender;

    /**
	 * 兴趣 爱好
	 */
    private String hobby;

    /**
	 * 工作类型
	 */
    private String worksProperty;

    /**
	 * QQ号码
	 */
    private String qqNum;

    /**
	 * 会员昵称
	 */
    private String nikeName;

    /**
	 * 车牌号码
	 */
    private String autoMobile;

    /**
	 * e-mail
	 */
    private String eMail;

    /**
	 * 创建时间
	 */
    private Date createTime;

    /**
	 * 修改时间
	 */
    private Date modifyTime;

    /**
	 * 备注字段
	 */
    private String ext1;

    /**
	 * 备注字段
	 */
    private String ext2;

    /**
	 * 备注字段
	 */
    private String ext3;

    /**
	 * 备注字段
	 */
    private String ext4;

    /**
	 * 备注字段
	 */
    private Date ext5;
    
    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo == null ? null : idCardNo.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    public String getSecondPhoneNum() {
        return secondPhoneNum;
    }

    public void setSecondPhoneNum(String secondPhoneNum) {
        this.secondPhoneNum = secondPhoneNum == null ? null : secondPhoneNum.trim();
    }

    public String getHomeNum() {
        return homeNum;
    }

    public void setHomeNum(String homeNum) {
        this.homeNum = homeNum == null ? null : homeNum.trim();
    }

    public String getEmergencyNum() {
        return emergencyNum;
    }

    public void setEmergencyNum(String emergencyNum) {
        this.emergencyNum = emergencyNum == null ? null : emergencyNum.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }

    public String getWorksProperty() {
        return worksProperty;
    }

    public void setWorksProperty(String worksProperty) {
        this.worksProperty = worksProperty == null ? null : worksProperty.trim();
    }

    public String getQqNum() {
        return qqNum;
    }

    public void setQqNum(String qqNum) {
        this.qqNum = qqNum == null ? null : qqNum.trim();
    }

    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName == null ? null : nikeName.trim();
    }

    public String getAutoMobile() {
        return autoMobile;
    }

    public void setAutoMobile(String autoMobile) {
        this.autoMobile = autoMobile == null ? null : autoMobile.trim();
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail == null ? null : eMail.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1 == null ? null : ext1.trim();
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2 == null ? null : ext2.trim();
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3 == null ? null : ext3.trim();
    }

    public String getExt4() {
        return ext4;
    }

    public void setExt4(String ext4) {
        this.ext4 = ext4 == null ? null : ext4.trim();
    }

    public Date getExt5() {
        return ext5;
    }

    public void setExt5(Date ext5) {
        this.ext5 = ext5;
    }
}