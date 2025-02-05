package org.pickband.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.pickband.dto.TestMemberDto;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TestMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String part;
    private String imageUrl;

    public static TestMember from(TestMemberDto memberDto) {
        return TestMember.builder()
            .name(memberDto.getName())
            .part(memberDto.getPart())
            .imageUrl(memberDto.getImageUrl())
            .build();
    }
}
