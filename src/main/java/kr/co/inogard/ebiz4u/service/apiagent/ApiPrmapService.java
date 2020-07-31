package kr.co.inogard.ebiz4u.service.apiagent;

import kr.co.inogard.ebiz4u.domain.apiagent.ApiPrmap;
import kr.co.inogard.ebiz4u.domain.apiagent.ApiPrmapId;
import kr.co.inogard.ebiz4u.repository.apiagent.ApiPrmapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public ApiPrmap getApiPrMapById(ApiPrmapId apiPrmapId) {
        Optional<ApiPrmap> optionalApiPrmap = apiPrmapRepository.findById(apiPrmapId);

        if (!optionalApiPrmap.isPresent()) return null;

        return optionalApiPrmap.get();

    }
}
