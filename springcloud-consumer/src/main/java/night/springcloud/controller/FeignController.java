package night.springcloud.controller;

import com.night.common.domain.UserDomain;
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

    @RequestMapping("/param")
    public String getByParam(){
        StringBuffer buffer = new StringBuffer();

        buffer.append(feignService.hello("night")).append("\n");
        buffer.append(feignService.hello("night",25)).append("\n");
        UserDomain domain = new UserDomain();
        domain.setName("night");
        domain.setAge(25);
        buffer.append(feignService.hello(domain)).append("\n");

        return buffer.toString();
    }
}
