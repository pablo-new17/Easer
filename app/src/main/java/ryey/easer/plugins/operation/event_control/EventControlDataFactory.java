package ryey.easer.plugins.operation.event_control;

import android.support.annotation.NonNull;

import ryey.easer.commons.C;
import ryey.easer.commons.IllegalStorageDataException;
import ryey.easer.commons.plugindef.ValidData;
import ryey.easer.commons.plugindef.operationplugin.OperationDataFactory;

class EventControlDataFactory implements OperationDataFactory<EventControlOperationData> {
    @NonNull
    @Override
    public Class<EventControlOperationData> dataClass() {
        return EventControlOperationData.class;
    }

    @NonNull
    @Override
    public EventControlOperationData emptyData() {
        return new EventControlOperationData();
    }

    @ValidData
    @NonNull
    @Override
    public EventControlOperationData dummyData() {
        EventControlOperationData dummyData = new EventControlOperationData();
        dummyData.eventName = "dummyEventName";
        dummyData.newStatus = false;
        return dummyData;
    }

    @ValidData
    @NonNull
    @Override
    public EventControlOperationData parse(@NonNull String data, @NonNull C.Format format, int version) throws IllegalStorageDataException {
        return new EventControlOperationData(data, format, version);
    }
}
