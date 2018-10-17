package me.kaelaela.opengraphview.network.model;

import android.net.Uri;

public class OpenGraphObject {

    private String title;
    private String description;
    private String image;
    private String url;
    private String favIconUrl;

    public OpenGraphObject(String url, String title, String description, String image, String favIconUrl) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.url = url;
        this.favIconUrl = favIconUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public String getUrl() {
        return url;
    }

    public String getFavIconUrl() {
        return favIconUrl;
    }

    public String getHost() {
        Uri uri = Uri.parse(url);
        String host = uri.getHost().startsWith("www.") ? uri.getHost().substring(4) : uri.getHost();
        return host;
    }

    public String toString() {
        return "Open Graph Data:" +
                "[title: " + title +
                ", desc: " + description +
                ", image: " + image +
                ", url: " + url +
                ", favIconUrl: " + favIconUrl + "]";
    }

}
