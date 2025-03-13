package androidx.health.services.client.impl.ipc.internal;

public final class ConnectionConfiguration {
    private final String mBindAction;
    private final String mClientName;
    private final String mPackageName;
    private final QueueOperation mRefreshVersionOperation;

    public ConnectionConfiguration(String str, String str2, String str3, QueueOperation queueOperation) {
        str.getClass();
        this.mPackageName = str;
        str2.getClass();
        this.mClientName = str2;
        str3.getClass();
        this.mBindAction = str3;
        queueOperation.getClass();
        this.mRefreshVersionOperation = queueOperation;
    }

    public String getBindAction() {
        return this.mBindAction;
    }

    public String getClientName() {
        return this.mClientName;
    }

    public String getKey() {
        return String.format("%s#%s#%s", new Object[]{this.mClientName, this.mPackageName, this.mBindAction});
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    public QueueOperation getRefreshVersionOperation() {
        return this.mRefreshVersionOperation;
    }
}
