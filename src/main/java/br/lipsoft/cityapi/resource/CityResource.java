package br.lipsoft.cityapi.resource;

import br.lipsoft.cityapi.entity.City;
import br.lipsoft.cityapi.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/cities")
public class CityResource {

    @Autowired
    private CityRepository repository;

    @GetMapping
    public Page<City> getCitiesByPage(Pageable page) {
        return repository.findAll(page);
    }
}
