package night.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author night
 * @version 1.1.0
 * @Date 2020/1/13 16:46
 */
@FeignClient("provider")
public interface FeignService {

    @RequestMapping("/provider/getName")
    public String getName();
}
