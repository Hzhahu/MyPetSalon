package njuics.demos.petsalon;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

import org.springframework.data.jpa.repository.JpaRepository;



public interface OwnerRepository extends JpaRepository<Owner, Long> {
}

