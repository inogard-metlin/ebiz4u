package kr.co.inogard.ebiz4u.common.constant;

import lombok.Getter;

@Getter
public enum EvtIoType {
    OUT("송신"), IN("수신");

    private String codeNm;

    EvtIoType(String codeNm) {
        this.codeNm = codeNm;
    }
}
