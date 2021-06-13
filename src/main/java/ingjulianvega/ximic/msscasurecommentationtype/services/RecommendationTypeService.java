package ingjulianvega.ximic.msscasurecommentationtype.services;


import ingjulianvega.ximic.msscasurecommentationtype.web.model.RecommendationType;
import ingjulianvega.ximic.msscasurecommentationtype.web.model.RecommendationTypeDto;
import ingjulianvega.ximic.msscasurecommentationtype.web.model.RecommendationTypeList;

import java.util.UUID;

public interface RecommendationTypeService {
    RecommendationTypeList get(Boolean usingCache);

    RecommendationTypeDto getById(UUID id);

    void create(RecommendationType recommendationType);

    void updateById(UUID id, RecommendationType recommendationType);

    void deleteById(UUID id);
}
