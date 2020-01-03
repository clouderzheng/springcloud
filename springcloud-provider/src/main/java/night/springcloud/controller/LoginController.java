package night.springcloud.controller;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author night
 * @version 1.1.0
 * @Date 2020/1/3 14:17
 */

@RestController
@RequestMapping("/provider")
public class LoginController {

    @RequestMapping("/getName")
    public String getName(){
        System.out.println("getinfo ----》");
        return "night";
    }
}
