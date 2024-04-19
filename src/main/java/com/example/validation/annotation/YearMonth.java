package com.example.validation.annotation;

import com.example.validation.validator.YearMonthValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = YearMonthValidator.class)
@Target(value = {ElementType.FIELD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface YearMonth {
    String message() default "날짜 양식이 맞지 않습니다. ex) YYYYMM";

    String regexp() default "(19|20)\\d{2}(0[1-9]|1[0-2])$";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
