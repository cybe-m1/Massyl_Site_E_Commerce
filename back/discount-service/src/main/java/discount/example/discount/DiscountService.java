package discount.example.discount;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountService {
    private final DiscountRepository discountRepository;

    public DiscountService(DiscountRepository discountRepository){
        this.discountRepository = discountRepository;
    }

    public List<Discount> getAllDiscount(){
        return discountRepository.findAll();
    }

    public Discount getDiscount(String name){
        return discountRepository.findByName(name);
    }
}
