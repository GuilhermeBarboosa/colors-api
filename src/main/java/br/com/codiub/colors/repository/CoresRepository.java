package br.com.codiub.colors.repository;

import br.com.codiub.colors.model.entity.Cores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CoresRepository extends JpaRepository<Cores, Long> {

    List<Cores> findAll();

    Optional<Cores> findById(Long id);


}
