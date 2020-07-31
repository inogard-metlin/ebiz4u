package kr.co.inogard.ebiz4u.common.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TaxTypeCd {
    A1000("매입VAT 10%"),
    A6000("매입VAT 0%(영세율)"),
    AI000("Invoice(비과세)");

    private String codeNm;
}
