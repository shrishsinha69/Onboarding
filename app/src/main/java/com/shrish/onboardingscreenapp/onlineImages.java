package com.shrish.onboardingscreenapp;

public class onlineImages {
    String image;

    public onlineImages(String image, String title) {
        this.image = image;
        this.title = title;
    }

    String title;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
