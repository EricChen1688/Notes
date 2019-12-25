package cn.eccto.study.eureka.consumer.controller;

import cn.eccto.study.eureka.consumer.feign.ConsumerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * description
 *
 * @author EricChen 2019/12/25 15:47
 */
@Controller
@RequestMapping("/feign")
public class FeignExampleController {

    @Autowired
    private ConsumerFeign consumerFeign;


    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return consumerFeign.helloWorld();
    }

}
