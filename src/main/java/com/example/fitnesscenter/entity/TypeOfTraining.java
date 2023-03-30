package com.example.fitnesscenter.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "typeoftraining")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class TypeOfTraining {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "trainer_id", nullable = false)
    private Trainer trainer;
    private String type;
}
