package com.agrifieldanalytics.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ProductData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "seeds_sown")
    private String seedsSown;
    @Column(name = "price_seeds")
    private String priceSeeds;
    @Column(name = "expenses_fuel")
    private String expensesFuel;
    @Column(name = "price_fuel")
    private String priceFuel;
    @Column(name = "other_expenses")
    private String otherExpenses;
    @Column(name = "total_cost")
    private String totalCost;
    @Column(name = "produced_products")
    private String producedProducts;
    @Column(name = "crop_yield")
    private String cropYield;
    @Column(name = "crop_price")
    private String cropPrice;
    @Column(name = "sold")
    private String sold;
    @Column(name = "revenue")
    private String revenue;
    @Column(name = "sale_sales")
    private String saleSales;
    @Column(name = "date_harvest")
    private String dateHarvest;
    @Column(name = "date_sale")
    private String dateSale;
    @Column(name = "field_id")
    private Long fieldId;
    @Column(name = "culture_id")
    private Long cultureId;
    @Column(name = "sort_id")
    private Long sortId;

}
