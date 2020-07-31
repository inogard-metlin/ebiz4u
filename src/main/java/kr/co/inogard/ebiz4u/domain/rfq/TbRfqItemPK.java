package kr.co.inogard.ebiz4u.domain.rfq;

import lombok.Data;

import java.io.Serializable;

@Data
public class TbRfqItemPK implements Serializable {
    private String rfqNo;
    private String rfqSeq;
}
