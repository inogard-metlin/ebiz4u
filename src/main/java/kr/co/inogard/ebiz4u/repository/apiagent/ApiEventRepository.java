package kr.co.inogard.ebiz4u.repository.apiagent;

import kr.co.inogard.ebiz4u.domain.apiagent.ApiEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApiEventRepository extends JpaRepository<ApiEvent, String> {
}
