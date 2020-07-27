package kr.co.inogard.ebiz4u.service;

import kr.co.inogard.ebiz4u.domain.ApiEvent;
import kr.co.inogard.ebiz4u.repository.ApiEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiEventService {

    @Autowired
    private ApiEventRepository apiEventRepository;

    public List<ApiEvent> getApiEvents(){
        return apiEventRepository.findAll(Sort.by(Sort.Direction.DESC, "regDt"));
    }
}
