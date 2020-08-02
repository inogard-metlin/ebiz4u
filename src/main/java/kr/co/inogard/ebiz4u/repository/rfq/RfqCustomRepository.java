package kr.co.inogard.ebiz4u.repository.rfq;

import kr.co.inogard.ebiz4u.common.constant.PrTypeCd;
import kr.co.inogard.ebiz4u.domain.rfq.TbRfq;

import java.util.List;

public interface RfqCustomRepository {

    List<TbRfq> findRfqPurorgByOrgCdPrTypeCdQuerydslRepositorySupport(String orgCd, String prTypeCd);
}
