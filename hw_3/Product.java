package hw_3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Product {
    private String name;
    private Integer price;
    private Integer sort;
}
