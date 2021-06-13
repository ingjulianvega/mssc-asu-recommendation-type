package ingjulianvega.ximic.msscasurecommentationtype.services;

import ingjulianvega.ximic.msscasurecommentationtype.configuration.ErrorCodeMessages;
import ingjulianvega.ximic.msscasurecommentationtype.domain.RecommendationTypeEntity;
import ingjulianvega.ximic.msscasurecommentationtype.domain.repositories.RecommendationTypeRepository;
import ingjulianvega.ximic.msscasurecommentationtype.exception.RecommendationTypeException;
import ingjulianvega.ximic.msscasurecommentationtype.web.Mappers.RecommendationTypeMapper;
import ingjulianvega.ximic.msscasurecommentationtype.web.model.RecommendationType;
import ingjulianvega.ximic.msscasurecommentationtype.web.model.RecommendationTypeDto;
import ingjulianvega.ximic.msscasurecommentationtype.web.model.RecommendationTypeList;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Slf4j
@Service
public class RecommendationTypeServiceImpl implements RecommendationTypeService {

    private final RecommendationTypeRepository recommendationTypeRepository;
    private final RecommendationTypeMapper recommendationTypeMapper;

    @Cacheable(cacheNames = "recommendationTypeListCache", condition = "#usingCache == false")
    @Override
    public RecommendationTypeList get(Boolean usingCache) {
        log.debug("get()...");
        return RecommendationTypeList
                .builder()
                .bodyPartList(recommendationTypeMapper.recommendationTypeEntityListToRecommendationTypeDtoList(recommendationTypeRepository.findAllByOrderByName()))
                .build();
    }

    @Cacheable(cacheNames = "recommendationTypeCache")
    @Override
    public RecommendationTypeDto getById(UUID id) {
        log.debug("getById()...");
        return recommendationTypeMapper.recommendationTypeEntityToRecommendationTypeDto(
                recommendationTypeRepository.findById(id)
                        .orElseThrow(() -> new RecommendationTypeException(ErrorCodeMessages.RECOMMENDATION_TYPE_NOT_FOUND, "")));
    }

    @Override
    public void create(RecommendationType recommendationType) {
        log.debug("create()...");
        recommendationTypeMapper.recommendationTypeEntityToRecommendationTypeDto(
                recommendationTypeRepository.save(
                        recommendationTypeMapper.recommendationTypeDtoToRecommendationTypeEntity(
                                RecommendationTypeDto
                                        .builder()
                                        .name(recommendationType.getName())
                                        .build())));
    }

    @Override
    public void updateById(UUID id, RecommendationType recommendationType) {
        log.debug("updateById...");
        RecommendationTypeEntity evidenceEntity = recommendationTypeRepository.findById(id)
                .orElseThrow(() -> new RecommendationTypeException(ErrorCodeMessages.RECOMMENDATION_TYPE_NOT_FOUND, ""));

        evidenceEntity.setName(recommendationType.getName());

        recommendationTypeRepository.save(evidenceEntity);
    }

    @Override
    public void deleteById(UUID id) {
        log.debug("deleteById...");
        recommendationTypeRepository.deleteById(id);
    }
}
