package kr.co.inogard.ebiz4u.repository;

import kr.co.inogard.ebiz4u.domain.TbUsercode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TbUsercodeRepository extends JpaRepository<TbUsercode, String> {
    TbUsercode findByLoginId(String loginId);
}
