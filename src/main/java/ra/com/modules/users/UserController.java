package ra.com.modules.users;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/cart")
    public String booking() {
        return "cart";
    }

    @GetMapping("/checkout")
    public String menu() {
        return "checkout";
    }

    @GetMapping("/service")
    public String service() {
        return "service";
    }

    @GetMapping("/shop")
    public String team() {
        return "shop";
    }

    @GetMapping("/thank-you")
    public String testimonials() {
        return "thankyou";
    }

    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }

    @GetMapping("/login-register")
    public String login() {
        return "/login-register/login-register";
    }
}
