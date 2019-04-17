package njuics.demos.petsalon;

import org.springframework.data.jpa.repository.JpaRepository;



public interface ServiceRepository extends JpaRepository<Service, Long> {
}