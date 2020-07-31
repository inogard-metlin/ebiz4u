package kr.co.inogard.ebiz4u.common.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum RfqSt {
    작성중("00"),
    참가신청중("01"),
    현장설명공고중("02"),
    서류제출중("03"),
    기술검토중("04"),
    견적공고중("05"),
    개찰("06"),
    계약품의중("07"),
    완료_정상("08"),
    완료_재입찰("09"),
    완료_유찰("10"),
    완료_수의입찰("11"),
    완료_정정("12"),
    완료_견적("14"),
    완료_취소("15"),
    낙찰무효("16"),
    수수료_세금계산서_임시입찰("17");

    private String codeNo;
}
