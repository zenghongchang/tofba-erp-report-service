package com.jiufang.controller.config;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiufang.orm.config.Country;
import com.jiufang.service.config.CountryService;

@Controller
@RequestMapping("/config/")
public class ConfigController {
    @Resource
    private CountryService countryService;
    
    @RequestMapping("/queryCountryById")
    @ResponseBody
    public Map<String, Object> queryCountryById(Integer id) {
        Country country = null;
        try {
            country = countryService.queryCountryById(id);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        Map<String, Object> result = new HashMap<String, Object>();
        if (null != country) {
            result.put("success", country);
            return result;
        }
        result.put("error", 0);
        return result;
    }
}