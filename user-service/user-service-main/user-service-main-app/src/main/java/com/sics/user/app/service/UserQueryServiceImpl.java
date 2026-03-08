package com.sics.user.app.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.sics.base.common.ex.BaseException;
import com.sics.user.app.api.UserQueryService;
import com.sics.user.infra.dataobject.UserDO;
import com.sics.user.infra.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserQueryServiceImpl implements UserQueryService {
    private final UserMapper userMapper;
    @Override
    public String getPasswordHash(String username) {
        UserDO userDO = userMapper.selectOne(
                new LambdaQueryWrapper<UserDO>()
                        .eq(UserDO::getUsername, username)
        );
        if (userDO == null || userDO.getPasswordHash() == null) {
            throw new BaseException("用户不存在");
        }
        return userDO.getPasswordHash();
    }
}
