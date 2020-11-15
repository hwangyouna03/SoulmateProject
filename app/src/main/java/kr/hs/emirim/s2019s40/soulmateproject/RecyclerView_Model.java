package kr.hs.emirim.s2019s40.soulmateproject;

public class RecyclerView_Model {

    int image;
    String title, desc;

    int getImage() {
        return this.image;
    }
    String getTitle() {
        return this.title;
    }
    String getDesc(){
        return this.desc;
    }

    RecyclerView_Model(int image, String title, String desc) {
        this.image = image;
        this.title = title;
        this.desc = desc;
    }

}