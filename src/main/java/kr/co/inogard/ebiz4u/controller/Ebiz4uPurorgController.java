package kr.co.inogard.ebiz4u.controller;

import kr.co.inogard.ebiz4u.domain.TbPurorg;
import kr.co.inogard.ebiz4u.service.Ebiz4uPurorgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Ebiz4uPurorgController {

    @Autowired
    private Ebiz4uPurorgService ebiz4uPurorgService;

    @GetMapping("/org/purorgs")
    public List<TbPurorg> getPurorgs(){
        return ebiz4uPurorgService.getPurorgs();
    }

    @GetMapping("/org/purorgs/{orgCd}")
    public TbPurorg getPurorgByOrgCd(@PathVariable String orgCd){
        return ebiz4uPurorgService.getPurorgByOrgCd(orgCd);
    }
}
