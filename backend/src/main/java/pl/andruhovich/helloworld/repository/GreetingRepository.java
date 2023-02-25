package pl.andruhovich.helloworld.repository;

import pl.andruhovich.helloworld.entity.Greeting;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends CrudRepository<Greeting, Integer> {
}