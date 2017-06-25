package com.kawnayeen.alquran.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kawnayeen on 6/18/17.
 */
@Entity(tableName = AyatInfo.TABLE_NAME)
public class AyatInfo {
    public static final String TABLE_NAME = "ayat_info";
    @PrimaryKey
    private String uniqueId;
    private String surahNumber;
    private String ayatNumber;
    @SerializedName("arabic")
    private String arabicText;
    @SerializedName("english")
    private String englishText;
    @SerializedName("bengali")
    private String bengaliText;

    public AyatInfo(String surahNumber, String ayatNumber) {
        this.surahNumber = surahNumber;
        this.ayatNumber = ayatNumber;
        generateUniqueId();
    }

    public void generateUniqueId() {
        uniqueId = surahNumber + ayatNumber;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getSurahNumber() {
        return surahNumber;
    }

    public void setSurahNumber(String surahNumber) {
        this.surahNumber = surahNumber;
    }

    public String getAyatNumber() {
        return ayatNumber;
    }

    public void setAyatNumber(String ayatNumber) {
        this.ayatNumber = ayatNumber;
    }

    public String getArabicText() {
        return arabicText;
    }

    public void setArabicText(String arabicText) {
        this.arabicText = arabicText;
    }

    public String getEnglishText() {
        return englishText;
    }

    public void setEnglishText(String englishText) {
        this.englishText = englishText;
    }

    public String getBengaliText() {
        return bengaliText;
    }

    public void setBengaliText(String bengaliText) {
        this.bengaliText = bengaliText;
    }
}
