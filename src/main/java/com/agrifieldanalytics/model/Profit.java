package com.agrifieldanalytics.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Profit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name ="gross_profit")
    private int grossProfit;
    @Column(name ="profit_hundredweight")
    private int profitHundredweight;
    @Column(name ="profit_hectare")
    private int profitHectare;
    private int profitability;
    @Column(name ="sold_products")
    private int soldProducts;
    private int revenue;
    @Column(name ="price_per_hundredweight")
    private int pricePerHundredweight;
    @Column(name ="cost_of_sales_of_products")
    private int costOfSalesOfProducts;

}
