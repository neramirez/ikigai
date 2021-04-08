package ikigai.controller;

import ikigai.Json.RelativeJson;
import ikigai.entity.Relative;
import ikigai.service.RelativeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/relative")
public class RelativeController {
    @Autowired
    private RelativeService relativeService;

    @PostMapping("/new")
    public Relative newRelative(@RequestBody RelativeJson relativeJson) {
        return relativeService.newRelative(relativeJson);
    }
}
