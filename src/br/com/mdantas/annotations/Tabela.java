package br.com.mdantas.annotations;

import java.lang.annotation.*;

/**
 * @author marcelo.dantas
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface Tabela {

    String value();
}
