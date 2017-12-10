package io.imking.core.service;

import io.imking.core.domain.KDMedals;
import io.imking.core.domain.KDUser;
import io.imking.core.domain.KDUserMedal;
import io.imking.core.mapping.KDCrowdTaskMapper;
import io.imking.core.mapping.KDMedalsMapper;
import io.imking.core.mapping.KDUserMapper;
import io.imking.core.mapping.KDUserMedalMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/12/10.
 */
@Component
@Transactional
@Slf4j
public class PersonalCenterService {
    @Autowired
    private KDCrowdTaskMapper kdCrowdTaskMapper;
    @Autowired
    private KDMedalsMapper kdMedalsMapper;
    @Autowired
    private KDUserMapper kdUserMapper;
    @Autowired
    private KDUserMedalMapper kdUserMedalMapper;

    /**
     * 个人中心头部页面
     * 个人信息查询
     */
    public KDUser findById(final long id) {
        return kdUserMapper.selectByPrimaryKey(id);
    }

    /**
     * 个人中心头部页面
     * 获奖信息查询
     * */
    public List<KDMedals> findAllMedalsById(final long id){
        List<KDUserMedal> kdUserMedals = kdUserMedalMapper.selectMedalIdByUserId(id);
        List<KDMedals> listKDMedals = new ArrayList<>();
        for (KDUserMedal kdUserMedal:kdUserMedals){
            listKDMedals.add(kdMedalsMapper.selectByPrimaryKey(kdUserMedal.getId()));
        }
        return listKDMedals;
    }

    public void saveKDUser(KDUser user){
        kdUserMapper.updateByPrimaryKey(user);
    }
}
