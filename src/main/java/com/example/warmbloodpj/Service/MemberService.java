package com.example.warmbloodpj.Service;


import com.example.warmbloodpj.Dto.MemberRequestDto;
import com.example.warmbloodpj.Dto.ResponseDto;
import com.example.warmbloodpj.Model.Authority;
import com.example.warmbloodpj.Model.Member;
import com.example.warmbloodpj.Repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    //회원 별 기능이 다른데 회원 관리는 어떤 식으로 진행하는지.
    public ResponseDto<?> signup(MemberRequestDto memberRequestDto)
    {
        if(memberRequestDto.getAuthority().equals("ROLE_USER"))
        {
            Member member=Member.builder()
                    .authority(Authority.ROLE_USER)
                    .build();
            memberRepository.save(member);
        }
        else{
            Member member=Member.builder()
                    .authority(Authority.ROLE_ADMIN)
                    .build();
            memberRepository.save(member);
        }


        return ResponseDto.is_Success("Signed up");
    }

}
