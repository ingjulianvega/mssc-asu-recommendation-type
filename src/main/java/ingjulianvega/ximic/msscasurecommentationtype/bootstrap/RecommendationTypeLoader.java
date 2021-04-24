package ingjulianvega.ximic.msscasurecommentationtype.bootstrap;

import ingjulianvega.ximic.msscasurecommentationtype.domain.RecommendationTypeEntity;
import ingjulianvega.ximic.msscasurecommentationtype.domain.repositories.RecommendationTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@RequiredArgsConstructor
@Component
public class RecommendationTypeLoader implements CommandLineRunner {

    private final RecommendationTypeRepository recommendationTypeRepository;

    @Override
    public void run(String... args) throws Exception {
        if (recommendationTypeRepository.count() == 0) {
            loadRecommendationTypeObjects();
        }
    }

    private void loadRecommendationTypeObjects() {
        recommendationTypeRepository.saveAll(Arrays.asList(
                RecommendationTypeEntity.builder().name("Tipo recomendacion 1").build(),
                RecommendationTypeEntity.builder().name("Tipo recomendacion 2").build(),
                RecommendationTypeEntity.builder().name("Tipo recomendación 3").build()
        ));
    }
}