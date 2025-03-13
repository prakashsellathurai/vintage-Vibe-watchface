package androidx.health.services.client.impl.ipc.internal;

public final class ListenerKey {
    private final Object mListenerKey;

    public ListenerKey(Object obj) {
        this.mListenerKey = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListenerKey)) {
            return false;
        }
        return this.mListenerKey.equals((ListenerKey) obj);
    }

    public int hashCode() {
        return System.identityHashCode(this.mListenerKey);
    }

    public String toString() {
        return String.valueOf(this.mListenerKey);
    }
}
