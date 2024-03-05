package patrick.math.orderConsumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import patrick.math.orderConsumer.model.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, String> {

}

