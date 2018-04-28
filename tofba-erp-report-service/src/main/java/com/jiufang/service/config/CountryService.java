package com.jiufang.service.config;

import java.util.List;

import com.jiufang.orm.config.Country;

public interface CountryService {
    public Country queryCountryById(Integer id);
    public List<Country> queryAllCountry();
}