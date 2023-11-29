package umc.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umc.spring.Model.Mission;
import umc.spring.Model.Store;
import umc.spring.converter.MissionConverter;
import umc.spring.dto.MissionRequest;
import umc.spring.repository.MissionRepository;
import umc.spring.repository.StoreRepository;

import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MissionService {

    private final MissionRepository missionRepository;
    private final StoreRepository storeRepository;
    private final MissionConverter missionConverter;

    @Autowired
    public MissionService(MissionRepository missionRepository, StoreRepository storeRepository, MissionConverter missionConverter) {
        this.missionRepository = missionRepository;
        this.storeRepository = storeRepository;
        this.missionConverter = missionConverter;
    }

    public void addMission(MissionRequest missionRequest, Long storeId) {
        Store store = storeRepository.findById(storeId)
                .orElseThrow(() -> new EntityNotFoundException("Store not found with id: " + storeId));

        Mission mission = missionConverter.convertToEntity(missionRequest);
        mission.setStore(store);

        missionRepository.save(mission);
    }
}
