package kr.co.inogard.ebiz4u.common.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum WsChoiceTypeCd {
    C("승인필요"), I("단순메일");

    private String codeNm;
}
