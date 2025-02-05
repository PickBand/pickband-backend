package org.pickband.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.pickband.dto.TestMemberDto;
import org.pickband.entity.TestMember;
import org.pickband.repository.TestMemberRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestService {

    private final TestMemberRepository memberRepository;

    public void addMember(TestMemberDto memberDto) {
        memberRepository.save(TestMember.from(memberDto));
    }

    public List<TestMemberDto> findAll() {
        List<TestMember> members = memberRepository.findAll();
        return members.stream()
            .map(TestMemberDto::from)
            .toList();
    }
}
