package ingjulianvega.ximic.msscasurecommentationtype.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecommendationTypeList implements Serializable {

    static final long serialVersionUID = 6848902180285702234L;

    public ArrayList<RecommendationTypeDto> bodyPartList;
}
