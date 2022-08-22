package com.example.x_cite;

import java.io.Serializable;

public class Phons implements Serializable {
    private String PhonName ;
    private String PhoneBrand ;
    private int PhoneIMge ;
    private String PhoneDisc ;

    public Phons(String phonName, String phoneBrand, int phoneIMge, String phoneDisc) {
        PhonName = phonName;
        PhoneBrand = phoneBrand;
        PhoneIMge = phoneIMge;
        PhoneDisc = phoneDisc;
    }

    public String getPhonName() {
        return PhonName;
    }

    public void setPhonName(String phonName) {
        PhonName = phonName;
    }

    public String getPhoneBrand() {
        return PhoneBrand;
    }

    public void setPhoneBrand(String phoneBrand) {
        PhoneBrand = phoneBrand;
    }

    public int getPhoneIMge() {
        return PhoneIMge;
    }

    public void setPhoneIMge(int phoneIMge) {
        PhoneIMge = phoneIMge;
    }

    public String getPhoneDisc() {
        return PhoneDisc;
    }

    public void setPhoneDisc(String phoneDisc) {
        PhoneDisc = phoneDisc;
    }
}

