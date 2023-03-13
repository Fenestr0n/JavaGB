package hw_3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class ExtProduct {
    private String name;
    private String country;
    private Double weight;
    private Integer price;
    private Integer sort;
}
