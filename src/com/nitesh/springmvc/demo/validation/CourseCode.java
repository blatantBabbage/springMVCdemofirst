package com.nitesh.springmvc.demo.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

    //define attribute that can be passed to annotation
    //define value and default value for course code
    public String value() default "WIZ";

    //define error message and default error message  for course code
    public String message() default "must start with WIZ";

    //define default groups
    public Class<?>[] groups() default {};

    //define default payload
    public Class<? extends Payload>[] payload() default {};
}
