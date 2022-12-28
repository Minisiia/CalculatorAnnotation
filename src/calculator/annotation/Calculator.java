package calculator.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation Calculator initializes variables number1 and number2
 * @author Anastesiia Dolbina
 * @version 1.0
 * @since 28-12-2022
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Calculator {
    int number1() default 0;

    int number2() default 0;

}

