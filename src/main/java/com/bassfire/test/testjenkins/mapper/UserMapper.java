package com.bassfire.test.testjenkins.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bassfire.test.testjenkins.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @Description
 * @Author fengguangbao
 * @Date 2021/8/31 10:46
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}
