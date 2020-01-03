package night.springcloud.controller;

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
    private RestTemplate template;
    @RequestMapping("/getName")
    public  String consume(){
        return template.getForEntity("http://provider/provider/getName",String.class).getBody();
    }
}
