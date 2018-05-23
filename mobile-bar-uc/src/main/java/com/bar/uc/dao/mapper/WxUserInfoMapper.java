package com.bar.uc.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.bar.framework.common.IBaseMapper;
import com.bar.uc.example.WxUserInfoExample;
import com.bar.uc.pojo.WxUserInfo;

public interface WxUserInfoMapper extends IBaseMapper {
    long countByExample(WxUserInfoExample example);

    int deleteByExample(WxUserInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WxUserInfo record);

    int insertSelective(WxUserInfo record);

    List<WxUserInfo> selectByExample(WxUserInfoExample example);

    WxUserInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WxUserInfo record, @Param("example") WxUserInfoExample example);

    int updateByExample(@Param("record") WxUserInfo record, @Param("example") WxUserInfoExample example);

    int updateByPrimaryKeySelective(WxUserInfo record);

    int updateByPrimaryKey(WxUserInfo record);
}