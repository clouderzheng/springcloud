package night.springcloud.controller;

import com.night.common.domain.UserDomain;
import night.springcloud.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
//    @Qualifier("provider")
    private FeignService provider;

    @RequestMapping("/getName")
    public String getName(){
        return provider.getName();
    }

    @RequestMapping("/param")
    public String getByParam(){
        StringBuffer buffer = new StringBuffer();

        buffer.append(provider.hello("night")).append("\n");
        buffer.append(provider.hello("night",25)).append("\n");
        UserDomain domain = new UserDomain();
        domain.setName("night");
        domain.setAge(25);
        buffer.append(provider.hello(domain)).append("\n");

        return buffer.toString();
    }
}
