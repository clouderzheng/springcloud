package night.springcloud.service;

import com.night.common.domain.UserDomain;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author night
 * @version 1.1.0
 * @Date 2020/1/13 16:46
 */
@FeignClient("provider")
public interface FeignService {

    @RequestMapping("/provider/getName")
    public String getName();

    @RequestMapping("/param/name")
    public String hello(@RequestParam String name);

    @RequestMapping("/param/nameAndAge")
    public String hello(@RequestHeader String name, @RequestHeader Integer age);

    @RequestMapping("/param/object")
    public String hello(@RequestBody UserDomain user);
}
