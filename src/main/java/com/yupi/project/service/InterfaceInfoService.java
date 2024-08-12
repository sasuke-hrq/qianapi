package com.yupi.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.project.model.entity.InterfaceInfo;

/**
* @author Han Ruiqian
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-08-12 19:25:51
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    /**
     * 校验
     *
     * @param interfaceInfo
     * @param add 是否为创建校验
     */
    void validinterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
