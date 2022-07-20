package ro.fasttrackit.serviceproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.serviceproject.model.ServiceApplicationInventory;

public interface ServiceApplicationRepository extends JpaRepository<ServiceApplicationInventory, Long> {
}
