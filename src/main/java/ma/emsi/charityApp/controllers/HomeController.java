package ma.emsi.charityApp.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("username", "John Doe"); // Here you can make it dynamic later
        return "home"; // This matches home.html
    }

    @GetMapping("/donate")
    public String donatePage() {
        return "donate"; // (You can create a donate.html later.)
    }
}
