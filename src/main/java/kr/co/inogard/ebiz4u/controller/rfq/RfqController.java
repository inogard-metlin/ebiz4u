package kr.co.inogard.ebiz4u.controller.rfq;

import kr.co.inogard.ebiz4u.common.constant.BidSubTypecd;
import kr.co.inogard.ebiz4u.common.constant.BidTypecd;
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

//    @GetMapping("/org/{orgCd}")
//    public List<TbRfq> getRfqByOrgCd(@PathVariable String orgCd){
//        return rfqService.getRfqByOrgCd(orgCd);
//    }

}
