package ingjulianvega.ximic.msscasurecommentationtype.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class RecommendationTypeEntity extends BaseEntity {

    private String name;
}
