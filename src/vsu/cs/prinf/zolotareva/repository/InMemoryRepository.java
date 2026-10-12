package vsu.cs.prinf.zolotareva.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryRepository<T> {

    private final Map<Long, T> storage = new HashMap<>();

    public void create(Long id, T entity) {
        storage.put(id, entity);
        System.out.println("Создано: " + entity);
    }

    public void update(Long id, T entity) {
        if (storage.containsKey(id)) {
            storage.put(id, entity);
            System.out.println("Обновлено: " + entity);
        } else {
            System.out.println("Ошибка: Сущность с ID " + id + " не найдена!");
        }
    }

    public void delete(Long id) {
        if (storage.containsKey(id)) {
            T removed = storage.remove(id);
            System.out.println("Удалено: " + removed);
        } else {
            System.out.println("Ошибка: Нечего удалять, ID " + id + " не найден.");
        }
    }

    public T getById(Long id) {
        return storage.get(id);
    }

    public List<T> getAll() {
        return new ArrayList<>(storage.values());
    }
}
