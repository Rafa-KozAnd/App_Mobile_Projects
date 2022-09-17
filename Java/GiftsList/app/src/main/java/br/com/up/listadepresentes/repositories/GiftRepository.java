package br.com.up.listadepresentes.repositories;

import java.util.ArrayList;

import br.com.up.listadepresentes.models.Gift;

public class GiftRepository {

    private static GiftRepository repository;
    private ArrayList<Gift> gifts = new ArrayList<>();

    public static GiftRepository getInstance(){

        if(repository == null){
            repository = new GiftRepository();
        }
        return repository;

    }

    private GiftRepository(){ }

    public void save(Gift gift){
        gifts.add(gift);
    }

    public void delete(Gift gift){
        gifts.remove(gift);
    }

    public ArrayList<Gift> getAll(){
        return gifts;
    }

    public Gift getByIndex(int index){
        return gifts.get(index);
    }

    public void update(int index, Gift gift){
        gifts.set(index,gift);
    }
}
