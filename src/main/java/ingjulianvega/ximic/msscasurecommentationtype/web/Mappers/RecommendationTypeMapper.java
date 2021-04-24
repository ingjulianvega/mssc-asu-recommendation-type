package ingjulianvega.ximic.msscasurecommentationtype.web.Mappers;


import ingjulianvega.ximic.msscasurecommentationtype.domain.RecommendationTypeEntity;
import ingjulianvega.ximic.msscasurecommentationtype.web.model.RecommendationTypeDto;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper(uses = DateMapper.class)
public interface RecommendationTypeMapper {
    RecommendationTypeDto recommendationTypeEntityToRecommendationTypeDto(RecommendationTypeEntity recommendationTypeEntity);

    RecommendationTypeEntity recommendationTypeDtoToRecommendationTypeEntity(RecommendationTypeDto recommendationTypeDto);

    ArrayList<RecommendationTypeDto> recommendationTypeEntityListToRecommendationTypeDtoList(List<RecommendationTypeEntity> recommendationTypeEntityList);
}
