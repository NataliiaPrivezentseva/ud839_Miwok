package com.example.android.miwok;

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;

    public Word(String miwokTranslation, String defaultTranslation){
        this.mMiwokTranslation = miwokTranslation;
        this.mDefaultTranslation = defaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }
}
