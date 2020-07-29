package kr.co.inogard.ebiz4u.repository;

import kr.co.inogard.ebiz4u.domain.ApiEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApiEventRepository extends JpaRepository<ApiEvent, String> {
}
