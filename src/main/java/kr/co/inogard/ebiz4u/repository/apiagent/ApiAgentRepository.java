package kr.co.inogard.ebiz4u.repository.apiagent;

import kr.co.inogard.ebiz4u.domain.apiagent.ApiAgent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApiAgentRepository extends JpaRepository<ApiAgent, String> {
}
