package ingjulianvega.ximic.msscasurecommentationtype.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecommendationTypeDto implements Serializable {

    static final long serialVersionUID = 7723122634860330293L;

    private UUID id;
    private String name;

}
