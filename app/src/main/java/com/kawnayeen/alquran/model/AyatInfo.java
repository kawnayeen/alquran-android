package com.kawnayeen.alquran.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by kawnayeen on 6/18/17.
 */
@Entity(tableName = AyatInfo.TABLE_NAME)
public class AyatInfo {
    @PrimaryKey
    private String uniqueId;
    private String surahNumber;
    private String ayatNumber;
    private String arabicText;
    private String englishText;
    private String bengaliText;

    public static final String TABLE_NAME = "ayat_info";

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

    public String getSurahNumber() {
        return surahNumber;
    }

    public String getAyatNumber() {
        return ayatNumber;
    }

    public String getArabicText() {
        return arabicText;
    }

    public String getEnglishText() {
        return englishText;
    }

    public String getBengaliText() {
        return bengaliText;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public void setSurahNumber(String surahNumber) {
        this.surahNumber = surahNumber;
    }

    public void setAyatNumber(String ayatNumber) {
        this.ayatNumber = ayatNumber;
    }

    public void setArabicText(String arabicText) {
        this.arabicText = arabicText;
    }

    public void setEnglishText(String englishText) {
        this.englishText = englishText;
    }

    public void setBengaliText(String bengaliText) {
        this.bengaliText = bengaliText;
    }
}
