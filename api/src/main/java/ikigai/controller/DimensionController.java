package ikigai.controller;

import ikigai.Json.DimensionJson;
import ikigai.entity.Dimension;
import ikigai.service.DimensionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dimension")
public class DimensionController {
    @Autowired
    private DimensionService dimensionService;

    @PostMapping("/new")
    public Dimension newDimension(@RequestBody DimensionJson dimensionJson) {
        return dimensionService.newDimension(dimensionJson);
    }

    @PostMapping("/id/{dimensionId}/topic/{topicId}")
    public Dimension newIntelligenceArea(@PathVariable Long dimensionId, @PathVariable Long topicId) {
        return dimensionService.generateDimensionTopic(dimensionId, topicId);
    }
}
