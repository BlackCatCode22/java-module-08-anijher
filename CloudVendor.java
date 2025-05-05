package com.nijher.app.rest.model;

public class CloudVendor
{
    private String vendorID;
    private String vendorName;
    private String vendorEmail;
    private String vendorPhoneNumber;

    public CloudVendor(String vendorID) {
    }
    public CloudVendor(String vendorID, String vendorName, String vendorEmail, String vendorPhoneNumber) {
        this.vendorID = vendorID;
        this.vendorName = vendorName;
        this.vendorEmail = vendorEmail;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    public String getVendorEmail() {
        return vendorEmail;
    }

    public void setVendorEmail(String vendorEmail) {
        this.vendorEmail = vendorEmail;
    }

    public String getVendorID() {
        return vendorID;
    }

    public void setVendorID(String vendorID) {
        this.vendorID = vendorID;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }


    }


