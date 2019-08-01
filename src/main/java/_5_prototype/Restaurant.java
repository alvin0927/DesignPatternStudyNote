package _5_prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alvin on 2019-08-01.
 */

public class Restaurant implements Cloneable {

    private String name;
    private String size;
    private List<Table> tables;

    public Restaurant(String name, String size) {
        this.name = name;
        this.size = size;
        this.tables = new ArrayList<>();
        for(int i = 0 ; i < 5 ; i++){
            tables.add(new Table(String.valueOf(i) , "iron"));
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // shallow clone
        // return super.clone();

        //deep clone
        Restaurant clone =  (Restaurant) super.clone();
        clone.tables = this.tables;
        for(int i = 0 ; i < tables.size(); i++ ){
            clone.tables.set(i , (Table) tables.get(i).clone());
        }
        return clone;
    }

    /**
     * @return the {@link #name}
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the {@link #name} to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the {@link #size}
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the {@link #size} to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return the {@link #tables}
     */
    public List<Table> getTables() {
        return tables;
    }

    /**
     * @param tables the {@link #tables} to set
     */
    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", tables=" + tables.size() +
                '}';
    }
}
