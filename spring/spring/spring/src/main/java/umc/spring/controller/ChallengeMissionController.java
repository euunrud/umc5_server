package umc.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import umc.spring.dto.ChallengeMissionRequest;
import umc.spring.service.ChallengeMissionService;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/challenge-missions")
public class ChallengeMissionController {

    private final ChallengeMissionService challengeMissionService;

    @Autowired
    public ChallengeMissionController(ChallengeMissionService challengeMissionService) {
        this.challengeMissionService = challengeMissionService;
    }

    @PostMapping("/{userId}")
    public ResponseEntity<String> challengeMission(
            @RequestBody @Valid ChallengeMissionRequest challengeMissionRequest,
            @PathVariable Long userId
    ) {
        challengeMissionService.challengeMission(challengeMissionRequest, userId);
        return ResponseEntity.ok("Mission challenged successfully");
    }
}
