package kr.co.inogard.ebiz4u.domain.apiagent;

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
@Table(name = "api_prmap")
public class ApiPrmap {

  @EmbeddedId
  private ApiPrmapId apiPrmapId;

  @Column(name = "erp_pr_no")
  private String erpPrNo;

  @Column(name = "reg_dt")
  private Timestamp regDt;

  @Column(name = "prebid_yn")
  private String prebidYn;


}
