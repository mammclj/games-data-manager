package com.msymobile.games.gamesdatamanager.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 马孟孟【mamengbile.com】
 * @Date 2017/10/18 14:27
 */
@Controller
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);
    @RequestMapping("/testFreemarker")
    public String testFreemarker(HttpServletRequest request){
        request.setAttribute("name","test ni hao ");
        return "index";
    }
    @RequestMapping("/getWorkbenchHtml")
    public String getWorkbenchHtml(){
        return "workbench";
    }
    @RequestMapping("/getAccountManagementHtml")
    public String getAccountManagementHtml(){
        return "accountmanagement";
    }
    @RequestMapping("/getSPManagerHtml")
    public String getSPManagerHtml(){
        return "SPManager";
    }
    @RequestMapping("/getCodeManagerHtml")
    public String getCodeManagerHtml(){
        return "CodeManager";
    }
    @RequestMapping("/getAPPManagerHtml")
    public String getAPPManagerHtml(){
        return "APPManager";
    }
    @RequestMapping("/getDistributionChannelManagementHtml")
    public String getDistributionChannelManagementHtml(){
        return "distributionChannelManagement";
    }
    @RequestMapping("/getGamePromotionDataStatisticsHtml")
    public String getGamePromotionDataStatisticsHtml(){
        return "gamePromotionDataStatistics";
    }
    @RequestMapping("/getGamePromotionMonthDataStatisticsHtml")
    public String getGamePromotionMonthDataStatisticsHtml(){
        return "gamePromotionMonthDataStatistics";
    }
    @RequestMapping("/getSPDataStatisticsHtmlHtml")
    public String getSPDataStatisticsHtmlHtml(){
        return "SPDataStatistics";
    }
    @RequestMapping("/getSPMonthDataStatisticsHtmlHtml")
    public String getSPMonthDataStatisticsHtmlHtml(){
        return "SPMonthDataStatistics";
    }

}
