package kr.co.inogard.ebiz4u.common.constant;

import lombok.Getter;

@Getter
public enum RfqTypecd {
    D("직접입찰"), N("일반계약"), U("단가계약");

    private String codeNm;

    RfqTypecd(String codeNm) {
        this.codeNm = codeNm;
    }
}
