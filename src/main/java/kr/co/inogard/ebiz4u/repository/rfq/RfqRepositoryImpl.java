package kr.co.inogard.ebiz4u.repository.rfq;

import com.querydsl.jpa.JPQLQuery;
import kr.co.inogard.ebiz4u.common.constant.PrTypeCd;
import kr.co.inogard.ebiz4u.domain.rfq.QTbRfq;
import kr.co.inogard.ebiz4u.domain.rfq.TbRfq;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

public class RfqRepositoryImpl extends QuerydslRepositorySupport implements RfqCustomRepository {

    public RfqRepositoryImpl() {
        super(TbRfq.class);
    }

    @Override
    public List<TbRfq> findRfqPurorgByOrgCdPrTypeCdQuerydslRepositorySupport(String orgCd, String prTypeCd) {
        QTbRfq tbRfq = QTbRfq.tbRfq;

        JPQLQuery<TbRfq> query = from(tbRfq);

        query.where(tbRfq.purorg.orgCd.eq(orgCd));
        query.where(tbRfq.prTypeCd.eq(PrTypeCd.valueOf(prTypeCd)));

        return query.fetch();
    }
}
