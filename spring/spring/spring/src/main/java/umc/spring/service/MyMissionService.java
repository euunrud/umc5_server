package umc.spring.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import umc.spring.Model.MyMission;
import umc.spring.converter.MyMissionConverter;
import umc.spring.dto.MyMissionDTO;
import umc.spring.repository.MyMissionRepository;

@Service
public class MyMissionService {

    private final MyMissionRepository myMissionRepository;
    private final MyMissionConverter myMissionConverter;

    public MyMissionService(MyMissionRepository myMissionRepository, MyMissionConverter myMissionConverter) {
        this.myMissionRepository = myMissionRepository;
        this.myMissionConverter = myMissionConverter;
    }

    public Page<MyMissionDTO> getInProgressMissions(Long userId, Integer page) {
        Pageable pageable = PageRequest.of(page - 1, 10);
        Page<MyMission> myMissionPage = myMissionRepository.findByUserAndSof(userId, "false", pageable);

        return myMissionPage.map(myMissionConverter::convertToDTO);
    }
}
