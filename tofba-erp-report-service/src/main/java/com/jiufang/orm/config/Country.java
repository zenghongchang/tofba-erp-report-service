package com.jiufang.orm.config;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Country implements Serializable {
    private Integer id;
    private String countryNameCn;
    private String countryNameEn;
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getCountryNameCn() {
        return countryNameCn;
    }
    
    public void setCountryNameCn(String countryNameCn) {
        this.countryNameCn = countryNameCn;
    }
    
    public String getCountryNameEn() {
        return countryNameEn;
    }
    
    public void setCountryNameEn(String countryNameEn) {
        this.countryNameEn = countryNameEn;
    }
    
    @Override
    public String toString() {
        return "Conutry [id=" + id + ", countryNameCn=" + countryNameCn + ", countryNameEn=" + countryNameEn + "]";
    }  
}