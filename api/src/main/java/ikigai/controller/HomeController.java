package ikigai.controller;

import ikigai.Json.HomeJson;
import ikigai.entity.Home;
import ikigai.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/home")
public class HomeController {
    @Autowired
    private HomeService homeService;

    @PostMapping("/new")
    public Home newHome(@RequestBody HomeJson homeJson) {
        return homeService.newHome(homeJson);
    }
}
