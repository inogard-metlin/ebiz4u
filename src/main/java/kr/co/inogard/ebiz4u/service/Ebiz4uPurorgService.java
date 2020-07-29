package kr.co.inogard.ebiz4u.service;

import kr.co.inogard.ebiz4u.domain.TbPurorg;
import kr.co.inogard.ebiz4u.repository.TbPurorgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Ebiz4uPurorgService {
    @Autowired
    private TbPurorgRepository tbPurorgRepository;

    public List<TbPurorg> getPurorgs() {
        return tbPurorgRepository.findAll();
    }

    public TbPurorg getPurorgByOrgCd(String orgCd) {
        return tbPurorgRepository.findByOrgCd(orgCd);
    }
}
