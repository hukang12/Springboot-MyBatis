package com.imooc.demo.dao;

import com.imooc.demo.entity.Area;

import java.util.List;

/**
 * @Description:
 * @Auther: zhaodx
 * @Date: 2020/2/19 19:18
 */
public interface AreaDao {
    //列出区域列表
    List<Area> queryArea();
    //根据Id列出具体区域
    Area queryAreaById(int areaId);
    //插入区域信息
    int insertArea(Area area);
    //更新区域信息
    int updateArea(Area area);
    //删除区域信息
    int deleteArea(int areaId);
}
