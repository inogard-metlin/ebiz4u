package kr.co.inogard.ebiz4u.common.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum IoFlag {
    D("내자"), F("외자");

    private String codeNm;
}
