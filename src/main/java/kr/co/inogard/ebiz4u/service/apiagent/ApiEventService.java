package kr.co.inogard.ebiz4u.service.apiagent;

import kr.co.inogard.ebiz4u.domain.apiagent.ApiEvent;
import kr.co.inogard.ebiz4u.repository.apiagent.ApiEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiEventService {

    @Autowired
    private ApiEventRepository apiEventRepository;

    public List<ApiEvent> getApiEvents(){
        return apiEventRepository.findAll(Sort.by(Sort.Direction.ASC, "regDt"));
    }
}
