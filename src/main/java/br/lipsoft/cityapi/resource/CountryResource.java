package br.lipsoft.cityapi.resource;

import br.lipsoft.cityapi.entity.Country;
import br.lipsoft.cityapi.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/countries")
public class CountryResource {

    @Autowired
    private CountryRepository countryRepository;

    @GetMapping("/all")
    public List<Country> getCountries() {
        return countryRepository.findAll();
    }

    @GetMapping
    public Page<Country> getCountriesByPage(Pageable page) {
        return countryRepository.findAll(page);
    }
}
