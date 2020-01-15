package night.springcloud.gateway;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

/**
 * @author night
 * @version 1.1.0
 * @Date 2020/1/15 16:40
 */
@Service
public class GateFilter extends ZuulFilter {


    private Log log = LogFactory.getLog(this.getClass());
    @Override
    public String filterType() {
        log.info("-------前置pre检查---------");
        return "pre";
    }

    @Override
    public int filterOrder() {

        log.info("-------拦截顺序0---------");
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        log.info("-------需要执行---------");
        return true;
    }

    @Override
    public Object run() throws ZuulException {

        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();

        String token = request.getParameter("token");
        if(token == null ){
            log.error("token not exist");
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseStatusCode(401);
            try {
                currentContext.setResponseBody("token无效，请重新登录后再试");
            } catch (Exception e) {
                e.printStackTrace();
            };
            currentContext.getResponse().setCharacterEncoding("gbk");
            return null;
        }

        log.info("it is ok ");
        return null;
    }
}
