package com.example.warmbloodpj.Model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Getter
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tagName;

    @JoinColumn(name = "projects_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Projects projects;

}
