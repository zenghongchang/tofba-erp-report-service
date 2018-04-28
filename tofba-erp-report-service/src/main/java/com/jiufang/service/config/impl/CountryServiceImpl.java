package com.jiufang.service.config.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiufang.dao.config.CountryDao;
import com.jiufang.orm.config.Country;
import com.jiufang.service.config.CountryService;

@Service("countryService")
public class CountryServiceImpl implements CountryService {
    @Autowired
    private CountryDao countryDao;
    
    @Override
    public Country queryCountryById(Integer id) {
        return countryDao.queryCountryById(id);
    }
    
    @Override
    public List<Country> queryAllCountry() {
        return countryDao.queryAllCountry();
    }
}