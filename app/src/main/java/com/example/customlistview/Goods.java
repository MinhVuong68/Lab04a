package com.example.customlistview;

public class Goods {
    private String nameProduct;
    private String nameStore;
    private int imageGoods;
    private String name;


    public String getNameProduct() {
        return nameProduct;
    }

    public String getNameStore() {
        return nameStore;
    }

    public int getImageGoods() {
        return imageGoods;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setNameStore(String nameStore) {
        this.nameStore = nameStore;
    }

    public void setImageGoods(int imageGoods) {
        this.imageGoods = imageGoods;
    }

    public Goods(String nameProduct, String nameStore, int imageGoods) {
        this.nameProduct = nameProduct;
        this.nameStore = nameStore;
        this.imageGoods = imageGoods;
    }

    public Goods() {
    }


}
