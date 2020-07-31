package kr.co.inogard.ebiz4u.domain.common;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_purorg")
public class TbPurorg {
  @Id
  @Column(name = "org_cd", columnDefinition = "char")
  private String orgCd;

  @Column(name = "use_yn", columnDefinition = "char")
  private String useYn;

  @Column(name = "org_nm")
  private String orgNm;

  @Column(name = "reg_dt")
  private Timestamp regDt;

  @OneToOne
  @JoinColumn(name = "cus_cd", columnDefinition = "char")
  @NotFound(action = NotFoundAction.IGNORE)
  private TbCuscode tbCuscode;

  @Column(name = "yearly_buy_amt", columnDefinition = "money")
  private String yearlyBuyAmt;

  @Column(name = "trust_cuscd", columnDefinition = "char")
  private String trustCuscd;

  @Column(name = "trust_typecd")
  private String trustTypecd;

  @Column(name = "trust_reg_dt")
  private Timestamp trustRegDt;

  @Column(name = "partner_mgmt_yn")
  private String partnerMgmtYn;

  @Column(name = "doc_params", columnDefinition = "text")
  private String docParams;


}
