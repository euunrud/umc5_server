package umc.spring.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import umc.spring.Model.Mission;
import umc.spring.Model.Store;
import umc.spring.common.exception.ResourceNotFoundException;
import umc.spring.converter.MissionConverter;
import umc.spring.dto.MissionDTO;
import umc.spring.repository.MissionRepository;
import umc.spring.repository.StoreRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service
public class StoreService {

    private final StoreRepository storeRepository;
    private final MissionRepository missionRepository;
    private final MissionConverter missionConverter;

    // 생성자 주입
    public StoreService(StoreRepository storeRepository, MissionRepository missionRepository, MissionConverter missionConverter) {
        this.storeRepository = storeRepository;
        this.missionRepository = missionRepository;
        this.missionConverter = missionConverter;
    }

    public Page<MissionDTO> getStoreMissions(Long storeId, Integer page) {
        // 가게 정보 확인
        Store store = storeRepository.findById(storeId)
                .orElseThrow(() -> new ResourceNotFoundException("Store not found with id: " + storeId));

        // 미션 페이징 처리
        Pageable pageable = PageRequest.of(page - 1, 10);
        Page<Mission> missionPage = missionRepository.findByStore(store, pageable);

        // 미션을 MissionDTO로 변환
        return missionPage.map(missionConverter::convertToDTO);
    }

    public boolean isStoreExist(Long storeId) {
        Optional<Store> storeOptional = storeRepository.findById(storeId);
        return storeOptional.isPresent();
    }
}
