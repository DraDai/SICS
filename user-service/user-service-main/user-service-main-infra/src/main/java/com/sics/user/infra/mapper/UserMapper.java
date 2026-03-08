package com.sics.user.infra.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sics.user.infra.dataobject.UserDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<UserDO> {
}
