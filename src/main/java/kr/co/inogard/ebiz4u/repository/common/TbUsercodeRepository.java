package kr.co.inogard.ebiz4u.repository.common;

import kr.co.inogard.ebiz4u.domain.common.TbUsercode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TbUsercodeRepository extends JpaRepository<TbUsercode, String> {
    TbUsercode findByLoginId(String loginId);
}
