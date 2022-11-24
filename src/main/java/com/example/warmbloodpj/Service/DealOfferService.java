package com.example.warmbloodpj.Service;


import com.example.warmbloodpj.Dto.DealOfferRequestDto;
import com.example.warmbloodpj.Dto.ResponseDto;
import com.example.warmbloodpj.Model.Authority;
import com.example.warmbloodpj.Model.DealOffer;
import com.example.warmbloodpj.Model.Member;
import com.example.warmbloodpj.Model.Projects;
import com.example.warmbloodpj.Repository.DealOfferRepository;
import com.example.warmbloodpj.Repository.ProjectsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DealOfferService {

    private final ProjectsRepository projectsRepository;
    private final DealOfferRepository dealOfferRepository;
    @Transactional
    public ResponseDto<?> offerDeal(DealOfferRequestDto dealOfferRequestDto,Long projectId)
    {

        Optional<Projects> optionalProjects=projectsRepository.findById(projectId);
        Projects projects=optionalProjects.get();

        Member member= Member.builder()
                .authority(Authority.ROLE_ADMIN)
                .build();

        DealOffer dealOffer=DealOffer.builder()
                .OfferDate(dealOfferRequestDto.getOfferDate())
                .OfferPrice(dealOfferRequestDto.getOfferPrice())
                .projects(projects)
                .member(member)
                .build();
        dealOfferRepository.save((dealOffer));

        return ResponseDto.is_Success("Deal Offer complete");
    }

}
