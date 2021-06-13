package ingjulianvega.ximic.msscasurecommentationtype.web.controller;


import ingjulianvega.ximic.msscasurecommentationtype.services.RecommendationTypeService;
import ingjulianvega.ximic.msscasurecommentationtype.web.model.RecommendationType;
import ingjulianvega.ximic.msscasurecommentationtype.web.model.RecommendationTypeDto;
import ingjulianvega.ximic.msscasurecommentationtype.web.model.RecommendationTypeList;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class RecommendationTypeController implements RecommendationTypeI {

    private final RecommendationTypeService recommendationTypeService;

    @Override
    public ResponseEntity<RecommendationTypeList> get(Boolean usingCache) {
        return new ResponseEntity<>(recommendationTypeService.get(usingCache), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<RecommendationTypeDto> getById(@NotNull UUID id) {
        return new ResponseEntity<>(recommendationTypeService.getById(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> create(@NotNull @Valid RecommendationType recommendationType) {
        recommendationTypeService.create(recommendationType);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> updateById(@NotNull UUID id, @NotNull @Valid RecommendationType recommendationType) {
        recommendationTypeService.updateById(id, recommendationType);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @Override
    public ResponseEntity<Void> deleteById(@NotNull UUID id) {
        recommendationTypeService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
