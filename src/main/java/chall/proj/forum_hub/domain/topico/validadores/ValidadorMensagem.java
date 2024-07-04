package chall.proj.forum_hub.domain.topico.validadores;

import chall.proj.forum_hub.domain.ValidacaoException;
import chall.proj.forum_hub.domain.topico.DadosTopico;
import chall.proj.forum_hub.domain.topico.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorMensagem implements ValidadoresTopico{

    @Autowired
    private TopicoRepository repository;

    @Override
    public void validar(DadosTopico dadosTopico) {
        var mensagem = dadosTopico.mensagem();

        if(mensagem.isEmpty()){
            throw new ValidacaoException("Mensagem não pode estar vazia");
        }

        var mensagemExiste = repository.acheMensagem(mensagem);
        if(mensagemExiste){
            throw new ValidacaoException("Mensagem já existe");
        }


    }
}
