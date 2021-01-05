package br.com.empenhados.praOndeVou.repositorio;

import br.com.empenhados.praOndeVou.models.Pontos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuscaEspecifica extends JpaRepository<Pontos,Integer>{

}
