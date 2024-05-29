package repository;

import java.util.ArrayList;
import java.util.List;

public class GenericRepositoryImpl<T> implements GenericRepository<T> {
    private List<T> itemList = new ArrayList<>();

    @Override
    public void add(T item){
        itemList.add(item);
    }

    @Override
    public void remove(T item){
        itemList.remove(item);
    }

    @Override
    public List<T> findAll(){
        return new ArrayList<>(itemList);
    }

    @Override
    public T findById(int id){
        if (id >= 0 && id < itemList.size()){
            return itemList.get(id);
        }

        return null;
    }
}
