package amazon.app.backend.Entity.Response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponse {
    private Long id;
    private String name;
    private String description;
    private double price;
    private String imageUrl;
    private int unitsInStock;
    private String brandName;
    private String productCode;
    private String categoryName;
    
    public ProductResponse(Long id, String name, String description, double price, int unitsInStock, String brandName,
            String productCode, String categoryName) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.unitsInStock = unitsInStock;
        this.brandName = brandName;
        this.productCode = productCode;
        this.categoryName = categoryName;
    }

    
}