package ikigai.controller;

import ikigai.Json.DimensionJson;
import ikigai.entity.Dimension;
import ikigai.service.DimensionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dimension")
public class DimensionController {
    @Autowired
    private DimensionService dimensionService;

    @PostMapping("/new")
    public Dimension newDimension(@RequestBody DimensionJson dimensionJson) {
        return dimensionService.newDimension(dimensionJson);
    }
}
