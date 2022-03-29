package order.order;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import order.article.Article;

@Setter
@Getter
@NoArgsConstructor
public class OrderLine {
    private Article article;
    private int quantity;
}
