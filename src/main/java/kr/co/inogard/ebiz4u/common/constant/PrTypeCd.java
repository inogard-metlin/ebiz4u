package kr.co.inogard.ebiz4u.common.constant;

import lombok.Getter;

@Getter
public enum PrTypeCd {
    A("매각"), E("잡수입"), N("물품"), S("공사"), T("위탁관리"), W("용역");

    private String codeNm;

    PrTypeCd(String codeNm) {
        this.codeNm = codeNm;
    }
}
