package com.example.warmbloodpj.Dto;

import com.example.warmbloodpj.Model.Location;
import lombok.Getter;

import javax.persistence.Column;
import java.util.List;

@Getter
public class ProjectRequestDto {

    private String name;

    private String price;

    private String dealClosingDate;

    private String dueDate;

    private String location;

    private List<String> tags;
}
