package kr.co.inogard.ebiz4u.repository;

import kr.co.inogard.ebiz4u.domain.ApiPrmap;
import kr.co.inogard.ebiz4u.domain.ApiPrmapId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ApiPrmapRepository extends JpaRepository<ApiPrmap, ApiPrmapId> {
    @Query(nativeQuery = true, value = "SELECT * FROM api_prmap WHERE agt_cd = ?1 ORDER BY reg_dt DESC")
    List<ApiPrmap> findByAgtCd(String agtCd);
}
