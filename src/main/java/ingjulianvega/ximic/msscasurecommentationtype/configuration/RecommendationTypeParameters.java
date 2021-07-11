package ingjulianvega.ximic.msscasurecommentationtype.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "recommendation-type")
public class RecommendationTypeParameters {

    private String api;
}
