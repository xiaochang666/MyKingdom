package io.imking.core.controller;

import io.imking.core.domain.KDMedals;
import io.imking.core.domain.KDUser;
import io.imking.core.service.PersonalCenterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

/**
 * Created by Admin on 2017/12/5.
 */
@Controller
public class PersonalCenterController {
    private PersonalCenterService personalCenterService;

    @Autowired
    public PersonalCenterController(PersonalCenterService personalCenterService) {
        this.personalCenterService = personalCenterService;
    }

    /**
     * 个人中心头部页面跳转
     */
    @RequestMapping(value = "/personal/center/head/{id}")
    public ModelAndView headerPage(@PathVariable("id") long id) {
        ModelAndView model = new ModelAndView("personal_center_head");
        KDUser user = personalCenterService.findById(id);
        List<KDMedals> allMedals = personalCenterService.findAllMedalsById(id);
        model.addObject("user", user);
        model.addObject("allMedals", allMedals);
        return model;
    }

    /**
     * 个人中心个人信息修改
     */
    @RequestMapping(value = "/personal/info/modify/{id}")
    public ModelAndView personalModify(@PathVariable("id") String id) {
        long rid=0l;
        if(id!=null&&!"".equals(id))
            rid=Long.parseLong(id);
        ModelAndView model = new ModelAndView("personal_info_modify");
        KDUser user = personalCenterService.findById(rid);
        model.addObject("user", user);
        return model;
    }

    @RequestMapping(value = "/personal/info/save")
    public ModelAndView personalSave(@ModelAttribute KDUser user) {
        ModelAndView model = new ModelAndView("success");
        KDUser kdUser = personalCenterService.findById(user.getId());
        kdUser.setAddress(user.getAddress());
        kdUser.setSex(user.getSex());
        kdUser.setWorkyears(user.getWorkyears());
        kdUser.setJob(user.getJob());
        kdUser.setIntroduce(user.getIntroduce());
        kdUser.setNickname(user.getNickname());
        kdUser.setTruename(user.getTruename());
        kdUser.setUpdatetime(new Date());
        personalCenterService.saveKDUser(kdUser);
        return model;
    }

}
