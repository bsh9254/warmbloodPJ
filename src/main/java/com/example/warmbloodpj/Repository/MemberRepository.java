package com.example.warmbloodpj.Repository;

import com.example.warmbloodpj.Model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>
{


}

