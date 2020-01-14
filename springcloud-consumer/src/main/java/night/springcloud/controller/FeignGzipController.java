package night.springcloud.controller;

import night.springcloud.service.FeignGzipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author night
 * @version 1.1.0
 * @Date 2020/1/14 17:00
 */
@RequestMapping("gzip")
@RestController
public class FeignGzipController {

    @Autowired
    private FeignGzipService feignGzipService;

    @RequestMapping("/get")
    public ResponseEntity<byte[]> getGzip(){

        return feignGzipService.searchRepo();
    }
}
