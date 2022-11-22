package com.example.warmbloodpj.Model;


import com.example.warmbloodpj.Dto.ProjectRequestDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Getter
@Entity
@Builder
@AllArgsConstructor
public class Projects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    //최대 100글자
    private String name;
    @Column(nullable = false)
    private String price;
    @Column(nullable = false)
    private String dealClosingDate;
    @Column(nullable = false)
    private String dueDate;
    @Column(nullable = false)
    private String location;

    @OneToMany(mappedBy = "projects", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Tag> tags;

    public Projects(ProjectRequestDto projectRequestDto)
    {
        this.name=projectRequestDto.getName();
        this.price=projectRequestDto.getPrice();
        this.dealClosingDate= projectRequestDto.getDealClosingDate();
        this.dueDate= projectRequestDto.getDueDate();
        this.location=projectRequestDto.getLocation();

    }

    public void update(ProjectRequestDto projectRequestDto)
    {
        this.name=projectRequestDto.getName();
        this.price=projectRequestDto.getPrice();
        this.dealClosingDate= projectRequestDto.getDealClosingDate();
        this.dueDate= projectRequestDto.getDueDate();
        this.location=projectRequestDto.getLocation();
    }

}
