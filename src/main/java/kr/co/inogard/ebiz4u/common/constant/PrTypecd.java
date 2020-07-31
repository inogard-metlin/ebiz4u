package kr.co.inogard.ebiz4u.common.constant;

import lombok.Getter;

@Getter
public enum PrTypecd {
    A("매각"), E("잡수입"), N("물품"), S("공사"), T("위탁관리"), W("용역");

    private String codeNm;

    PrTypecd(String codeNm) {
        this.codeNm = codeNm;
    }
}
