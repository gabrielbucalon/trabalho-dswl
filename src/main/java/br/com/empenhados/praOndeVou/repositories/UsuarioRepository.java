package br.com.empenhados.praOndeVou.repositories;

import br.com.empenhados.praOndeVou.models.Ponto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Ponto, Long> {
}
