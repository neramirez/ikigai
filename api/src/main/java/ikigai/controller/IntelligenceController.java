package ikigai.controller;

import ikigai.Json.IntelligenceJson;
import ikigai.entity.Intelligence;
import ikigai.service.IntelligenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/intelligence")
public class IntelligenceController {
    @Autowired
    private IntelligenceService intelligenceService;

    @PostMapping("/new")
    public Intelligence newIntelligence(@RequestBody IntelligenceJson intelligenceJson) {
        return intelligenceService.newIntelligence(intelligenceJson);
    }
}
