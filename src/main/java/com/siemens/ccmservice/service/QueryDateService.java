package com.siemens.ccmservice.service;

import java.text.ParseException;
import java.util.List;

public interface QueryDateService {
    List<String> getMonthBetween(String minDate, String maxDate) throws ParseException;
}
