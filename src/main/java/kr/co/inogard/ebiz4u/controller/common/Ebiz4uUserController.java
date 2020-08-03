package kr.co.inogard.ebiz4u.controller.common;

import kr.co.inogard.ebiz4u.domain.common.TbCuscode;
import kr.co.inogard.ebiz4u.domain.common.TbUsercode;
import kr.co.inogard.ebiz4u.service.common.Ebiz4uUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Ebiz4uUserController {

    @Autowired
    private Ebiz4uUserService ebiz4uUserService;

    @GetMapping("/user/cuscodes")
    public List<TbCuscode> getCusCodes(){
        return ebiz4uUserService.getCusCodes();
    }

    @GetMapping("/user/usercodes/purorg/{orgCd}")
    public List<TbUsercode> getUsercodePurorgByOrgCd(@PathVariable String orgCd){
        return ebiz4uUserService.getUsercodePurorgByOrgCd(orgCd);
    }

    @GetMapping("/user/usercodes/ids/{loginId}")
    public TbUsercode getUsercodeByLoginId(@PathVariable String loginId){
        return ebiz4uUserService.getUsercodeByLoginId(loginId);
    }

    @GetMapping("/user/usercodes/cds/{userCd}")
    public TbUsercode getUsercodeByUserCd(@PathVariable String userCd){
        return ebiz4uUserService.getUsercodeByUserCd(userCd);
    }

}
