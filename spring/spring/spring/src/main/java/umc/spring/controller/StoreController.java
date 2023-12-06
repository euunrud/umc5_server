package umc.spring.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umc.spring.Model.Mission;
import umc.spring.Validation.annotation.CheckPage;
import umc.spring.dto.MissionDTO;
import umc.spring.dto.ReviewDTO;
import umc.spring.service.StoreService;

import java.util.List;

@RestController
@RequestMapping("/api/store")
public class StoreController {

    private final StoreService storeService;

    // 생성자 주입
    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/{storeId}/missions")
    @ApiOperation("가게의 미션 조회 API입니다.")
    public ResponseEntity<Page<MissionDTO>> getStoreMissions(
            @PathVariable Long storeId,
            @CheckPage @RequestParam(name = "page") Integer page) {

        Page<MissionDTO> missions = storeService.getStoreMissions(storeId, page);
        return new ResponseEntity<>(missions, HttpStatus.OK);
    }
}

