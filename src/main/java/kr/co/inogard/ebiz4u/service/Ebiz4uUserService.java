package kr.co.inogard.ebiz4u.service;

import kr.co.inogard.ebiz4u.domain.TbCuscode;
import kr.co.inogard.ebiz4u.domain.TbUsercode;
import kr.co.inogard.ebiz4u.repository.TbCuscodeRepository;
import kr.co.inogard.ebiz4u.repository.TbUsercodeRepository;
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
}
