package cn.van.dubbo.service.impl;

import cn.van.dubbo.domain.UserDomain;
import cn.van.dubbo.service.DubboService;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @since 1.0.0
 */
@Service("dubboService")
public class DubboServiceImpl implements DubboService {

    @Override
    public UserDomain findUser() {
        /**
         * 模拟查询出一条数据
         */
        UserDomain userDomain = new UserDomain();
        userDomain.setId(1001);
        userDomain.setUsername("scott");
        userDomain.setPassword("tiger");
        userDomain.setAge(20);
        userDomain.setGender(0);
        return userDomain;
    }
}