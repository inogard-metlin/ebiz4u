package kr.co.inogard.ebiz4u.controller;

import kr.co.inogard.ebiz4u.common.constant.EvtIoType;
import kr.co.inogard.ebiz4u.domain.ApiAgent;
import kr.co.inogard.ebiz4u.domain.ApiEvent;
import kr.co.inogard.ebiz4u.domain.ApiPrmap;
import kr.co.inogard.ebiz4u.domain.ApiPrmapId;
import kr.co.inogard.ebiz4u.service.ApiAgentService;
import kr.co.inogard.ebiz4u.service.ApiEventService;
import kr.co.inogard.ebiz4u.service.ApiPrmapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AgentApiController {

    @Autowired
    private ApiAgentService apiAgentService;

    @Autowired
    private ApiEventService apiEventService;

    @Autowired
    private ApiPrmapService apiPrmapService;

    @GetMapping("/enioapi/apiagents")
    public List<ApiAgent> getApiAgents(){
        List<ApiAgent> apiAgents = apiAgentService.getApiAgents();
        return apiAgents;
    }

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
