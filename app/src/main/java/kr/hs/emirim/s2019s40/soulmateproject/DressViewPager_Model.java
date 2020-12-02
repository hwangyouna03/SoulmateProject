package kr.hs.emirim.s2019s40.soulmateproject;

public class DressViewPager_Model {

    private int image;
    private String title;

    public DressViewPager_Model(int image, String title) {
        this.image = image;
        this.title = title;

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}