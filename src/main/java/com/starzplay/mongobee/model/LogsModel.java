package com.starzplay.mongobee.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="logs")
@ToString
public class LogsModel {
    @Id
    private String id;
    private Long userId;
    private String action;
    private String value;
}
