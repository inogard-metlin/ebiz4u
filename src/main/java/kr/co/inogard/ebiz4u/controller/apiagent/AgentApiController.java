package kr.co.inogard.ebiz4u.controller.apiagent;

import kr.co.inogard.ebiz4u.domain.apiagent.ApiAgent;
import kr.co.inogard.ebiz4u.service.apiagent.ApiAgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AgentApiController {

    @Autowired
    private ApiAgentService apiAgentService;

    @GetMapping("/enioapi/apiagents")
    public String getApiAgents(Model m){
        List<ApiAgent> apiAgents = apiAgentService.getApiAgents();

        m.addAttribute("apiAgents", apiAgents);

        return "enio/list";
    }

}
