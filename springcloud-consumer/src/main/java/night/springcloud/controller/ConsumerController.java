package night.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import night.springcloud.service.ConsumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author night
 * @version 1.1.0
 * @Date 2020/1/3 14:57
 */
@RestController
@RequestMapping("/consume")
public class ConsumerController {


    @Autowired
    private ConsumeService consumeService;

    @RequestMapping("/getName")
    public  String consume(){
        return consumeService.getName();
    }

}
