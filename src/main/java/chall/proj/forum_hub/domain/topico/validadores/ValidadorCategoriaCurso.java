package chall.proj.forum_hub.domain.topico.validadores;

import chall.proj.forum_hub.domain.ValidacaoException;
import chall.proj.forum_hub.domain.topico.DadosTopico;
import org.springframework.stereotype.Component;

@Component
public class ValidadorCategoriaCurso implements ValidadoresTopico{

    @Override
    public void validar(DadosTopico dadosTopico) {
        var categoriaCurso = dadosTopico.curso().getCategoria();

        if (categoriaCurso == null) {
            throw new ValidacaoException("Categoria não pode estar vazia");
        }

    }
}
