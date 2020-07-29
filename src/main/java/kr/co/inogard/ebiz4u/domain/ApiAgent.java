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
@Table(name = "api_agent")
public class ApiAgent {

  @Id
  @Column(name = "agt_cd")
  private String agtCd;

  @Column(name = "licence_key")
  private String licenceKey;

  @Column(name = "agt_conn_url")
  private String agtConnUrl;

  @Column(name = "agt_chrgr_nm")
  private String agtChrgrNm;

  @Column(name = "agt_chrgr_tel")
  private String agtChrgrTel;

  @Column(name = "agt_chrgr_sms")
  private String agtChrgrSms;

  @Column(name = "agt_chrgr_email")
  private String agtChrgrEmail;

  @Column(name = "install_org_nm")
  private String installOrgNm;

  @Column(name = "reg_dt")
  private Timestamp regDt;


}
