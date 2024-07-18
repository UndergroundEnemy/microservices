package com.vlad.putnikov.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.YearMonth;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExperienceDto {

    private Long id;
    private int sequenceNumber;
    private YearMonth periodFrom;
    private YearMonth periodTo;
    private boolean presentTime;
    private Long industryId;
    private String company;
    private String position;
    private String achievements;
    private String link;
}
