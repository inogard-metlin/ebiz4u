package kr.co.inogard.ebiz4u.service.rfq;

import kr.co.inogard.ebiz4u.domain.rfq.TbRfq;
import kr.co.inogard.ebiz4u.repository.rfq.RfqRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RfqService {
    private final RfqRepository rfqRepository;

    public TbRfq getRfqByRfqNo(String rfqNo) {
        Optional<TbRfq> byId = rfqRepository.findById(rfqNo);

        if (!byId.isPresent()) return null;

        return byId.get();
    }

//    public List<TbRfq> getRfqByOrgCd(String orgCd) {
//        return rfqRepository.findByOrgCd(orgCd);
//    }
}
