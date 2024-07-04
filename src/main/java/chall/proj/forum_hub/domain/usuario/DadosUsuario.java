package chall.proj.forum_hub.domain.usuario;

public record DadosUsuario(Long id, String name, String email) {

    public DadosUsuario(Usuario usuario) {
        this(usuario.getId(), usuario.getNome(), usuario.getEmail());
    }
}