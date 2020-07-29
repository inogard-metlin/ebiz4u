package kr.co.inogard.ebiz4u.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_cuscode")
public class TbCuscode {
  @Id
  @Column(name = "cus_cd", columnDefinition = "char")
  private String cusCd;

  @Column(name = "use_yn", columnDefinition = "char")
  private String useYn;

  @Column(name = "cus_nm")
  private String cusNm;

  @Column(name = "cus_en_nm")
  private String cusEnNm;

  @Column(name = "valid_fr_dt")
  private Timestamp validFrDt;

  @Column(name = "bsn_no", columnDefinition = "char")
  private String bsnNo;

  @Column(name = "ceo_en_nm")
  private String ceoEnNm;

  @Column(name = "ceo_ssn")
  private String ceoSsn;

  @Column(name = "ceo_frgn_flag", columnDefinition = "char")
  private String ceoFrgnFlag;

  @Column(name = "valid_to_dt")
  private Timestamp validToDt;

  @Column(name = "ceo_nm")
  private String ceoNm;

  @Column(name = "main_tel")
  private String mainTel;

  @Column(name = "main_email")
  private String mainEmail;

  @Column(name = "area_typecd", columnDefinition = "char")
  private String areaTypecd;

  @Column(name = "main_fax")
  private String mainFax;

  @Column(name = "zip_cd")
  private String zipCd;

  @Column(name = "addr1")
  private String addr1;

  @Column(name = "addr2")
  private String addr2;

  @Column(name = "cus_typecd", columnDefinition = "char")
  private String cusTypecd;

  @Column(name = "uptae_nm")
  private String uptaeNm;

  @Column(name = "upjong_nm")
  private String upjongNm;

  @Column(name = "cus_st", columnDefinition = "char")
  private String cusSt;

  @Column(name = "main_homepage")
  private String mainHomepage;

  @Column(name = "accnt_bank_cd", columnDefinition = "char")
  private String accntBankCd;

  @Column(name = "reg_dt")
  private Timestamp regDt;

  @Column(name = "aprvl_dt")
  private Timestamp aprvlDt;

  @Column(name = "aprvl_usrcd", columnDefinition = "char")
  private String aprvlUsrcd;

  @Column(name = "accnt_nm")
  private String accntNm;

  @Column(name = "accnt_no")
  private String accntNo;

  @Column(name = "cus_rmrk")
  private String cusRmrk;

  @Column(name = "bill_flag", columnDefinition = "char")
  private String billFlag;

  @Column(name = "item_cls_flag", columnDefinition = "char")
  private String itemClsFlag;

  @Column(name = "watch_levl")
  private String watchLevl;

  @Column(name = "credit_levl")
  private String creditLevl;

  @Column(name = "corp_no", columnDefinition = "char")
  private String corpNo;

  @Column(name = "orig_filenm")
  private String origFilenm;

  @Column(name = "sign_filenm")
  private String signFilenm;

  @Column(name = "orig_file_hash")
  private String origFileHash;

  @Column(name = "sign_file_hash")
  private String signFileHash;

  @Column(name = "ebiz_sign_dt")
  private Timestamp ebizSignDt;

  @Column(name = "cus_sign_dt")
  private Timestamp cusSignDt;

  @Column(name = "ebiz_certdn")
  private String ebizCertdn;

  @Column(name = "cus_certdn")
  private String cusCertdn;

  @Column(name = "cont_dt")
  private Timestamp contDt;

  @Column(name = "cus_usrcd", columnDefinition = "char")
  private String cusUsrcd;

  @Column(name = "cont_no", columnDefinition = "char")
  private String contNo;

  @Column(name = "area1_typecd", columnDefinition = "char")
  private String area1Typecd;

  @Column(name = "area2_typecd", columnDefinition = "char")
  private String area2Typecd;

  @Column(name = "xi_sts", columnDefinition = "char")
  private String xiSts;

  @Column(name = "xi_date", columnDefinition = "char")
  private String xiDate;

  @Column(name = "xi_time", columnDefinition = "char")
  private String xiTime;

  @Column(name = "stop_rmrk")
  private String stopRmrk;

  @Column(name = "bill_month_yn", columnDefinition = "char")
  private String billMonthYn;

  @Column(name = "del_yn", columnDefinition = "char")
  private String delYn;

  @Column(name = "tax_cus_nm")
  private String taxCusNm;

  @Column(name = "tax_bsn_no", columnDefinition = "char")
  private String taxBsnNo;

  @Column(name = "tax_reg_id", columnDefinition = "char")
  private String taxRegId;

  @Column(name = "tax_ceo_nm")
  private String taxCeoNm;

  @Column(name = "tax_zip_cd", columnDefinition = "char")
  private String taxZipCd;

  @Column(name = "tax_addr1")
  private String taxAddr1;

  @Column(name = "tax_addr2")
  private String taxAddr2;

  @Column(name = "tax_uptae")
  private String taxUptae;

  @Column(name = "tax_upjong")
  private String taxUpjong;

  @Column(name = "cus_mgr_rmrk")
  private String cusMgrRmrk;

  @Column(name = "def_asp_id")
  private String defAspId;

  @Column(name = "cus_kind")
  private String cusKind;

  @Column(name = "apt_hhold_cnt", columnDefinition = "int")
  private Integer aptHholdCnt;

  @Column(name = "apt_dong_cnt", columnDefinition = "int")
  private Integer aptDongCnt;

  @Column(name = "apt_heat_dscr")
  private String aptHeatDscr;

  @Column(name = "apt_tot_harea_dscr")
  private String aptTotHareaDscr;

  @Column(name = "apt_afac_rmrk")
  private String aptAfacRmrk;

  @Column(name = "apt_wfac_rmrk")
  private String aptWfacRmrk;

  @Column(name = "apt_loc")
  private String aptLoc;

  @Column(name = "apt_loc_file_no", columnDefinition = "char")
  private String aptLocFileNo;

  @Column(name = "apt_mcf_area_mxm")
  private String aptMcfAreaMxm;

  @Column(name = "apt_heat_dscr_etc")
  private String aptHeatDscrEtc;

  @Column(name = "apt_afac_rmrk_etc")
  private String aptAfacRmrkEtc;

  @Column(name = "kapt_code")
  private String kaptCode;

  @Column(name = "cusbiz_typecd")
  private String cusbizTypecd;

  @Column(name = "join_type")
  private String joinType;

  @Column(name = "join_user_nm")
  private String joinUserNm;

  @Column(name = "deposit_yn")
  private String depositYn;

  @Column(name = "sb_buyer_yn")
  private String sbBuyerYn;


}
