package night.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author night
 * @version 1.1.0
 * @Date 2020/1/8 16:00
 */
@Service
public class ConsumeService {

    private Log log = LogFactory.getLog(this.getClass());
    @Autowired
    private RestTemplate template;

    @HystrixCommand(fallbackMethod = "error")
    public String getName(){
        return template.getForEntity("http://provider/provider/getName",String.class).getBody();
    }

    public String error(Throwable e){
        log.error(e.getMessage());
        return "oh ,you are wrong";
    }
}
