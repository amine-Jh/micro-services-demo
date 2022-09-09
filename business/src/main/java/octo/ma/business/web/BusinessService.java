package octo.ma.business.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RefreshScope
@RestController
public class BusinessService {
    @Value("${xParam}")
    private int xParam;
    @Value("${yParam}")
    private int yParam;
    @Value("${me}")
    private String me;

    @Value("${spring.jpa.show-sql}")
    private String sqlt;

    @Value("${eureka.client.service-url.default-zone}")
    private String default_zone;



    @GetMapping("/config")
    public Map<String, Object> getConfig(){

        Map<String, Object> params= new HashMap<>();
        params.put("xParam",xParam);
        params.put("yParam",yParam);
        params.put("me",me);
        params.put("sql",sqlt);
        params.put("zone",default_zone);
        params.put("thread",Thread.currentThread().getName());

        return  params;

    }

}
