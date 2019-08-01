package _5_prototype;

/**
 * Created by Alvin on 2019-08-01.
 */

public class Table implements Cloneable{

    /** 名稱 */
    private String name;
    /** 材質 */
    private String material;

    public Table(String name, String material) {
        this.name = name;
        this.material = material;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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
     * @return the {@link #material}
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the {@link #material} to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }
}
