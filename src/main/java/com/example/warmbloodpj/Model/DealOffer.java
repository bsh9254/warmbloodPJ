package com.example.warmbloodpj.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DealOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String OfferPrice;

    @Column(nullable = false)
    private String OfferDate;

    @JoinColumn(name = "projects_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Projects projects;

    @JoinColumn(name = "member_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

}
