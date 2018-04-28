package com.jiufang.dao.config;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jiufang.orm.config.Country;


@Repository("countryDao")
public interface CountryDao {
    public Country queryCountryById(Integer id);
    public List<Country> queryAllCountry();
}
