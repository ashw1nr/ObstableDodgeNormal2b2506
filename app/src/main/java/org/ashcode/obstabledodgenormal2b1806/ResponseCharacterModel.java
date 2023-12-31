package org.ashcode.obstabledodgenormal2b1806;

import com.google.gson.annotations.SerializedName;

public class ResponseCharacterModel {
    @SerializedName("name") //Not necessarily needed in this case
    private String name;
    private String description;
    private String type;
    private String imageUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}