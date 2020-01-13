package night.springcloud.controller;

import night.springcloud.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author night
 * @version 1.1.0
 * @Date 2020/1/13 16:47
 */
@RequestMapping("/feign")
@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;

    @RequestMapping("/getName")
    public String getName(){
        return feignService.getName();
    }
}
