package com.example.controller;

import com.example.common.ResponseBean;
import com.example.exception.CustomException;
import com.example.model.SystemJob;
import com.example.service.ISystemJobService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SystemJobController
 * @author CodeGenerator
 * @date 2019/01/24 18:44
 */
@RestController
@RequestMapping("/system/job")
public class SystemJobController {

    private final ISystemJobService systemJobService;

    @Autowired
    public SystemJobController(ISystemJobService systemJobService) {
        this.systemJobService = systemJobService;
    }

    /**
     * 列表
     * @author CodeGenerator
     * @date 2019/01/24 18:44
     */
    @PostMapping("/list")
    public ResponseBean list(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer rows) {
        if (page <= 0 || rows <= 0) {
            page = 1;
            rows = 10;
        }
        PageHelper.startPage(page, rows);
        List<SystemJob> list = systemJobService.selectAll();
        if (list == null || list.size() <= 0) {
            throw new CustomException("查询失败(Query Failure)");
        }
        PageInfo<SystemJob> pageInfo = new PageInfo<SystemJob>(list);
        Map<String, Object> result = new HashMap<String, Object>(16);
        result.put("count", pageInfo.getTotal());
        result.put("data", pageInfo.getList());
        return new ResponseBean(HttpStatus.OK.value(), "查询成功(Query was successful)", result);
    }

    /**
     * 查询
     * @author CodeGenerator
     * @date 2019/01/24 18:44
     */
    @PostMapping("/detail")
    public ResponseBean detail(@RequestParam Integer id) {
        SystemJob systemJob = systemJobService.selectByPrimaryKey(id);
        if (systemJob == null) {
            throw new CustomException("查询失败(Query Failure)");
        }
        return new ResponseBean(HttpStatus.OK.value(), "查询成功(Query was successful)", systemJob);
    }

    /**
     * 新增
     * @author CodeGenerator
     * @date 2019/01/24 18:44
     */
    @PostMapping("/add")
    public ResponseBean add(@RequestBody SystemJob systemJob) {
        int count = systemJobService.insert(systemJob);
        if (count <= 0) {
            throw new CustomException("新增失败(Insert Failure)");
        }
        return new ResponseBean(200, "新增成功(Insert Success)", systemJob);
    }

    /**
     * 更新
     * @author CodeGenerator
     * @date 2019/01/24 18:44
     */
    @PostMapping("/update")
    public ResponseBean update(@RequestBody SystemJob systemJob) {
        int count = systemJobService.updateByPrimaryKeySelective(systemJob);
        if (count <= 0) {
            throw new CustomException("更新失败(Update Failure)");
        }
        return new ResponseBean(200, "更新成功(Update Success)", systemJob);
    }

    /**
     * 删除
     * @author CodeGenerator
     * @date 2019/01/24 18:44
     */
    @PostMapping("/delete")
    public ResponseBean delete(@RequestParam Integer id) {
        int count = systemJobService.deleteByPrimaryKey(id);
        if (count <= 0) {
            throw new CustomException("删除失败，ID不存在(Deletion Failed. ID does not exist.)");
        }
        return new ResponseBean(200, "删除成功(Delete Success)", null);
    }

}
