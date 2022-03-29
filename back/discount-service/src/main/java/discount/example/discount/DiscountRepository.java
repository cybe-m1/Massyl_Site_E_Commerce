package discount.example.discount;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiscountRepository extends JpaRepository<Discount, String> {
    List<Discount> findByNameContaining(String name);
    Discount findByName(String name);
}
