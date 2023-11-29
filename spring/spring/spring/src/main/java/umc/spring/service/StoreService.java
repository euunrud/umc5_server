package umc.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umc.spring.Model.Store;
import umc.spring.repository.StoreRepository;

import java.util.Optional;

@Service
public class StoreService {

    private final StoreRepository storeRepository;

    @Autowired
    public StoreService(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    public boolean isStoreExist(Long storeId) {
        // storeRepository에서 해당 가게 ID로 가게를 조회하여 존재하는지 확인합니다.
        Optional<Store> storeOptional = storeRepository.findById(storeId);
        return storeOptional.isPresent();
    }
}
