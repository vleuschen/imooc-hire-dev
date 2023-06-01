package com.imooc.service.impl;

import com.imooc.model.Stu;
import com.imooc.mapper.StuMapper;
import com.imooc.service.StuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Akm
 * @since 2023-05-31
 */
@Slf4j
@Service
public class StuServiceImpl implements StuService {
    
    @Autowired
    private StuMapper stuMapper;

    @Transactional
    @Override
    public void saveStu(Stu stu) {
        int insert = stuMapper.insert(stu);
        log.info("insert Stu, result is {}", insert);
    }

}
