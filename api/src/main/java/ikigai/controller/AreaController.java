package ikigai.controller;

import ikigai.Json.AreaJson;
import ikigai.entity.Area;
import ikigai.entity.Intelligence;
import ikigai.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/area")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @PostMapping("/new")
    public Area newArea(@RequestBody AreaJson areaJson) {
        return areaService.newArea(areaJson);
    }

    @PostMapping("/id/{areaId}/dimension/{dimensionId}")
    public Area newDimensionArea(@PathVariable Long dimensionId, @PathVariable Long areaId) {
        return areaService.generateDimensionArea(dimensionId, areaId);
    }
}
