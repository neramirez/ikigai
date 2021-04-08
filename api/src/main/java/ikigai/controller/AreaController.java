package ikigai.controller;

import ikigai.Json.AreaJson;
import ikigai.entity.Area;
import ikigai.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/area")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @PostMapping("/new")
    public Area newArea(@RequestBody AreaJson areaJson) {
        return areaService.newArea(areaJson);
    }
}
