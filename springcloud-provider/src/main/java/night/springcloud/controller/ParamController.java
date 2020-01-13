package night.springcloud.controller;

import com.night.common.domain.UserDomain;
import org.springframework.web.bind.annotation.*;

/**
 * @author night
 * @version 1.1.0
 * @Date 2020/1/13 17:39
 */
@RequestMapping("/param")
@RestController
public class ParamController {

    @RequestMapping("/name")
    public String hello(@RequestParam  String name){
        return "hello  param" + name;
    }
    @RequestMapping("/nameAndAge")
    public String hello(@RequestHeader String name,@RequestHeader Integer age){
        return "hello header " + name+", you are " + age;
    }
    @RequestMapping("/object")
    public String hello(@RequestBody UserDomain user){
        return "hello  body ," + user.getName()+", you are " + user.getAge();
    }
}
