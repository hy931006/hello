package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2016/4/5.
 */
@RestController
public class HomeController {
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String home(){
        return "home";
    }
}
