package chall.proj.forum_hub.domain.topico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    @Query("""
        select case when count(t) > 0 then true else false end
        from Topico t
        where t.mensagem = :mensagem
        """)
    boolean acheMensagem(String mensagem);

    @Query("""
        select case when count(t) > 0 then true else false end
        from Topico t
        where t.titulo = :titulo
        """)
    boolean acheTitulo(String titulo);

}
