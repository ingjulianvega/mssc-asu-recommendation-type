package ingjulianvega.ximic.msscasurecommentationtype.domain.repositories;

import ingjulianvega.ximic.msscasurecommentationtype.domain.RecommendationTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface RecommendationTypeRepository extends JpaRepository<RecommendationTypeEntity, UUID>, JpaSpecificationExecutor<RecommendationTypeEntity> {
}
