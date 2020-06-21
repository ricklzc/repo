package com.cc.springmvc.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        //判断
        if(s == null){
            throw new RuntimeException("请输入数据");
        }
        DateFormat df =new SimpleDateFormat("yyyy-MM-dd");
        try {
            //把字符串转换成日期并返回
            return df.parse(s);
        } catch (Exception e) {
            throw new RuntimeException("数据转换错误");
        }
    }
}
