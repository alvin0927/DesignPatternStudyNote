package _7_registrySingleton;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alvin on 2019-08-12.
 */
public class SingletonRegistry {

    private static Map<String , Object> registries = new HashMap<>();

    private SingletonRegistry(){

    }

    public static Object getInstance (String singletonName){

        Object object = registries.get(singletonName);
        if(object != null) {
            return object;
        }

        try {
            Class fooClazz = Class.forName(singletonName);
            Constructor constructor = fooClazz.getDeclaredConstructor(); //適合無參數建構子
            constructor.setAccessible(true);
            object = constructor.newInstance();
//            object = Class.forName(singletonName).newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        registries.put(singletonName , object);
        return object;
    }
}
