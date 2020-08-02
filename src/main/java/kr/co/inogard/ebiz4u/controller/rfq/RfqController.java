package kr.co.inogard.ebiz4u.controller.rfq;

import kr.co.inogard.ebiz4u.domain.rfq.TbRfq;
import kr.co.inogard.ebiz4u.service.rfq.RfqService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rfqs")
public class RfqController {

    private final RfqService rfqService;

    @GetMapping("/rfq/{rfqNo}")
    public TbRfq getRfqByRfqNo(@PathVariable String rfqNo){
        return rfqService.getRfqByRfqNo(rfqNo);
    }

    @GetMapping("/rfq/orgs/{orgCd}")
    public List<TbRfq> getRfqPurorgByOrgCd(@PathVariable String orgCd){
        return rfqService.getRfqPurorgByOrgCd(orgCd);
    }

    @GetMapping("/rfq/orgs/{orgCd}/{prTypeCd}")
    public List<TbRfq> getRfqPurorgByOrgCdPrTypeCd(@PathVariable String orgCd, @PathVariable String prTypeCd){
        return rfqService.getRfqPurorgByOrgCdPrTypeCd(orgCd, prTypeCd);
    }

    @GetMapping("/rfq/orgs/dsl/{orgCd}/{prTypeCd}")
    public List<TbRfq> getRfqPurorgByOrgCdPrTypeCdDsl(@PathVariable String orgCd, @PathVariable String prTypeCd){
        return (List<TbRfq>) rfqService.getRfqPurorgByOrgCdPrTypeCdDsl(orgCd, prTypeCd);
    }

    @GetMapping("/rfq/orgs/dslrepository/{orgCd}/{prTypeCd}")
    public List<TbRfq> getRfqPurorgByOrgCdPrTypeCdDslRepository(@PathVariable String orgCd, @PathVariable String prTypeCd){
        return rfqService.getRfqPurorgByOrgCdPrTypeCdDslRepository(orgCd, prTypeCd);
    }

}
