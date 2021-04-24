package ingjulianvega.ximic.msscasurecommentationtype.exception;

import lombok.Getter;

@Getter
public class RecommendationTypeException extends RuntimeException {

    private final String code;

    public RecommendationTypeException(final String code, final String message) {
        super(message);
        this.code = code;
    }
}

