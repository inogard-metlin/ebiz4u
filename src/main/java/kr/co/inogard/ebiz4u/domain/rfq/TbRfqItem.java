package kr.co.inogard.ebiz4u.domain.rfq;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_rfqitem")
@IdClass(TbRfqItemPK.class)
public class TbRfqItem {
  @Id
  @Column(name = "rfq_no", columnDefinition = "char")
  private String rfqNo;

  @Id
  @Column(name = "rfq_seq", columnDefinition = "char")
  private String rfqSeq;

  @Column(name = "pr_no", columnDefinition = "char")
  private String prNo;

  @Column(name = "pr_seq", columnDefinition = "char")
  private String prSeq;

  @Column(name = "cls_cd", columnDefinition = "char")
  private String clsCd;

  @Column(name = "item_cd", columnDefinition = "char")
  private String itemCd;

  @Column(name = "item_nm")
  private String itemNm;

  @Column(name = "unit_cd")
  private String unitCd;

  @Column(name = "qty", columnDefinition = "numeric(14,2)")
  private Double qty;

  @Column(name = "constr_loc")
  private String constrLoc;

  @Column(name = "item_rmrk")
  private String itemRmrk;

  @Column(name = "constr_fr_dt")
  private java.sql.Timestamp constrFrDt;

  @Column(name = "constr_to_dt")
  private java.sql.Timestamp constrToDt;

  @Column(name = "dlv_loc")
  private String dlvLoc;

  @Column(name = "dlv_req_dt")
  private java.sql.Timestamp dlvReqDt;

  @Column(name = "size_nm")
  private String sizeNm;

  @Column(name = "plan_unit_prc", columnDefinition = "money")
  private String planUnitPrc;

  @Column(name = "model_nm")
  private String modelNm;

  @Column(name = "mk_comp_nm")
  private String mkCompNm;

  @Column(name = "vat_amt", columnDefinition = "money")
  private String vatAmt;

  @Column(name = "constr_period_inpt_kind")
  private String constrPeriodInptKind;

  @Column(name = "constr_period_rmrk")
  private String constrPeriodRmrk;

  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumns({
          @JoinColumn(name = "rfq_no"),
          @JoinColumn(name = "rfq_seq")
  })
  private List<TbRfqService> rfqServices;

}
