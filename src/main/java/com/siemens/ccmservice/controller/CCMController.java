package com.siemens.ccmservice.controller;


import com.siemens.ccmservice.entity.PPMBeanRequest;
import com.siemens.ccmservice.entity.VPPMBean;
import com.siemens.ccmservice.service.QueryDateService;
import com.siemens.ccmservice.utils.HttpClientUtil;
import com.siemens.ccmservice.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/rest")
public class CCMController {

    @Autowired
    private QueryDateService queryDateService;

    @RequestMapping("/ppm")
    public List<String> getPPMInfo(PPMBeanRequest req) throws ParseException {
        String json = HttpClientUtil.doPostJson("http://localhost:8300/rest/ppm", JsonUtils.objectToJson(req));

//        List<VPPMBean> list = JsonUtils.jsonToList(json, VPPMBean.class);

        List<String> month = queryDateService.getMonthBetween(req.getStartDate().toString(), req.getEndDate().toString());


        return month;

    }


}
