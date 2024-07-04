package chall.proj.forum_hub.domain.topico.validadores;

import chall.proj.forum_hub.domain.ValidacaoException;
import chall.proj.forum_hub.domain.topico.DadosTopico;
import org.springframework.stereotype.Component;

@Component
public class ValidadorNomeCurso implements ValidadoresTopico{

    @Override
    public void validar(DadosTopico dadosTopico) {
        var nomeCurso = dadosTopico.curso().getNomeCurso();
        if(nomeCurso.isEmpty()){
            throw new ValidacaoException("Nome do curso não pode estar vazio");
        }

    }
}
