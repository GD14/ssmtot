package com.rong.ssm.pojo;

import javafx.scene.chart.PieChart;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by GD14 on 2017/8/26.
 */
public class Item {
    private int id;
    @Size(min = 1,max = 30,message = "{items.name.length.error}")
    private String name;
    private double price;
    @NotNull(message = "{items.createTime.isNull}")
    private Date createTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
