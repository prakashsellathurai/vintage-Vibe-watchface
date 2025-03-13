package android.support.wearable.complications;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class ComplicationProviderInfo implements Parcelable {
    public static final Parcelable.Creator<ComplicationProviderInfo> CREATOR = new a();
    private static final String KEY_APP_NAME = "app_name";
    private static final String KEY_PROVIDER_COMPONENT_NAME = "provider_component";
    private static final String KEY_PROVIDER_ICON = "provider_icon";
    private static final String KEY_PROVIDER_NAME = "provider_name";
    private static final String KEY_PROVIDER_TYPE = "complication_type";
    private String mAppName;
    private int mComplicationType;
    private ComponentName mProviderComponentName;
    private Icon mProviderIcon;
    private String mProviderName;

    public class a implements Parcelable.Creator<ComplicationProviderInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return new ComplicationProviderInfo(parcel);
        }

        public final Object[] newArray(int i8) {
            return new ComplicationProviderInfo[i8];
        }
    }

    public ComplicationProviderInfo(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(ComplicationProviderInfo.class.getClassLoader());
        this.mAppName = readBundle.getString(KEY_APP_NAME);
        this.mProviderName = readBundle.getString(KEY_PROVIDER_NAME);
        this.mProviderIcon = (Icon) readBundle.getParcelable(KEY_PROVIDER_ICON);
        this.mComplicationType = readBundle.getInt(KEY_PROVIDER_TYPE);
        this.mProviderComponentName = (ComponentName) readBundle.getParcelable(KEY_PROVIDER_COMPONENT_NAME);
    }

    public ComplicationProviderInfo(String str, String str2, Icon icon, int i8, ComponentName componentName) {
        this.mAppName = str;
        this.mProviderName = str2;
        this.mProviderIcon = icon;
        this.mComplicationType = i8;
        this.mProviderComponentName = componentName;
    }

    public int describeContents() {
        return 0;
    }

    public String getAppName() {
        return this.mAppName;
    }

    public int getComplicationType() {
        return this.mComplicationType;
    }

    public ComponentName getProviderComponentName() {
        return this.mProviderComponentName;
    }

    public Icon getProviderIcon() {
        return this.mProviderIcon;
    }

    public String getProviderName() {
        return this.mProviderName;
    }

    public void setAppName(String str) {
        this.mAppName = str;
    }

    public void setComplicationType(int i8) {
        this.mComplicationType = i8;
    }

    public void setProviderComponentName(ComponentName componentName) {
        this.mProviderComponentName = componentName;
    }

    public void setProviderIcon(Icon icon) {
        this.mProviderIcon = icon;
    }

    public void setProviderName(String str) {
        this.mProviderName = str;
    }

    public String toString() {
        return "ComplicationProviderInfo{appName='" + this.mAppName + "', providerName='" + this.mProviderName + "', providerIcon=" + this.mProviderIcon + ", complicationType=" + this.mComplicationType + ", providerComponentName=" + this.mProviderComponentName + '}';
    }

    public void writeToParcel(Parcel parcel, int i8) {
        Bundle bundle = new Bundle();
        bundle.putString(KEY_APP_NAME, this.mAppName);
        bundle.putString(KEY_PROVIDER_NAME, this.mProviderName);
        bundle.putParcelable(KEY_PROVIDER_ICON, this.mProviderIcon);
        bundle.putInt(KEY_PROVIDER_TYPE, this.mComplicationType);
        bundle.putParcelable(KEY_PROVIDER_COMPONENT_NAME, this.mProviderComponentName);
        parcel.writeBundle(bundle);
    }
}
