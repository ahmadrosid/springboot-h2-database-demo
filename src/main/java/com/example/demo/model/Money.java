package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "moneys")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Money {
    @Id
    private Long id;
    private String name;
    private BigDecimal balance;
}