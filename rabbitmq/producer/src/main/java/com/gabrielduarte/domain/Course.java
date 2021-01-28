package com.gabrielduarte.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class Course {

    private String name;
    private LocalDate startDate;
    private BigDecimal monthlyFee;
    private Boolean active;

}
