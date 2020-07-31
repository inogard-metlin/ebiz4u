package kr.co.inogard.ebiz4u.domain.rfq;

import lombok.Data;

import java.io.Serializable;

@Data
public class TbRfqServicePK implements Serializable {
    private String rfqNo;
    private String rfqSeq;
    private String rfqSrvSeq;
}
