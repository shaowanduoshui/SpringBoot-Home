package cn.van.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @公众号： 风尘博客
 * @Classname ResultCodeEnum
 * @Description 启动类
 * @Date 2020/4/30 8:55 下午
 * @Author by Van
 */
@SpringBootApplication
public class OrderConsumerApplication {

    private static final Logger logger = LoggerFactory.getLogger(OrderConsumerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(OrderConsumerApplication.class);
        logger.info("ConsumerApplication start!");
    }
}
