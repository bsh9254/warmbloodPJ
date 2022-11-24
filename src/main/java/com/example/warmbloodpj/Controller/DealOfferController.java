package com.example.warmbloodpj.Controller;


import com.example.warmbloodpj.Dto.DealOfferRequestDto;
import com.example.warmbloodpj.Dto.ProjectRequestDto;
import com.example.warmbloodpj.Dto.ResponseDto;
import com.example.warmbloodpj.Service.DealOfferService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DealOfferController {

    private final DealOfferService dealOfferService;

    @PostMapping("/dealoffers/{projectsId}")
    public ResponseDto<?> offerDeal(@RequestBody DealOfferRequestDto dealOfferRequestDto, @PathVariable Long projectId)
    {

        return dealOfferService.offerDeal(dealOfferRequestDto,projectId);
    }

}
