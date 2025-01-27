package chall.proj.forum_hub.domain.topico.validadores;

import chall.proj.forum_hub.domain.ValidacaoException;
import chall.proj.forum_hub.domain.topico.DadosTopico;
import chall.proj.forum_hub.domain.topico.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorTitulo implements ValidadoresTopico{

    @Autowired
    private TopicoRepository repository;



    public void validar(DadosTopico dadosTopico) {
        var titulo = dadosTopico.titulo();

        if(titulo.isEmpty()){
            throw new ValidacaoException("Título não pode estar vazio");
        }

        var tituloExiste = repository.acheTitulo(titulo);
        if(tituloExiste){
            throw new ValidacaoException("Título já existe");
        }

    }
}
