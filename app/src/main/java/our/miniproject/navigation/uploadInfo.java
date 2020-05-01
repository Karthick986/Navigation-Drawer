package our.miniproject.navigation;

public class uploadInfo {

    public String imageName;
    public String imageURL;
    public uploadInfo() {

    }

    public uploadInfo(String name, String uri) {
        this.imageName = name;
        this.imageURL = uri;
    }

    public String getImageName() {
        return imageName;
    }

    public String getImageURL() {
        return imageURL;
    }
}
