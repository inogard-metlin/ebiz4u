package kr.co.inogard.ebiz4u.domain.rfq;

import kr.co.inogard.ebiz4u.common.constant.BidSubTypecd;
import kr.co.inogard.ebiz4u.common.constant.PrTypecd;
import kr.co.inogard.ebiz4u.common.constant.RfqTypecd;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import javax.persistence.*;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_rfq")
public class TbRfq {
  @Id
  @Column(name = "rfq_no", columnDefinition = "char", length = 20)
  private String rfqNo;

  @Column(name = "bef_rfq_no", columnDefinition = "char", length = 20)
  private String befRfqNo;

  @Column(name = "ttl")
  private String ttl;

  @Enumerated(EnumType.STRING)
  @Column(name = "pr_typecd", columnDefinition = "char", length = 1)
  private PrTypecd prTypecd;

  @Enumerated(EnumType.STRING)
  @Column(name = "rfq_typecd", columnDefinition = "char", length = 1)
  private RfqTypecd rfqTypecd;

  @Column(name = "bid_typecd", columnDefinition = "char", length = 1)
  private String bidTypecd;

  @Column(name = "bid_sub_typecd", columnDefinition = "char", length = 1)
  private String bidSubTypecd;

  @Column(name = "pay_cond_rmrk")
  private String payCondRmrk;

  @Column(name = "delay_rate", columnDefinition = "numeric(14,2)")
  private Double delayRate;

  @Column(name = "prfm_insr_yn", columnDefinition = "char", length = 1)
  private String prfmInsrYn;

  @Column(name = "prfm_insr_rmrk")
  private String prfmInsrRmrk;

  @Column(name = "join_rmrk")
  private String joinRmrk;

  @Column(name = "join_expire_dt")
  private Timestamp joinExpireDt;

  @Column(name = "rfqdoc_yn", columnDefinition = "char", length = 1)
  private String rfqdocYn;

  @Column(name = "rfqdoc_expire_dt")
  private Timestamp rfqdocExpireDt;

  @Column(name = "rfqdoc_rmrk")
  private String rfqdocRmrk;

  @Column(name = "bid_start_dt")
  private Timestamp bidStartDt;

  @Column(name = "bid_open_dt")
  private Timestamp bidOpenDt;

  @Column(name = "bid_expire_dt")
  private Timestamp bidExpireDt;

  @Column(name = "extend_yn", columnDefinition = "char", length = 1)
  private String extendYn;

  @Column(name = "extend_dt")
  private Timestamp extendDt;

  @Column(name = "spot_dscr_yn", columnDefinition = "char", length = 1)
  private String spotDscrYn;

  @Column(name = "spot_dscr_usrcd", columnDefinition = "char", length = 10)
  private String spotDscrUsrcd;

  @Column(name = "spot_dscr_dt")
  private Timestamp spotDscrDt;

  @Column(name = "spot_dscr_loc")
  private String spotDscrLoc;

  @Column(name = "techdoc_yn", columnDefinition = "char", length = 1)
  private String techdocYn;

  @Column(name = "techdoc_expire_dt")
  private Timestamp techdocExpireDt;

  @Column(name = "techdoc_rmrk")
  private String techdocRmrk;

  @Column(name = "end_dt")
  private Timestamp endDt;

  @Column(name = "end_rmrk")
  private String endRmrk;

  @Column(name = "cont_fr_dt")
  private Timestamp contFrDt;

  @Column(name = "cont_to_dt")
  private Timestamp contToDt;

  @Column(name = "open_certno", columnDefinition = "char", length = 15)
  private String openCertno;

  @Column(name = "chrg_usrcd", columnDefinition = "char", length = 10)
  private String chrgUsrcd;

  @Column(name = "dlv_cond_rmrk")
  private String dlvCondRmrk;

  @Column(name = "dlv_req_dt")
  private Timestamp dlvReqDt;

  @Column(name = "dlv_loc")
  private String dlvLoc;

  @Column(name = "org_cd", columnDefinition = "char", length = 5)
  private String orgCd;

  @Column(name = "reg_usrcd", columnDefinition = "char", length = 10)
  private String regUsrcd;

  @Column(name = "reg_dt")
  private Timestamp regDt;

  @Column(name = "spot_dscr_rmrk")
  private String spotDscrRmrk;

  @Column(name = "rfq_rmrk")
  private String rfqRmrk;

  @Column(name = "rfq_st", columnDefinition = "char", length = 2)
  private String rfqSt;

  @Column(name = "cont_cond_rmrk")
  private String contCondRmrk;

  @Column(name = "bid_plan_amt", columnDefinition = "money")
  private String bidPlanAmt;

  @Column(name = "nonbid_rslt_rmrk")
  private String nonbidRsltRmrk;

  @Column(name = "choice_rslt_rmrk")
  private String choiceRsltRmrk;

  @Column(name = "techdoc_rslt_rmrk")
  private String techdocRsltRmrk;

  @Column(name = "rebid_rslt_rmrk")
  private String rebidRsltRmrk;

  @Column(name = "nonbid_rslt_dt")
  private Timestamp nonbidRsltDt;

  @Column(name = "rebid_rslt_dt")
  private Timestamp rebidRsltDt;

