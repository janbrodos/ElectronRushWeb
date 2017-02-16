package entity;

/**
 * @author: Brotherdos
 * @date: 16.02.2017
 */
public class BaseEntity {
    private int id;
    private String name;

    public BaseEntity(){}

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
}
