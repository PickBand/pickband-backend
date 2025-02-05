package org.pickband.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.pickband.dto.TestMemberDto;
import org.pickband.service.TestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/api")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @PostMapping("/band-member")
    public ResponseEntity<Void> addMember(@RequestBody TestMemberDto memberDto) {
        testService.addMember(memberDto);
        System.out.println(memberDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/band-members")
    public ResponseEntity<List<TestMemberDto>> getMembers() {
        return ResponseEntity.ok(testService.findAll());
    }
}
