package umc.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import umc.spring.dto.MissionRequest;
import umc.spring.service.MissionService;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/missions")
public class MissionController {

    private final MissionService missionService;

    @Autowired
    public MissionController(MissionService missionService) {
        this.missionService = missionService;
    }

    @PostMapping("/{storeId}")
    public ResponseEntity<String> addMission(
            @RequestBody @Valid MissionRequest missionRequest,
            @PathVariable Long storeId
    ) {
        missionService.addMission(missionRequest, storeId);
        return ResponseEntity.ok("Mission added successfully");
    }
}
