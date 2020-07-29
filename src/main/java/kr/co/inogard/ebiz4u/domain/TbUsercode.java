package kr.co.inogard.ebiz4u.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import kr.co.inogard.ebiz4u.common.constant.SelectYN;
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
@Table(name = "tb_usercode")
@JsonIgnoreProperties({"loginPwd", "userSsn"})
public class TbUsercode {
  @Id
  @Column(name = "user_cd", columnDefinition = "char")
  private String userCd;

  @Column(name = "user_nm")
  private String userNm;

  @Column(name = "login_id")
  private String loginId;

  @Column(name = "user_tel")
  private String userTel;

  @Column(name = "login_pwd")
  private String loginPwd;

  @Column(name = "user_ssn")
  private String userSsn;

  @Column(name = "user_sms")
  private String userSms;

  @Column(name = "user_email")
  private String userEmail;

  @Column(name = "reg_dt")
  private Timestamp regDt;

  @Column(name = "user_fax")
  private String userFax;

  @Column(name = "user_typecd", columnDefinition = "char")
  private String userTypecd;

  @Column(name = "admin_flag", columnDefinition = "char")
  @Enumerated(EnumType.STRING)
  private SelectYN adminFlag;

  @Column(name = "access_flag", columnDefinition = "char")
  @Enumerated(EnumType.STRING)
  private SelectYN accessFlag;

  @Column(name = "use_yn", columnDefinition = "char")
  @Enumerated(EnumType.STRING)
  private SelectYN useYn;

  @Column(name = "aprvl_dt")
  private Timestamp aprvlDt;

  @Column(name = "last_dt")
  private Timestamp lastDt;

  @OneToOne
  @JoinColumn(name = "dept_cd", columnDefinition = "char")
  private TbPurorgdept purorgdept;

  @Column(name = "grade_cd", columnDefinition = "char")
  private String gradeCd;

  @Column(name = "dept_rmrk")
  private String deptRmrk;

  @ManyToOne
  @JoinColumn(name = "cus_cd", columnDefinition = "char")
  private TbCuscode tbCuscode;

  @ManyToOne
  @JoinColumn(name = "org_cd", columnDefinition = "char")
  @JsonIgnoreProperties({"tbCuscode"})
  private TbPurorg tbPurorg;

  @Column(name = "user_st", columnDefinition = "char")
  private String userSt;

  @Column(name = "user_certdn")
  private String userCertdn;

  @Column(name = "cert_expire_dt")
  private Timestamp certExpireDt;

  @Column(name = "sms_rcv_yn", columnDefinition = "char")
  @Enumerated(EnumType.STRING)
  private SelectYN smsRcvYn;

  @Column(name = "email_rcv_yn", columnDefinition = "char")
  @Enumerated(EnumType.STRING)
  private SelectYN emailRcvYn;

  @Column(name = "xi_sts", columnDefinition = "char")
  private String xiSts;

  @Column(name = "xi_date", columnDefinition = "char")
  private String xiDate;

  @Column(name = "xi_time", columnDefinition = "char")
  private String xiTime;

  @Column(name = "user_tel_st", columnDefinition = "char")
  private String userTelSt;

  @Column(name = "sms_notify", columnDefinition = "char")
  @Enumerated(EnumType.STRING)
  private SelectYN smsNotify;

  @Column(name = "sms_result", columnDefinition = "char")
  @Enumerated(EnumType.STRING)
  private SelectYN smsResult;

  @Column(name = "sms_contract", columnDefinition = "char")
  @Enumerated(EnumType.STRING)
  private SelectYN smsContract;

  @Column(name = "sms_bill", columnDefinition = "char")
  @Enumerated(EnumType.STRING)
  private SelectYN smsBill;

  @Column(name = "del_yn", columnDefinition = "char")
  @Enumerated(EnumType.STRING)
  private SelectYN delYn;

  @Column(name = "user_certtype", columnDefinition = "char")
  private String userCerttype;

  @Column(name = "user_frgn_flag", columnDefinition = "char")
  private String userFrgnFlag;

  @Column(name = "user_tel_ext")
  private String userTelExt;

  @Column(name = "grade_nm")
  private String gradeNm;

  @Column(name = "cert_key")
  private String certKey;

  @Column(name = "ipin_di")
  private String ipinDi;

  @Column(name = "sex")
  private String sex;

  @Column(name = "birth_ymd")
  private String birthYmd;

  @Column(name = "pwd_fail_cnt", columnDefinition = "char")
  private String pwdFailCnt;

  @Column(name = "pwd_mod_dt")
  private Timestamp pwdModDt;

  @Column(name = "lock_dt")
  private Timestamp lockDt;

  @Column(name = "agency")
  private String agency;

  @Column(name = "userbiz_typecd", columnDefinition = "char")
  private String userbizTypecd;

  @Column(name = "sleep_accnt_yn")
  @Enumerated(EnumType.STRING)
  private SelectYN sleepAccntYn;

  @Column(name = "agreement_dt")
  private Timestamp agreementDt;

  @Column(name = "pbm_type")
  private String pbmType;


}
