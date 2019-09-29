package ru.bitrapid.conversationexchangeclient.data.model;

import ru.bitrapid.conversationexchangeclient.api.rest.RestApiRequestData;

public class SearchRequestData implements RestApiRequestData {
    /*
lg: en
S: ST
N_lg: 2
P_lg: 88
plf: 1
plt: 7
Country: 29
Town:
loc:
tz_from:
tz_to:
exF: 1
exP: 1
exCS: 1
Csoft: 1
Name:
Age_From:
Age_to:
sex:
k:
Sort: login
     */

    private String lg = "en";
    private String S = "ST";
    private String N_lg = "";
    private String P_lg = "";
    private String plf = "1";
    private String plt = "7";
    private String Country = "";
    private String Town = "";
    private String loc = "";
    private String tz_from = "";
    private String tz_to = "";
    private String Csoft = "0";
    private String Name = "";
    private String Age_From = "";
    private String Age_to = "";
    private String sex = "";
    private String Sort = "login";

    public String getLg() {
        return lg;
    }

    public void setLg(String lg) {
        this.lg = lg;
    }

    public String getS() {
        return S;
    }

    public void setS(String s) {
        S = s;
    }

    public String getN_lg() {
        return N_lg;
    }

    public void setN_lg(String n_lg) {
        N_lg = n_lg;
    }

    public String getP_lg() {
        return P_lg;
    }

    public void setP_lg(String p_lg) {
        P_lg = p_lg;
    }

    public String getPlf() {
        return plf;
    }

    public void setPlf(String plf) {
        this.plf = plf;
    }

    public String getPlt() {
        return plt;
    }

    public void setPlt(String plt) {
        this.plt = plt;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getTown() {
        return Town;
    }

    public void setTown(String town) {
        Town = town;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getTz_from() {
        return tz_from;
    }

    public void setTz_from(String tz_from) {
        this.tz_from = tz_from;
    }

    public String getTz_to() {
        return tz_to;
    }

    public void setTz_to(String tz_to) {
        this.tz_to = tz_to;
    }

    public String getCsoft() {
        return Csoft;
    }

    public void setCsoft(String csoft) {
        Csoft = csoft;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAge_From() {
        return Age_From;
    }

    public void setAge_From(String age_From) {
        Age_From = age_From;
    }

    public String getAge_to() {
        return Age_to;
    }

    public void setAge_to(String age_to) {
        Age_to = age_to;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSort() {
        return Sort;
    }

    public void setSort(String sort) {
        Sort = sort;
    }
}
