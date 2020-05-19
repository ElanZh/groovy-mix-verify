package elan.learn.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张一然
 * @date 2020/5/19 11:08
 */
@RestController
@RequestMapping("hello")
public class Hello {
    @GetMapping("")
    public String hello() {
        return "hello!!!";
    }
}
