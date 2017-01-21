package com.budget.sbhacks;

/**
 * Created by adityanadkarni on 1/21/17.
 */

import com.google.gson.annotations.SerializedName;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("current_page")
    @Expose
    private Integer currentPage;
    @SerializedName("total_pages")
    @Expose
    private Integer totalPages;
    @SerializedName("total_items")
    @Expose
    private Integer totalItems;
    @SerializedName("photos")
    @Expose
    private List<Photo> photos = null;

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

}
