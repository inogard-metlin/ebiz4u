package kr.co.inogard.ebiz4u.domain.common;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_purorgdept")
public class TbPurorgdept {
  @Id
  @Column(name = "dept_cd", columnDefinition = "char")
  private String deptCd;

  @Column(name = "use_yn", columnDefinition = "char")
  private String useYn;

  @Column(name = "dept_nm")
  private String deptNm;

  @Column(name = "dept_tel")
  private String deptTel;

  @Column(name = "up_deptcd", columnDefinition = "char")
  private String upDeptcd;

  @Column(name = "reg_dt")
  private java.sql.Timestamp regDt;

  @Column(name = "reg_usrcd", columnDefinition = "char")
  private String regUsrcd;

  @Column(name = "org_cd", columnDefinition = "char")
  private String orgCd;

  @Column(name = "dept_nm_path")
  private String deptNmPath;

  @Column(name = "dept_cd_path")
  private String deptCdPath;

  @Column(name = "ui_grp", columnDefinition = "int")
  private Long uiGrp;

  @Column(name = "ui_levl", columnDefinition = "int")
  private Long uiLevl;

  @Column(name = "ui_step", columnDefinition = "int")
  private Long uiStep;


}
