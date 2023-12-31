package com.petclinic.services.map;

import com.petclinic.model.BaseEntity;
import jakarta.persistence.Id;

import java.util.*;

public abstract class AbstractMapService <T extends BaseEntity,ID>{
    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object){

        if(object != null) {
            if(object.getId() == null){
                object.setId(getNextId());
            }

            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be null");
        }

        return object;
    }

    void delete(T object) {
        map.remove(object);
    }

    void deleteById(ID id) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(id));
    }
    private Long getNextId(){

        Long nextId = null;

        try {
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            nextId = 1L;
        }

        return nextId;
    }

}
