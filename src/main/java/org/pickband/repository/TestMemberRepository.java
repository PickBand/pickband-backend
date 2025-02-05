package org.pickband.repository;

import org.pickband.entity.TestMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestMemberRepository extends JpaRepository<TestMember, Long> {
}
