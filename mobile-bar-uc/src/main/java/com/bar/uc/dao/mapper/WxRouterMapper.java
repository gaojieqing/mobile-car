package com.bar.uc.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bar.framework.common.IBaseMapper;
import com.bar.uc.example.WxRouterExample;
import com.bar.uc.pojo.WxRouter;

public interface WxRouterMapper extends IBaseMapper {
    long countByExample(WxRouterExample example);

    int deleteByExample(WxRouterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WxRouter record);

    int insertSelective(WxRouter record);

    List<WxRouter> selectByExample(WxRouterExample example);

    WxRouter selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WxRouter record, @Param("example") WxRouterExample example);

    int updateByExample(@Param("record") WxRouter record, @Param("example") WxRouterExample example);

    int updateByPrimaryKeySelective(WxRouter record);

    int updateByPrimaryKey(WxRouter record);
}