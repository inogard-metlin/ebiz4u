package kr.co.inogard.ebiz4u.service;

import kr.co.inogard.ebiz4u.domain.ApiAgent;
import kr.co.inogard.ebiz4u.repository.ApiAgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiAgentService {
    
    @Autowired
    private ApiAgentRepository apiAgentRepository;

    public List<ApiAgent> getApiAgents() {
        return apiAgentRepository.findAll(Sort.by(Sort.Direction.ASC, "agtCd")
                                          .and(Sort.by(Sort.Direction.DESC, "regDt")));
    }

}
