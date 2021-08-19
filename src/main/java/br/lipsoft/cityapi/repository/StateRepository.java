package br.lipsoft.cityapi.repository;

import br.lipsoft.cityapi.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
