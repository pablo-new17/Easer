package ryey.easer.plugins.operation.send_sms;

import android.support.annotation.NonNull;

import ryey.easer.commons.C;
import ryey.easer.commons.IllegalStorageDataException;
import ryey.easer.commons.plugindef.ValidData;
import ryey.easer.commons.plugindef.operationplugin.OperationDataFactory;

class SendSmsOperationDataFactory implements OperationDataFactory<SmsOperationData> {
    @NonNull
    @Override
    public Class<SmsOperationData> dataClass() {
        return SmsOperationData.class;
    }

    @NonNull
    @Override
    public SmsOperationData emptyData() {
        return new SmsOperationData();
    }

    @ValidData
    @NonNull
    @Override
    public SmsOperationData dummyData() {
        String destination = "15077707777";
        String content = "mysmscontent";
        return new SmsOperationData(destination, content);
    }

    @ValidData
    @NonNull
    @Override
    public SmsOperationData parse(@NonNull String data, @NonNull C.Format format, int version) throws IllegalStorageDataException {
        return new SmsOperationData(data, format, version);
    }
}
