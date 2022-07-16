package com.example.exam.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sales")
public class Sale {
    @Id
    private String SlNo;
    private String SalesmanID;
    @ManyToOne
    @JoinColumn(name = "ProdID", referencedColumnName = "ProdId")
    private Product ProdId;
    private String SalesmanName;
    private String DOS;
}
