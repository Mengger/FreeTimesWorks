package com.freeTime.domain;

import java.util.Date;

public class Customer {
    private String idCardNo;

    private String name;

    private String nation;

    private Date birthday;

    private String address;

    private String phoneNum;

    private String secondPhoneNum;

    private String homeNum;

    private String emergencyNum;

    private String gender;

    private String hobby;

    private String worksProperty;

    private String qqNum;

    private String nikeName;

    private String autoMobile;

    private String eMail;

    private Date createTime;

    private Date modifyTime;

    private String ext1;

    private String ext2;

    private String ext3;

    private String ext4;

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