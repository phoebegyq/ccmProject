package com.siemens.ccmservice.controller;


import com.siemens.ccmservice.entity.PPMBeanRequest;
import com.siemens.ccmservice.entity.VPPMBean;
import com.siemens.ccmservice.utils.HttpClientUtil;
import com.siemens.ccmservice.utils.JsonUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping("/rest")
public class CCMController {

    @RequestMapping("/ppm")
    public List<VPPMBean> getPPMInfo(PPMBeanRequest req) {
        String json = HttpClientUtil.doPostJson("http://localhost:8300/rest/ppm", JsonUtils.objectToJson(req));

        List<VPPMBean> list = JsonUtils.jsonToList(json, VPPMBean.class);

      req.getStartDate();

        return list;

    }

    public  List<String> getMonthBetween(String minDate, String maxDate) throws Exception {
        ArrayList<String> result = new ArrayList<String>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");//格式化为年月

        Calendar min = Calendar.getInstance();
        Calendar max = Calendar.getInstance();

        min.setTime(sdf.parse(minDate));
        min.set(min.get(Calendar.YEAR), min.get(Calendar.MONTH), 1);

        max.setTime(sdf.parse(maxDate));
        max.set(max.get(Calendar.YEAR), max.get(Calendar.MONTH), 2);

        Calendar curr = min;
        while (curr.before(max)) {
            result.add(sdf.format(curr.getTime()));
            curr.add(Calendar.MONTH, 1);
        }

        return result;
    }

}
