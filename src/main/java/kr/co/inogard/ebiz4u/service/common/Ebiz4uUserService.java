package kr.co.inogard.ebiz4u.service.common;

import kr.co.inogard.ebiz4u.domain.common.TbCuscode;
import kr.co.inogard.ebiz4u.domain.common.TbUsercode;
import kr.co.inogard.ebiz4u.repository.common.TbCuscodeRepository;
import kr.co.inogard.ebiz4u.repository.common.TbUsercodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Ebiz4uUserService {
    @Autowired
    private TbCuscodeRepository tbCuscodeRepository;

    @Autowired
    TbUsercodeRepository tbUsercodeRepository;

    public List<TbCuscode> getCusCodes() {
        List<TbCuscode> tbCuscodes = tbCuscodeRepository.findAll();
        return tbCuscodes;
    }

    public TbUsercode getUsercodeByLoginId(String loginId) {
        return tbUsercodeRepository.findByLoginId(loginId);
    }

    public TbUsercode getUsercodeByUserCd(String userCd) {
        return tbUsercodeRepository.findByUserCd(userCd);
    }
}
