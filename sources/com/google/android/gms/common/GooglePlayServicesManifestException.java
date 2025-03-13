package com.google.android.gms.common;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class GooglePlayServicesManifestException extends IllegalStateException {
    public GooglePlayServicesManifestException(@RecentlyNonNull String str) {
        super(str);
    }
}
