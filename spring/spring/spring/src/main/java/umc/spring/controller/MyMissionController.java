package umc.spring.controller;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import umc.spring.Model.User;
import umc.spring.Validation.annotation.CheckPage;
import umc.spring.dto.MyMissionDTO;
import umc.spring.service.MyMissionService;

@RestController
@RequestMapping("/api/mymissions")
@Api(tags = "자신의 진행중인 미션 조회 API")
public class MyMissionController {

    private final MyMissionService myMissionService;

    public MyMissionController(MyMissionService myMissionService) {
        this.myMissionService = myMissionService;
    }

    @GetMapping("/in-progress")
    @ApiOperation("Get in-progress missions for the current user with paging")
    public ResponseEntity<Page<MyMissionDTO>> getInProgressMissions(
            User user,
            @CheckPage @RequestParam(name = "page") Integer page) {

        Long userId = user.getUserId();
        Page<MyMissionDTO> myMissions = myMissionService.getInProgressMissions(userId, page);
        return new ResponseEntity<>(myMissions, HttpStatus.OK);
    }
}
