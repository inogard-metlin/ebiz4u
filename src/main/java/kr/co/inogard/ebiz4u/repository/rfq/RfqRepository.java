package kr.co.inogard.ebiz4u.repository.rfq;

import kr.co.inogard.ebiz4u.domain.rfq.TbRfq;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RfqRepository extends JpaRepository<TbRfq, String> {
//    List<TbRfq> findByOrgCd(String orgCd);
}
