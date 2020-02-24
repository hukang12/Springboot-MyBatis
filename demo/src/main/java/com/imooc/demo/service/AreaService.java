package com.imooc.demo.service;

import com.imooc.demo.entity.Area;

import java.util.List;

/**
 * @Description:
 * @Auther: zhaodx
 * @Date: 2020/2/21 20:47
 */
public interface AreaService {
    //列出区域列表
    List<Area> getAreaList();
    //根据Id列出具体区域
    Area getAreaById(int areaId);
    //插入区域信息
    boolean addArea(Area area);
    //更新区域信息
    boolean modifyArea(Area area);
    //删除区域信息
    boolean deleteArea(int areaId);
}
