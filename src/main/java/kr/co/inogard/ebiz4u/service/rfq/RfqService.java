package kr.co.inogard.ebiz4u.service.rfq;

import kr.co.inogard.ebiz4u.common.constant.PrTypeCd;
import kr.co.inogard.ebiz4u.domain.rfq.QTbRfq;
import kr.co.inogard.ebiz4u.domain.rfq.TbRfq;
import kr.co.inogard.ebiz4u.repository.rfq.RfqRepository;
import kr.co.inogard.ebiz4u.repository.rfq.RfqRepositoryImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RfqService {
    private final RfqRepository rfqRepository;
    private final RfqRepositoryImpl rfqRepositoryImpl;

    public TbRfq getRfqByRfqNo(String rfqNo) {
        Optional<TbRfq> byId = rfqRepository.findById(rfqNo);

        if (!byId.isPresent()) return null;

        return byId.get();
    }

    public List<TbRfq> getRfqPurorgByOrgCd(String orgCd) {
        return rfqRepository.findRfqPurorgByOrgCd(orgCd);
    }

    public List<TbRfq> getRfqPurorgByOrgCdPrTypeCd(String orgCd, String prTypeCd) {
        return rfqRepository.findRfqPurorgByOrgCdPrTypeCd(orgCd, PrTypeCd.valueOf(prTypeCd));
    }

    public Iterable<TbRfq> getRfqPurorgByOrgCdPrTypeCdDsl(String orgCd, String prTypeCd) {
        QTbRfq tbRfq = QTbRfq.tbRfq;

        Iterable<TbRfq> iterTbRfq =
                rfqRepository.findAll(
                        tbRfq.purorg.orgCd.eq(orgCd)
                        .and(tbRfq.prTypeCd.eq(PrTypeCd.valueOf(prTypeCd)))
                );

        return iterTbRfq;
    }

    public List<TbRfq> getRfqPurorgByOrgCdPrTypeCdDslRepository(String orgCd, String prTypeCd) {
        return rfqRepositoryImpl.findRfqPurorgByOrgCdPrTypeCdQuerydslRepositorySupport(orgCd, prTypeCd);
    }
}
