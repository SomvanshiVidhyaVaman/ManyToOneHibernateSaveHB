package com.mahagan.ManyToOneHibernateSaveHB.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "big_comany")
public class AllBigCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int allbigcompanyId;
    private String bigcompanyName;
    private String bigcompanyPopulation;
    @ManyToOne(cascade = CascadeType.ALL)

    public int getAllbigcompanyId() {
        return allbigcompanyId;
    }

    public void setAllbigcompanyId(int allbigcompanyId) {
        this.allbigcompanyId = allbigcompanyId;
    }

    public String getBigcompanyName() {
        return bigcompanyName;
    }

    public void setBigcompanyName(String bigcompanyName) {
        this.bigcompanyName = bigcompanyName;
    }

    public String getBigcompanyPopulation() {
        return bigcompanyPopulation;
    }

    public void setBigcompanyPopulation(String bigcompanyPopulation) {
        this.bigcompanyPopulation = bigcompanyPopulation;
    }

  }
