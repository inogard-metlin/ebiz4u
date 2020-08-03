package kr.co.inogard.ebiz4u.repository.common;

import kr.co.inogard.ebiz4u.domain.common.TbUsercode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TbUsercodeRepository extends JpaRepository<TbUsercode, String> {
    TbUsercode findByLoginId(String loginId);

    TbUsercode findByUserCd(String userCd);

    @Query(value = "SELECT user FROM TbUsercode user WHERE user.tbPurorg.orgCd = :orgCd")
    List<TbUsercode> findUsercodePurorgByOrgCd(String orgCd);
}
