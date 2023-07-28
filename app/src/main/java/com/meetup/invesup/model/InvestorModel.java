package com.meetup.invesup.model;

public class InvestorModel {
    private String bussinessName;
    private String emailID;

    public InvestorModel()
    {
        super();
    }
    public InvestorModel(String bussinessName,String emailID)
    {
        this.bussinessName=bussinessName;
        this.emailID=emailID;
    }

    public void setBussinessName(String bussinessName) {
        this.bussinessName = bussinessName;
    }

    public String getBussinessName() {
        return bussinessName;
    }

    public void setEmailID(String emailID)
    {
        this.emailID=emailID;
    }
    public String getEmailID() {
        return emailID;
    }
}
