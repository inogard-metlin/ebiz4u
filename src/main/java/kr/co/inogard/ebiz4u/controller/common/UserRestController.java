package kr.co.inogard.ebiz4u.controller.common;

import kr.co.inogard.ebiz4u.domain.common.TbCuscode;
import kr.co.inogard.ebiz4u.domain.common.TbUsercode;
import kr.co.inogard.ebiz4u.service.common.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRestController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/cuscodes")
    public List<TbCuscode> getCusCodes(){
        return userService.getCusCodes();
    }

    @GetMapping("/user/usercodes/purorg/{orgCd}")
    public List<TbUsercode> getUsercodePurorgByOrgCd(@PathVariable String orgCd){
        return userService.getUsercodePurorgByOrgCd(orgCd);
    }

    @GetMapping("/user/usercodes/cds/{userCd}")
    public TbUsercode getUsercodeByUserCd(@PathVariable String userCd){
        return userService.getUsercodeByUserCd(userCd);
    }

}
