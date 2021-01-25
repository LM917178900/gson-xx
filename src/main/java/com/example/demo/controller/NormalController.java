package com.example.demo.controller;

//import com.alibaba.fastjson.JSONObject;
//import com.alibaba.fastjson.JSONPObject;
//import com.example.demo.mapper.SysLogMapper;
//import com.example.demo.model.ApiCode;
//import com.example.demo.model.ApiResult;
//import com.example.demo.model.SysLog;
//import com.example.demo.model.SysTask;
//import com.example.demo.service.INormalService;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//import java.util.List;
//import java.util.Map;
//
///**
// * @description: NormalController
// * @author: leiming5
// * @date: 2020-12-29 09:07
// */
//@RestController
//public class NormalController {
//
//    /**
//     * service 接口哦
//     */
//    @Resource
//    private INormalService normalService;
//
//    /**
//     * sysLog mapper
//     */
//    @Resource
//    private SysLogMapper sysLogMapper;
//
//    @GetMapping("/test/test")
//    public ApiResult test123( @RequestParam("id") Long id){
//
//        SysLog sysLog = sysLogMapper.getById(id);
//        System.out.println("==========> name:" + id);
//
////        JSONObject jb  = JSONObject.parseObject((String) sysLog.getLogData());
////
////        System.out.println("===>" + jb.getString("msg"));
////        System.out.println("===>" + jb.getString("data"));
////        System.out.println("===>" + jb.getString("time"));
//        return ApiResult.ok(sysLog);
//    }
//
//    /**
//     * 根据id 查询对象
//     *
//     * @param id id
//     * @return 对象
//     * @author leiming5
//     */
//    @GetMapping("normal/getById")
//    public ApiResult getById(Long id) throws InterruptedException {
//
//        Thread.sleep(3000);
//
//        if (id == null) {
//            return ApiResult.fail(ApiCode.PARAMETER_EXCEPTION);
//        }
//
//        return ApiResult.ok(normalService.getById(id));
//    }
//
//    @PostMapping("normal/postById")
//    public ApiResult postById(@RequestBody Long id) throws InterruptedException {
//
//        Thread.sleep(3000);
//
//        if (id == null) {
//            return ApiResult.fail(ApiCode.PARAMETER_EXCEPTION);
//        }
//
//        return ApiResult.ok(normalService.getById(id));
//    }
//
//    @PostMapping("normal/postByTask")
//    public ApiResult postById(@RequestBody SysTask sysTask) throws InterruptedException {
//
//        Thread.sleep(3000);
//
//        Long id = sysTask.getId();
//
//        if (id == null) {
//            return ApiResult.fail(ApiCode.PARAMETER_EXCEPTION);
//        }
//
//        return ApiResult.ok(normalService.getById(id));
//    }
//
//    /**
//     * 根据id 查询对象
//     *
//     * @param id id
//     * @return 对象
//     * @author leiming5
//     */
//    @GetMapping("normal/getByMap")
//    public ApiResult getByMap(Long id) throws InterruptedException {
//
//        Thread.sleep(9000);
//
//        if (id == null) {
//            return ApiResult.fail(ApiCode.PARAMETER_EXCEPTION);
//        }
//
//
//        return ApiResult.ok(normalService.getByMap(id));
//    }
//}
