package kr.co.inogard.ebiz4u.repository.common;

import kr.co.inogard.ebiz4u.domain.common.TbPurorg;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TbPurorgRepository extends JpaRepository<TbPurorg, String> {
    TbPurorg findByOrgCd(String orgCd);
}
