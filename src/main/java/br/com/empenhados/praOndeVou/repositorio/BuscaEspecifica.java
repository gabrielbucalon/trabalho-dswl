package br.com.empenhados.praOndeVou.repositorio;

import br.com.empenhados.praOndeVou.models.Ponto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuscaEspecifica extends JpaRepository<Ponto,Integer>{

}
