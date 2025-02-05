package org.pickband.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import org.pickband.entity.TestMember;

@Getter
@Builder
@ToString
public class TestMemberDto {

    private String name;
    private String part;
    private String imageUrl;

    public static TestMemberDto from(TestMember testMember) {
        return TestMemberDto.builder()
            .name(testMember.getName())
            .part(testMember.getPart())
            .imageUrl(testMember.getImageUrl())
            .build();
    }
}
