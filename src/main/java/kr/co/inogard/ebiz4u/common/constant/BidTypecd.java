package kr.co.inogard.ebiz4u.common.constant;

// 입찰종류2
public interface BidTypecd {
    // BidSubTypecd.견적
    String 일반견적 = "1";
    String 지명견적 = "8";

    // BidSubTypecd.일반경쟁입찰
    String 일반경쟁 = "1";

    // BidSubTypecd.제한경쟁입찰
    String 제한경쟁 = "1";

    // BidSubTypecd.지명경쟁입찰
    String 지명경쟁 = "1";

    // 공통
    String 협상에의한계약 = "5";
    String 이단계입찰_규격가격분리 = "6";
    String 이단계입찰_규격가격동시 = "7";
}
