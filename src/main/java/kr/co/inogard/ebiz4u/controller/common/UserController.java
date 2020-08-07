package kr.co.inogard.ebiz4u.controller.common;

import kr.co.inogard.ebiz4u.domain.common.TbUsercode;
import kr.co.inogard.ebiz4u.service.common.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/user/usercodes/ids/{loginId}")
    public String getUsercodeByLoginId(@PathVariable String loginId, Model m){
        TbUsercode user = userService.getUsercodeByLoginId(loginId);

        m.addAttribute("tbUser", user);

        return "user/user";
    }
}
