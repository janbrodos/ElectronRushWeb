package entity;

/**
 * @author: Brotherdos
 * @date: 16.02.2017
 */
public class User extends BaseEntity {
    private int record;

    public User(){}

    public int getRecord() {
        return record;
    }

    public void setRecord(int record) {
        this.record = record;
    }
}
