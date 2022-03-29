package order.article;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Article {
    private Long id;
    private String name;
    private Float price;
}
