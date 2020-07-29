package kr.co.inogard.ebiz4u.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "api_event")
public class ApiEvent {

  @Id
  @Column(name = "evt_no")
  private String evtNo;

  @Column(name = "evt_io_type")
  private String evtIoType;

  @Column(name = "evt_cmd_param")
  private String evtCmdParam;

  @Column(name = "evt_st")
  private String evtSt;

  @Column(name = "reg_dt")
  private Timestamp regDt;

  @Column(name = "req_cntn", columnDefinition = "text")
  private String reqCntn;

  @Column(name = "rslt_cd")
  private String rsltCd;

  @Column(name = "rslt_msg")
  private String rsltMsg;

  @Column(name = "rcv_cntn", columnDefinition = "text")
  private String rcvCntn;

  @Column(name = "rcv_dt")
  private Timestamp rcvDt;

  @ManyToOne
  @JoinColumn(name = "agt_cd")
  private ApiAgent apiAgent;

  @Column(name = "sche_kind")
  private String scheKind;

}
