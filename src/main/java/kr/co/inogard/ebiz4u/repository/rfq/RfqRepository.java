package kr.co.inogard.ebiz4u.repository.rfq;

import kr.co.inogard.ebiz4u.common.constant.PrTypeCd;
import kr.co.inogard.ebiz4u.domain.rfq.TbRfq;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RfqRepository extends JpaRepository<TbRfq, String>, QuerydslPredicateExecutor<TbRfq> {

    //@Query("SELECT r FROM TbRfq AS r JOIN TbPurorg p ON p.orgCd = r.purorg.orgCd WHERE p.orgCd = :orgCd")
    @Query("SELECT r FROM TbRfq AS r WHERE r.purorg.orgCd = :orgCd ORDER BY r.rfqNo desc")
    List<TbRfq> findRfqPurorgByOrgCd(@Param("orgCd") String orgCd);

    @Query("SELECT r FROM TbRfq AS r WHERE r.purorg.orgCd = :orgCd AND r.prTypeCd = :prTypeCd ORDER BY r.rfqNo DESC")
    List<TbRfq> findRfqPurorgByOrgCdPrTypeCd(String orgCd, PrTypeCd prTypeCd);

}