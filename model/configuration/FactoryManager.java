package model.configuration;

import tools.Introspection;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Anis on 10/05/2016.
 */
public class FactoryManager implements IFactoryManager {

    private static FactoryManager instance;
    private HashMap<Class<?>, Class<?>> map;

    private List<IFactory> stubList;

    private FactoryManager() {
        map = new HashMap<>();
    }

    public static FactoryManager getInstance() {
        if (instance == null) {
            instance = new FactoryManager();
        }

        return instance;
    }


    @Override
    public <T extends IFactory> void bind(Class<? extends T> type, Class<? extends T> implType) {
        if (type == null || implType == null) throw new IllegalArgumentException();

        map.put(type, implType);
    }

    @Override
    public <T extends IFactory> T getFactory(Class<T> type, Object... args) {
        if ((type != null && map.containsKey(type))) {
            Class<T> implType = (Class<T>) map.get(type);

            String nomClasse = implType.getName();

            try {
                return (T) Introspection.invokeStatic(nomClasse, args, "getInstance");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return null;

    }
}
