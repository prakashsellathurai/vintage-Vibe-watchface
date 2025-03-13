package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.data.e;
import java.io.IOException;

public final class ParcelFileDescriptorRewinder implements e<ParcelFileDescriptor> {

    /* renamed from: a  reason: collision with root package name */
    public final InternalRewinder f2973a;

    public static final class InternalRewinder {

        /* renamed from: a  reason: collision with root package name */
        public final ParcelFileDescriptor f2974a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f2974a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() {
            ParcelFileDescriptor parcelFileDescriptor = this.f2974a;
            try {
                Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0, OsConstants.SEEK_SET);
                return parcelFileDescriptor;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    public static final class a implements e.a<ParcelFileDescriptor> {
        public final Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }

        public final e b(Object obj) {
            return new ParcelFileDescriptorRewinder((ParcelFileDescriptor) obj);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f2973a = new InternalRewinder(parcelFileDescriptor);
    }

    public final void b() {
    }

    /* renamed from: c */
    public final ParcelFileDescriptor a() {
        return this.f2973a.rewind();
    }
}
