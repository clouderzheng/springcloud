package night.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author night
 * @version 1.1.0
 * @Date 2020/1/14 16:56
 */
@FeignClient(name = "gzip",url = "https://api.caiyunapp.com/v2/TAkhjf8d1nlSlspN/121.6544,25.1552")
public interface FeignGzipService {

    @RequestMapping(value = "/forecast.json")
    ResponseEntity<byte[]> searchRepo();
}
