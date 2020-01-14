package night.springcloud.controller;

import com.night.common.domain.UserDomain;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

/**
 * @author night
 * @version 1.1.0
 * @Date 2020/1/13 17:39
 */
@RequestMapping("/param")
@RestController
public class ParamController {

    private Log log = LogFactory.getLog(this.getClass());

    @RequestMapping("/name")
    public String hello(@RequestParam  String name){
        return "hello  param" + name;
    }
    @RequestMapping("/nameAndAge")
    public String hello(@RequestHeader String name,@RequestHeader Integer age){
        return "hello header " + name+", you are " + age;
    }
    @RequestMapping("/object")
    public String hello(@RequestBody UserDomain user) throws Exception {

//        long sleepTime = new Random().nextInt(4000);
//        log.info("sleeptime ---》 "+ sleepTime);
//        Thread.sleep(sleepTime);
        return "hello  body ," + user.getName()+", you are " + user.getAge();
    }
}
