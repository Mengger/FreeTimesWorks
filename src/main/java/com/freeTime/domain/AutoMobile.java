package com.freeTime.domain;

import java.util.Date;

public class AutoMobile {
    private String frameNumber;

    private String automobileLicense;

    private String engineNumber;

    private String automobileBrand;

    private String automobileModel;

    private String automobileOutputValue;

    private String automobileColor;

    private Integer seat;

    private String automobileInsuranceCompany;

    private Date compulsoryInsuranceTime;

    private Date otherInsuranceTime;

    private String insuranceType;

    private String automobilePic;

    private Date createTime;

    private Date modifyTime;

    private String ext1;

    private String ext2;

    private String ext3;

    private String ext4;

    private Date ext5;

    public String getFrameNumber() {
        return frameNumber;
    }

    public void setFrameNumber(String frameNumber) {
        this.frameNumber = frameNumber == null ? null : frameNumber.trim();
    }

    public String getAutomobileLicense() {
        return automobileLicense;
    }

    public void setAutomobileLicense(String automobileLicense) {
        this.automobileLicense = automobileLicense == null ? null : automobileLicense.trim();
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber == null ? null : engineNumber.trim();
    }

    public String getAutomobileBrand() {
        return automobileBrand;
    }

    public void setAutomobileBrand(String automobileBrand) {
        this.automobileBrand = automobileBrand == null ? null : automobileBrand.trim();
    }

    public String getAutomobileModel() {
        return automobileModel;
    }

    public void setAutomobileModel(String automobileModel) {
        this.automobileModel = automobileModel == null ? null : automobileModel.trim();
    }

    public String getAutomobileOutputValue() {
        return automobileOutputValue;
    }

    public void setAutomobileOutputValue(String automobileOutputValue) {
        this.automobileOutputValue = automobileOutputValue == null ? null : automobileOutputValue.trim();
    }

    public String getAutomobileColor() {
        return automobileColor;
    }

    public void setAutomobileColor(String automobileColor) {
        this.automobileColor = automobileColor == null ? null : automobileColor.trim();
    }

    public Integer getSeat() {
        return seat;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }

    public String getAutomobileInsuranceCompany() {
        return automobileInsuranceCompany;
    }

    public void setAutomobileInsuranceCompany(String automobileInsuranceCompany) {
        this.automobileInsuranceCompany = automobileInsuranceCompany == null ? null : automobileInsuranceCompany.trim();
    }

    public Date getCompulsoryInsuranceTime() {
        return compulsoryInsuranceTime;
    }

    public void setCompulsoryInsuranceTime(Date compulsoryInsuranceTime) {
        this.compulsoryInsuranceTime = compulsoryInsuranceTime;
    }

    public Date getOtherInsuranceTime() {
        return otherInsuranceTime;
    }

    public void setOtherInsuranceTime(Date otherInsuranceTime) {
        this.otherInsuranceTime = otherInsuranceTime;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType == null ? null : insuranceType.trim();
    }

    public String getAutomobilePic() {
        return automobilePic;
    }

    public void setAutomobilePic(String automobilePic) {
        this.automobilePic = automobilePic == null ? null : automobilePic.trim();
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