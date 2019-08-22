package _9_objectAdapter;

/**
 * Created by Alvin on 2019-08-22.
 */

public class Sample {

    public static void main(String[] args) {
        /** 一般可以利用interface 去達到串接的效果 */
        ModernService modernService = new TraditionalStore("柑仔店1號");
        modernService.executePrintService();
        modernService.executeTakkyubinService();

        System.out.println("==============");

        /** StoreAdapter 則是透過一層轉接實作interface，將原先不相容的物件注入，
         * 再藉由interface的公開方法呼叫被注入物件的相關連的實作方法 */
        Stores stores = Stores.getInstance();
        stores.addModernService(new TraditionalStore("柑仔店2號"));
        stores.addModernService(new StoreAdapter(new FutureStore("未來商店1號")));
        stores.listAllModernService();
    }
}
