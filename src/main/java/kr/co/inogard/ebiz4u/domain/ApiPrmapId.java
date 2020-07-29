package kr.co.inogard.ebiz4u.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class ApiPrmapId implements Serializable {
    @Column(name = "agt_cd")
    private String agtCd;

    @Column(name = "e4u_pr_no")
    private String e4UPrNo;
}
