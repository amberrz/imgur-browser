package edu.cnm.deepdive.imgurbrowser.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Gallery {

  public static class Search {

    private String id;

    @Expose
    private String tittle;

    @Expose
    private String description;

    private long datetime;

    @SerializedName("images_count")
    @Expose
    private int imagesCount;

    @Expose
    private Tag[] tags;

    @Expose
    private Image[] images;

    public String getId() {
      return id;
    }

    public void setId(String id) {
      this.id = id;
    }

    public String getTittle() {
      return tittle;
    }

    public void setTittle(String tittle) {
      this.tittle = tittle;
    }

    public String getDescription() {
      return description;
    }

    public void setDescription(String description) {
      this.description = description;
    }

    public long getDatetime() {
      return datetime;
    }

    public void setDatetime(long datetime) {
      this.datetime = datetime;
    }

    public int getImagesCount() {
      return imagesCount;
    }

    public void setImagesCount(int imagesCount) {
      this.imagesCount = imagesCount;
    }

    public Tag[] getTags() {
      return tags;
    }

    public void setTags(Tag[] tags) {
      this.tags = tags;
    }

    public Image[] getImages() {
      return images;
    }

    public void setImages(Image[] images) {
      this.images = images;
    }

    private Gallery[] data;

    public Gallery[] getData() {
      return data;
    }

    public void setData(Gallery[] data) {
      this.data = data;
    }
  }

}
