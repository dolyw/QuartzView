package com.example.service.impl;

import com.example.common.impl.BaseServiceImpl;
import com.example.model.SystemJob;
import com.example.service.ISystemJobService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * SystemJobServiceImpl
 * @author CodeGenerator
 * @date 2019/01/24 18:44
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SystemJobServiceImpl extends BaseServiceImpl<SystemJob> implements ISystemJobService {
}
