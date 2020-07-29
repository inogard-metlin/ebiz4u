package kr.co.inogard.ebiz4u.service;

import kr.co.inogard.ebiz4u.domain.ApiPrmap;
import kr.co.inogard.ebiz4u.repository.ApiPrmapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiPrmapService {

    @Autowired
    private ApiPrmapRepository apiPrmapRepository;

    public List<ApiPrmap> getApiPrmaps() {
        return apiPrmapRepository.findAll(Sort.by(Sort.Direction.DESC, "regDt"));
    }

    public List<ApiPrmap> getApiPrmapByAgtCd(String agtCd) {
        return apiPrmapRepository.findByAgtCd(agtCd);
    }
}
