package _9_objectAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alvin on 2019-08-22.
 */

public class Stores {

    private List<ModernService> modernServices ;

    private Stores() {
        this.modernServices = new ArrayList<>();
    }

    public static Stores getInstance(){
        return new Stores();
    }

    public void addModernService(ModernService modernService) {
        this.modernServices.add(modernService);
    }

    public void listAllModernService(){
        for (ModernService modernService : modernServices) {
            modernService.executeTakkyubinService();
            modernService.executePrintService();
        }
    }
 }
