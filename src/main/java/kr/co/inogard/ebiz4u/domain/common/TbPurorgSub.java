package kr.co.inogard.ebiz4u.domain.common;

import kr.co.inogard.ebiz4u.common.constant.SelectYN;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_purorg_sub")
public class TbPurorgSub {

  @Id
  @Column(name = "sub_org_cd", columnDefinition = "char")
  private String subOrgCd;

  @Column(name = "org_cd", columnDefinition = "char")
  private String orgCd;

  @Column(name = "bsn_no", columnDefinition = "char")
  private String bsnNo;

  @Column(name = "corp_no", columnDefinition = "char")
  private String corpNo;

  @Column(name = "cus_nm")
  private String cusNm;

  @Column(name = "ceo_nm")
  private String ceoNm;

  @Column(name = "zip_cd", columnDefinition = "char")
  private String zipCd;

  @Column(name = "addr1")
  private String addr1;

  @Column(name = "addr2")
  private String addr2;

  @Column(name = "uptae_nm")
  private String uptaeNm;

  @Column(name = "upjong_nm")
  private String upjongNm;

  @Column(name = "main_tel")
  private String mainTel;

  @Column(name = "main_email")
  private String mainEmail;

  @Column(name = "main_fax")
  private String mainFax;

  @Column(name = "main_homepage")
  private String mainHomepage;

  @Column(name = "reg_dt")
  private java.sql.Timestamp regDt;

  @Column(name = "use_yn", columnDefinition = "char")
  @Enumerated(EnumType.STRING)
  private SelectYN useYn;

  @Column(name = "del_yn", columnDefinition = "char")
  @Enumerated(EnumType.STRING)
  private SelectYN delYn;

  @Column(name = "etc_nm")
  private String etcNm;

  @Column(name = "etc_nm_use_yn")
  @Enumerated(EnumType.STRING)
  private SelectYN etcNmUseYn;

  @Column(name = "fi_usrcd_use_yn", columnDefinition = "char")
  @Enumerated(EnumType.STRING)
  private SelectYN fiUsrcdUseYn;


}
