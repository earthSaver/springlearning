package com.djc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Value("小明")
    private String name;
    @Value("18")
    private int age;
    @Value("95.5")
    private double score;
}
