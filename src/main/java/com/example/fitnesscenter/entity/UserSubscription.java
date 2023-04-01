//package com.example.fitnesscenter.entity;


//import jakarta.persistence.*;
//import lombok.*;
//
//import java.time.LocalDateTime;
//@Entity
//@Table(name = "user-subscription")
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//@ToString
//public class UserSubscription {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//    private LocalDateTime start;
//    private LocalDateTime end;
//    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_id", nullable = false)
//    private User user;
////    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
////    private Subscription subscription;
//    @PrePersist
//    private void init() {
//        start = LocalDateTime.now();
//    }
//}
