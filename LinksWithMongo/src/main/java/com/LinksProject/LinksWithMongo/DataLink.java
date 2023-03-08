package com.LinksProject.LinksWithMongo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "LinksInfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataLink {
    @Id
    private ObjectId id;
    private String Source;
    private String URL;
    private int Updated;
    private int MSID;
}
