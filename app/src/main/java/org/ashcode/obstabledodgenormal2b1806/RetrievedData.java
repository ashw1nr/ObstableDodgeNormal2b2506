package org.ashcode.obstabledodgenormal2b1806;

import android.util.JsonReader;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RetrievedData {
    private ResponseCharacterModel character;
    @SerializedName("tip") //Not necessarily needed in this case
    private String tip;
    private List<String> tips;
    private String word;
    private List<JsonReader> scores;

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public List<String> getTips() {
        return tips;
    }

    public void setTips(List<String> tips) {
        this.tips = tips;
    }

    public List<JsonReader> getScores() {
        return scores;
    }

    public void setScores(List<JsonReader> scores) {
        this.scores = scores;
    }

    public ResponseCharacterModel getCharacter() {
        return character;
    }

    public void setCharacter(ResponseCharacterModel character) {
        this.character = character;
    }
}
