package ru.alitryel.bfmetvennorath.components;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OutputMessage {

    private String text;
    private String sender;
    private Long room;

}
