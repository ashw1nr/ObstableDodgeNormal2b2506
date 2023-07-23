package org.ashcode.obstabledodgenormal2b1806;

import com.google.gson.annotations.SerializedName;

public class RequestCharacterModel {
    @SerializedName("type")
    private String type;

    public RequestCharacterModel() {
        this.type = "player";
    }
}
