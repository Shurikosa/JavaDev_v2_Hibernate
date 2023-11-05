package services;

import entities.Planet;
import repositories.PlanetRepository;

public class PlanetService {
    private PlanetRepository plaentRepository = new PlanetRepository();

    public void savePlanet(Planet plaent) {
        plaentRepository.persist(plaent);
    }
    public Planet findPlanetById(Long id) {
        return plaentRepository.getById(id);
    }
    public void mergePlanet(Planet plaent) {
        plaentRepository.merge(plaent);
    }
    public void removePlanet(Planet plaent) {
        plaentRepository.remove(plaent);
    }
}
