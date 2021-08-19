package br.lipsoft.cityapi.resource;

import br.lipsoft.cityapi.entity.State;
import br.lipsoft.cityapi.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Pageable;

@RestController
@RequestMapping("api/states")
public class StateResource {

    @Autowired
    private StateRepository stateRepository;

    @GetMapping
    public Page<State> GetStatesByPages(Pageable page) {
        return stateRepository.findAll(page);
    }
}
