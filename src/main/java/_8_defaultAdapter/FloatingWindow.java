package _8_defaultAdapter;

/**
 * Created by Alvin on 2019-08-12.
 */

public class FloatingWindow extends WindowView {

    private FloatingWindow() {
        super();
    }

    public static FloatingWindow getInstance() {
        return new FloatingWindow();
    }

    @Override
    public void onClick(int id) {
        super.onClick(id);
        System.out.println(this.getClass().getSimpleName() + " is Clicked! ");
    }
}
