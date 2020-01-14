package night.springcloud.service.serviceImpl;

import com.night.common.domain.UserDomain;
import night.springcloud.service.FeignService;
import org.springframework.stereotype.Service;

/**
 * @author night
 * @version 1.1.0
 * @Date 2020/1/14 15:58
 */
@Service
public class FeignFallbackService implements FeignService {
    @Override
    public String getName() {

        return " getName error";
    }

    @Override
    public String hello(String name) {

        return "hello name error";
    }

    @Override
    public String hello(String name, Integer age) {
        return "hello name age error";
    }

    @Override
    public String hello(UserDomain user) {

        return "hello object error";
    }
}
