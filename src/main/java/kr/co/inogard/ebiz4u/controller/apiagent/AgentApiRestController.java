package kr.co.inogard.ebiz4u.controller.apiagent;

import kr.co.inogard.ebiz4u.domain.apiagent.ApiAgent;
import kr.co.inogard.ebiz4u.domain.apiagent.ApiEvent;
import kr.co.inogard.ebiz4u.domain.apiagent.ApiPrmap;
import kr.co.inogard.ebiz4u.domain.apiagent.ApiPrmapId;
import kr.co.inogard.ebiz4u.service.apiagent.ApiAgentService;
import kr.co.inogard.ebiz4u.service.apiagent.ApiEventService;
import kr.co.inogard.ebiz4u.service.apiagent.ApiPrmapService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AgentApiRestController {

    private final ApiAgentService apiAgentService;
    private final ApiEventService apiEventService;
    private final ApiPrmapService apiPrmapService;



    @GetMapping("/enioapi/apievents")
    public List<ApiEvent> getApiEvents(){
        return apiEventService.getApiEvents();
    }

    @GetMapping("/enioapi/apiprmaps")
    public List<ApiPrmap> getApiPrmaps(){
        return apiPrmapService.getApiPrmaps();
    }

    @GetMapping("/enioapi/apiprmaps/{agtCd}")
    public List<ApiPrmap> getApiPrmaps(@PathVariable String agtCd){
        return apiPrmapService.getApiPrmapByAgtCd(agtCd);
    }

    @GetMapping("/enioapi/apiprmaps/{agtCd}/{e4UPrNo}")
    public ApiPrmap getApiPrmap(@PathVariable String agtCd, @PathVariable String e4UPrNo){
        ApiPrmapId apiPrmapId = new ApiPrmapId(agtCd, e4UPrNo);
        return apiPrmapService.getApiPrMapById(apiPrmapId);
    }

}
