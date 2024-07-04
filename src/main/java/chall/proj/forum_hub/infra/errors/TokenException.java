package chall.proj.forum_hub.infra.errors;

public class TokenException extends RuntimeException {
    public TokenException(String mensagem) {
        super(mensagem);
    }
}
