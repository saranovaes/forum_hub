package chall.proj.forum_hub.domain.curso;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = CategoriaDeserializer.class)
public enum Categoria {
    TECNOLOGIA,
    ARTES,
    ADMINISTRACAO;

}
