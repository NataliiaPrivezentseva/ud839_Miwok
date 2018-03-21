package com.example.android.miwok;

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mSoundId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String miwokTranslation, String defaultTranslation, int soundId){
        this.mMiwokTranslation = miwokTranslation;
        this.mDefaultTranslation = defaultTranslation;
        this.mSoundId = soundId;
    }

    public Word(String miwokTranslation, String defaultTranslation, int soundId, int imageResourceId) {
        this(miwokTranslation, defaultTranslation, soundId);
        this.mImageResourceId = imageResourceId;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getmSoundId() {
        return mSoundId;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != -1;
    }
}