  @Column(name = "choice_noti_flag", columnDefinition = "char", length = 1)
  private String choiceNotiFlag;

  @Column(name = "notify_rebid_yn", columnDefinition = "char", length = 1)
  private String notifyRebidYn;

  @Column(name = "rank_open_flag", columnDefinition = "char", length = 1)
  private String rankOpenFlag;

  @Column(name = "tax_typecd", columnDefinition = "char", length = 5)
  private String taxTypecd;

  @Column(name = "ws_choice_typecd", columnDefinition = "char", length = 1)
  private String wsChoiceTypecd;

  @Column(name = "bid_insr_yn", columnDefinition = "char", length = 1)
  private String bidInsrYn;

  @Column(name = "bid_insr_rate", columnDefinition = "numeric(14,2)")
  private Double bidInsrRate;

  @Column(name = "bid_inpt_yn", columnDefinition = "char", length = 1)
  private String bidInptYn;

  @Column(name = "rfq_edit_rmrk")
  private String rfqEditRmrk;

  @Column(name = "rfq_edit_yn", columnDefinition = "char", length = 1)
  private String rfqEditYn;

  @Column(name = "sub_org_cd", columnDefinition = "char", length = 7)
  private String subOrgCd;

  @Column(name = "wired_pr_no", columnDefinition = "char", length = 20)
  private String wiredPrNo;

  @Column(name = "io_flag")
  private String ioFlag;

  @Column(name = "stdcrcy_cd")
  private String stdcrcyCd;

  @Column(name = "quot_rev", columnDefinition = "char", length = 2)
  private String quotRev;

  @Column(name = "quot_file_yn")
  private String quotFileYn;

  @Column(name = "all_amt_yn", columnDefinition = "char", length = 1)
  private String allAmtYn;

  @Column(name = "spot_dscr_usrnm")
  private String spotDscrUsrnm;

  @Column(name = "spot_dscr_usrtel")
  private String spotDscrUsrtel;

  @Column(name = "doc_params")
  private String docParams;

  @Column(name = "bid_inv_amt", columnDefinition = "money")
  private String bidInvAmt;

  @Column(name = "nego_st", columnDefinition = "char", length = 2)
  private String negoSt;

  @Column(name = "tech_ratio")
  private String techRatio;

  @Column(name = "amt_ratio")
  private String amtRatio;

  @Column(name = "bid_plan_crcy_cd")
  private String bidPlanCrcyCd;

  @Column(name = "bid_plan_crcy_rate", columnDefinition = "money")
  private String bidPlanCrcyRate;

  @Column(name = "file_param")
  private String fileParam;

  @Column(name = "pay_typecd")
  private String payTypecd;

  @Column(name = "session_cnt")
  private Integer sessionCnt;

  @Column(name = "noti_allow_typecd")
  private String notiAllowTypecd;

  @Column(name = "basic_plan_amt", columnDefinition = "money")
  private String basicPlanAmt;

  @Column(name = "min_plan_amt_range", columnDefinition = "money")
  private String minPlanAmtRange;

  @Column(name = "max_plan_amt_range", columnDefinition = "money")
  private String maxPlanAmtRange;

  @Column(name = "plan_amt_sel_cnt")
  private Integer planAmtSelCnt;

  @Column(name = "bid_many_enc_amt", columnDefinition = "text")
  private String bidManyEncAmt;

  @Column(name = "bid_many_cnt")
  private Integer bidManyCnt;

  @Column(name = "plan_way")
  private String planWay;

  @Column(name = "selected_bidder_std")
  private String selectedBidderStd;

  @Column(name = "bidder_rate", columnDefinition = "money")
  private String bidderRate;

  @Column(name = "join_yn", columnDefinition = "char", length = 1)
  private String joinYn;

  @Column(name = "rcmd_yn", columnDefinition = "char", length = 1)
  private String rcmdYn;

  @Column(name = "tech_score_yn", columnDefinition = "char", length = 1)
  private String techScoreYn;

  @Column(name = "rfq_doc_no")
  private String rfqDocNo;

  @Column(name = "lottery_yn", columnDefinition = "char", length = 1)
  private String lotteryYn;

  @Column(name = "fi_usrcd")
  private String fiUsrcd;

  @Column(name = "nego_suitable_score")
  private String negoSuitableScore;

  @Column(name = "eval_score_open_yn", columnDefinition = "char", length = 1)
  private String evalScoreOpenYn;

  @Column(name = "nego_suitable_choice_way", columnDefinition = "char", length = 1)
  private String negoSuitableChoiceWay;

  @Column(name = "basic_plan_amt_open_yn")
  private String basicPlanAmtOpenYn;

  @Column(name = "cancel_rmrk")
  private String cancelRmrk;

  @Column(name = "bid_plan_tot_amt", columnDefinition = "money")
  private String bidPlanTotAmt;

  @Column(name = "regong_rslt_dt")
  private Timestamp regongRsltDt;

  @Column(name = "regong_rslt_rmrk")
  private String regongRsltRmrk;

  @Column(name = "rfq_no_favor")
  private String rfqNoFavor;

  @Column(name = "not_bill_yn")
  private String notBillYn;

  @Column(name = "not_bill_dt")
  private Timestamp notBillDt;
}
