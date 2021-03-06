package ryey.easer.plugins.event.broadcast;

import android.os.Parcel;

import org.junit.Test;

import ryey.easer.plugins.TestHelper;

import static org.junit.Assert.assertEquals;

public class BroadcastEventDataTest {

    @Test
    public void testParcel() {
        BroadcastEventData dummyData = new BroadcastEventDataFactory().dummyData();
        Parcel parcel = TestHelper.writeToParcel(dummyData);
        BroadcastEventData parceledData = BroadcastEventData.CREATOR.createFromParcel(parcel);
        assertEquals(dummyData, parceledData);
    }

}