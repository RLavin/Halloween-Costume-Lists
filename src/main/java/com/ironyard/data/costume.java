package com.ironyard.data;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Raul on 10/12/16.
 */
@Entity
public class costume {
    private String name;
    private int cost;
    private String category;
    private Date date;
    private int count;


    @OneToMany(cascade = CascadeType.ALL)
    private List<props> props;

    @OneToMany(cascade = CascadeType.ALL)
    private List<clothingiteams > clothingiteams;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<com.ironyard.data.props> getProps() {
        return props;
    }

    public void setProps(List<com.ironyard.data.props> props) {
        this.props = props;
    }

    public List<com.ironyard.data.clothingiteams> getClothingiteams() {
        return clothingiteams;
    }

    public void setClothingiteams(List<com.ironyard.data.clothingiteams> clothingiteams) {
        this.clothingiteams = clothingiteams;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
