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
import java.time.YearMonth;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/rest")
public class CCMController {

    @Autowired
    private QueryDateService queryDateService;

    @RequestMapping("/ppm")
    public String getPPMInfo(PPMBeanRequest req) throws ParseException {
        String json = HttpClientUtil.doPostJson("http://localhost:8300/rest/ppm", JsonUtils.objectToJson(req));

        List<VPPMBean> list = JsonUtils.jsonToList(json, VPPMBean.class);


//        @RequestMapping(path = "/ccm", method = RequestMethod.POST)
//        public String getCCMInfo(@RequestBody CCMBeanRequest req) throws Exception {
//            List<CCMBean> list = ccmMapper.findAll();
            Map<YearMonth, Integer> monthList = new HashMap<>();
            for (VPPMBean tmpobj : list) {
                Calendar cal=Calendar.getInstance();
                cal.setTime(tmpobj.getComplaintCreateDate());
                Boolean hasMonth = false;
                for (YearMonth tmpMonth : monthList.keySet()) {

                    if(cal.get(Calendar.YEAR) == tmpMonth.getYear() && cal.get(Calendar.MONTH)+1 == tmpMonth.getMonthValue()){
                        int complaint = monthList.get(tmpMonth);
                        complaint += Integer.parseInt(tmpobj.getComplaintQuantity());
                        monthList.put(tmpMonth, complaint);
                        hasMonth = true;
                        break;
                    }
                }
                if(hasMonth == false){
                    monthList.put(YearMonth.of(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1), Integer.parseInt(tmpobj.getComplaintQuantity()));
                }
            }

            return "ok";

    }

}
