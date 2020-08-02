package kr.co.inogard.ebiz4u.common.constant;

// 입찰종류1

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BidSubTypeCd {
    지명경쟁입찰("1"), 일반경쟁입찰("2"), 견적("4"), 제한경쟁입찰("5");

    private String codeNo;

}
