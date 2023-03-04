package com.chen.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chen.dogapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
 * @Entity com.chen.project.model.entity.UserInterfaceInfo
 */
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




