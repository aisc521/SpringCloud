package com.aisc.aiscmember.mapper;

import com.aisc.aiscmember.pojo.AiscUser;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface AiscUserMapper extends Mapper<AiscUser> {
    String getUserInfoById(@Param("userId") Integer valueOf);
}