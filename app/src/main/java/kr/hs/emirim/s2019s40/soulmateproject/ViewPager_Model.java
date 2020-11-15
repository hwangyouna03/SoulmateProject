package kr.hs.emirim.s2019s40.soulmateproject;

public class ViewPager_Model {

    private int image;
    private String title;
    private String desc;

    public ViewPager_Model(int image, String title, String desc) {
        this.image = image;
        this.title = title;
        this.desc = desc;

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}