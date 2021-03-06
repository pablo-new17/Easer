package ryey.easer.plugins.operation.alarm;

import android.os.Parcel;

import org.junit.Test;

import ryey.easer.plugins.TestHelper;

import static org.junit.Assert.assertEquals;

public class AlarmOperationDataTest {

    @Test
    public void testParcel() {
        AlarmOperationData dummyData = new AlarmOperationDataFactory().dummyData();
        Parcel parcel = TestHelper.writeToParcel(dummyData);
        AlarmOperationData parceledData = AlarmOperationData.CREATOR.createFromParcel(parcel);
        assertEquals(dummyData, parceledData);
    }

}