package com.hazelcast.samples.spring.data.migration.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.keyvalue.annotation.KeySpace;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@KeySpace
@NoArgsConstructor
@AllArgsConstructor
public class DailyAccumulatorEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String bunnyId;
    private String itemType;
    private Integer value;
    private Date date;

}