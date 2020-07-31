package kr.co.inogard.ebiz4u.common.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum RfqTypeCd {
    D("직접입찰"), N("일반계약"), U("단가계약");

    private String codeNm;

}
