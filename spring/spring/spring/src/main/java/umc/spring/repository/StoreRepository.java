package umc.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import umc.spring.Model.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {
    // 추가적인 쿼리 메소드가 필요하다면 여기에 추가할 수 있습니다.
}
