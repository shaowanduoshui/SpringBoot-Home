package cn.van.dubbo.controller;

import cn.van.dubbo.domain.UserDomain;
import cn.van.dubbo.service.DubboService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @since 1.0.0
 */
@RestController
@RequestMapping("/consumer")
public class DubboTestController {

    @Resource
    private DubboService dubboService;

    @GetMapping("/getInfo")
    public UserDomain user() {
        return dubboService.findUser();
    }
}