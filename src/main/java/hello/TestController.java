package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by heyang on 16/4/5.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    public String test(){
        return "test";
    }
}
