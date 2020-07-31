package kr.co.inogard.ebiz4u.common.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PayTypeCd {
    MRA10("현금"),
    MRA99("신용카드"),
    MRAC0("탐즈(B2B구매자금)"),
    MRAE0("NH농협에스크로"),
    MRAF0("IBK안심이체"),
    MRAG0("우리에스크로");

    private String codeNm;
}
