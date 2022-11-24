package com.example.warmbloodpj.Repository;

import com.example.warmbloodpj.Model.DealOffer;
import com.example.warmbloodpj.Model.Projects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DealOfferRepository extends JpaRepository<DealOffer, Long>
{


}
