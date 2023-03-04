package com.chen.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chen.dogapicommon.model.entity.InterfaceInfo;

/**
 *
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
