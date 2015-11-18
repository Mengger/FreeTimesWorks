package com.freeTime.domain;

public class OrderDetail {
    private String orderNum;

    private String projectDesc;

    private Integer replacePartManHour;

    private String doctorNo;

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    public String getProjectDesc() {
        return projectDesc;
    }

    public void setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc == null ? null : projectDesc.trim();
    }

    public Integer getReplacePartManHour() {
        return replacePartManHour;
    }

    public void setReplacePartManHour(Integer replacePartManHour) {
        this.replacePartManHour = replacePartManHour;
    }

    public String getDoctorNo() {
        return doctorNo;
    }

    public void setDoctorNo(String doctorNo) {
        this.doctorNo = doctorNo == null ? null : doctorNo.trim();
    }
}