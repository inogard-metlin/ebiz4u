package kr.co.inogard.ebiz4u.domain.rfq;

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
@Table(name = "tb_rfqservice")
@IdClass(TbRfqServicePK.class)
public class TbRfqService {
    @Id
    @Column(name = "rfq_no", columnDefinition = "char")
    private String rfqNo;

    @Id
    @Column(name = "rfq_seq", columnDefinition = "char")
    private String rfqSeq;

    @Id
    @Column(name = "rfq_srv_seq", columnDefinition = "char")
    private String rfqSrvSeq;

    @Column(name = "srv_nm")
    private String srvNm;

    @Column(name = "pr_no", columnDefinition = "char")
    private String prNo;

    @Column(name = "pr_seq", columnDefinition = "char")
    private String prSeq;

    @Column(name = "pr_srv_seq", columnDefinition = "char")
    private String prSrvSeq;

    @Column(name = "srv_cd", columnDefinition = "char")
    private String srvCd;

    @Column(name = "qty", columnDefinition = "numeric(14,2)")
    private Double qty;

    @Column(name = "unit_cd")
    private String unitCd;


}
