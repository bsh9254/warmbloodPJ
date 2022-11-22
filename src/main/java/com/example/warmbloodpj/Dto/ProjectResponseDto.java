package com.example.warmbloodpj.Dto;


import com.example.warmbloodpj.Model.Tag;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProjectResponseDto {

    private Long id;
    private String name;

    private String price;

    private String dealClosingDate;

    private String dueDate;

    private String location;

    private List<String> tags;
}
