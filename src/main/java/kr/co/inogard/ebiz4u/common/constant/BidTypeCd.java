package kr.co.inogard.ebiz4u.common.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

// 입찰종류2
@Getter
@AllArgsConstructor
public enum BidTypeCd {
    // BidSubTypecd.견적
    일반견적("1"),
    지명견적("8"),

    // BidSubTypecd.일반경쟁입찰
    일반경쟁("1"),

    // BidSubTypecd.제한경쟁입찰
    제한경쟁("1"),

    // BidSubTypecd.지명경쟁입찰
    지명경쟁("1"),

    // 공통
    협상에의한계약("5"),
    이단계입찰_규격가격분리("6"),
    이단계입찰_규격가격동시("7");

    private String codeNo;
}
