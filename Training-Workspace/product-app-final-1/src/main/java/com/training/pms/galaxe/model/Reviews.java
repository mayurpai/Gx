package com.training.pms.galaxe.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Lombok Reduces The Length Of Boiler Plate Code Of POJO Classes

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reviews {
    private int reviewId;
    private String comments;
    private int rating;

}
