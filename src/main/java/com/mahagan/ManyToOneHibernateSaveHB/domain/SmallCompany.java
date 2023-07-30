package com.mahagan.ManyToOneHibernateSaveHB.domain;

import jakarta.persistence.*;


@Entity
@Table(name = "small-company")
public class SmallCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int smallcompanyId;
    private String smallcompanyName;
    private String smallcomapanyPopulation;
    @ManyToOne(cascade =
            CascadeType.ALL)
    private AllBigCompany allBigCompany;

    public AllBigCompany getAllBigCompany() {
        return allBigCompany;
    }



    public int getSmallcompanyId() {
        return smallcompanyId;
    }

    public void setSmallcompanyId(int smallcompanyId) {
        this.smallcompanyId = smallcompanyId;
    }

    public String getSmallcompanyName() {
        return smallcompanyName;
    }

    public void setSmallcompanyName(String smallcompanyName) {
        this.smallcompanyName = smallcompanyName;
    }

    public String getSmallcomapanyPopulation() {
        return smallcomapanyPopulation;
    }

    public void setSmallcomapanyPopulation(String smallcomapanyPopulation) {
        this.smallcomapanyPopulation = smallcomapanyPopulation;
    }


    public void setAllBigCompany(AllBigCompany allBigCompany) {
            this.allBigCompany=allBigCompany;
    }
}
