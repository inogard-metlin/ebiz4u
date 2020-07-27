package kr.co.inogard.ebiz4u.controller;

import kr.co.inogard.ebiz4u.domain.ApiAgent;
import kr.co.inogard.ebiz4u.domain.ApiEvent;
import kr.co.inogard.ebiz4u.service.ApiAgentService;
import kr.co.inogard.ebiz4u.service.ApiEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AgentApiController {

    @Autowired
    private ApiAgentService apiAgentService;

    @Autowired
    private ApiEventService apiEventService;

    @GetMapping("enioapi/apiagents")
    public List<ApiAgent> getApiAgents(){
        List<ApiAgent> apiAgents = apiAgentService.getApiAgents();
        return apiAgents;
    }

    @GetMapping("enioapi/apievents")
    public List<ApiEvent> getApiEvents(){
        return apiEventService.getApiEvents();
    }
}
