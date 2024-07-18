package com.vlad.putnikov.entity;

import com.vlad.putnikov.util.YearMonthDateAttributeConverter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.YearMonth;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "experience")
public class Experience {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sequence_number", nullable = false)
    private Integer sequenceNumber;

    @Column(name = "period_from", columnDefinition = "date", nullable = false)
    @Convert(converter = YearMonthDateAttributeConverter.class)
    private YearMonth periodFrom;

    @Column(name = "period_to", columnDefinition = "date", nullable = false)
    @Convert(converter = YearMonthDateAttributeConverter.class)
    private YearMonth periodTo;

    @Column(name = "present_time", nullable = false)
    private boolean presentTime;

    @Column(name = "industry_id", nullable = false)
    private Long industryId;

    @Column(name = "company", nullable = false)
    private String company;

    @Column(name = "position", nullable = false)
    private String position;

    @Column(name = "achievements", nullable = false)
    private String achievements;

    @Column(name = "link", nullable = false)
    private String link;
}
